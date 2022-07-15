
package Lock;


public class Lock_5 {
    public static void main(String[] args) {
      Object objLock=new Object();
      Processor_5 p1=new Processor_5("p1",objLock);
      Processor_5 p2=new Processor_5("p2",objLock);
      Thread t1=new Thread(p1,"t1");
      Thread t2=new Thread(p1,"t2");
      Thread t3=new Thread(p2,"t3");
      Thread t4=new Thread(p2,"t4");
      t1.start();
      t2.start();
      t3.start();
      t4.start();
      /*There are in total 4 threads now t1 and t2 will race for acquiring lock
      for object p1 and t3 and t4 will race for acquiring lock for p2 objext 
      now let's suppose t1 and t3 wins the race and then again t1 and t3 will race for 
      acquiring object lock for their respective objects ,let t1 wins the race 
      then the t1 will be executed and then t3 and then so on the thread will work*/
    }
}
class Processor_5 implements Runnable{
    Object objLock;
    String name;
    public Processor_5(String name,Object objLock){
        this.objLock=objLock;
        this.name=name;
        
    }
    public void run(){
        display();
        
    }
    private void display(){
        synchronized(this){
            System.out.println("Enters this block "+name+" Thread Name : "+Thread.currentThread().getName());
            System.out.println("");
            synchronized(objLock){
                System.out.println("Enters Object Lock : "+name+" Thread Name : "+Thread.currentThread().getName());  
            for(int i=0;i<=5;i++)
            {
                System.out.println("i : "+i+" In Thread "+Thread.currentThread().getName()
                +" acquired lock on this i.e : "+name+" objLock ");
            }
                System.out.println("Exits ObjLock "+name+" Thread Name : "+Thread.currentThread().getName());
                System.out.println("");
            }
            System.out.println("Exits this block "+name+" Thread Name : "+Thread.currentThread().getName());
            System.out.println("");
        }
    }
       
}
