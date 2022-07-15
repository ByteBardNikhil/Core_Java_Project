
package Lock;

/*Let's squeeze some lemon to add a tangy taste to our previous program
modifying the previous code
*/
public class Lock_3 {
    public static void main(String[] args) {
        Object objLock=new Object();
        
        Processor_3 p1=new Processor_3(objLock);
        Processor_3 p2=new Processor_3(objLock);
        Thread t1=new Thread(p1,"t1");
        Thread t2=new Thread(p2,"t2");
        t1.start();
        t2.start();
    }
}
class Processor_3 implements Runnable{
    Object objLock;
    public Processor_3(Object objLock){
        this.objLock=objLock;
    }
    public void run(){
        display();
    }
    public void display(){
        synchronized(objLock)
        {
            System.out.println("Object Lock for Thread "+Thread.currentThread().getName()+" has Started ");
            for(int i=0;i<=5;i++)
            {
                System.out.println(" i : "+i+" Thread Name : "+Thread.currentThread().getName());
            }
            System.out.println("Object Lock for Thread "+Thread.currentThread().getName()+" has Ended ");
            System.out.println("");    
        }
        
    }
}
/*The two Threads with two different object has been synchronized
Hence two or more threads will synchronize if they have one and only one object lock in Comman

*/
