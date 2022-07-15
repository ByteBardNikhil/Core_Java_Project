
package Lock;

/*In this Program, we will see how object lock can help synchronize 
threads that are created out of two different objects which belong to 
totally different classes*/
public class Lock_4 {
    public static void main(String[] args) {
        Object objLock=new Object();
        Processor_4 p1=new Processor_4(objLock);
        Memory      m1=new Memory(objLock);
        Thread t1=new Thread(p1,"t1");
        Thread t2=new Thread(m1,"t2");
        t1.start();
        t2.start();
        
        
    }
    
}
class Processor_4 implements Runnable{
    Object objLock;
    public Processor_4(Object objLock){
        this.objLock=objLock;
    }
    public void run(){
        display();
    }
    private void display(){
   synchronized(objLock){
       System.out.println("Class Processor_4 Block of Thread : "+Thread.currentThread().getName()+" has started ");
       
       for(int i=0;i<=5;i++)
       {
           System.out.println(" i : "+i+" Thread : "+Thread.currentThread().getName());
       }
       System.out.println("Class Processor_4 block of Thread : "+Thread.currentThread().getName());
       System.out.println("");
   }
    }
}
class Memory implements Runnable{
    Object objLock;
    public Memory(Object objLock)
    {
        this.objLock=objLock;
    }
    public void run(){
        display();
    }
    private void display(){
    synchronized(objLock){
            System.out.println("Class Memory Block of Thread : "+Thread.currentThread().getName()+" has started ");
       
       for(int i=0;i<=5;i++)
       {
           System.out.println(" i : "+i+" Thread : "+Thread.currentThread().getName());
       }
       System.out.println("Class Memory block of Thread : "+Thread.currentThread().getName());
   
    }
    }
    
    
}