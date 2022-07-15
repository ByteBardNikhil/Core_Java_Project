
package Lock;


public class Lock_2 {
    public static void main(String[] args) {
        Processor_2 p1=new Processor_2();
        Thread t1=new Thread(p1,"t1");
        Thread t2=new Thread(p1,"t2");
        t1.start();
        t2.start();
        
    }
}
class Processor_2 implements Runnable {
    Object Object_lock;
   public Processor_2(){
       
       Object_lock=new Object();
   }
    public void run(){
     display();   
    }
    private void display(){
        synchronized(Object_lock){
            System.out.println("Object Lock for Thread "+Thread.currentThread().getName()+" has started : ");
            for(int i=0;i<=5;i++)
            {
                System.out.println(" i : "+i+" Thread : "+Thread.currentThread().getName());
            }
            System.out.println("Object lock for Thread : "+Thread.currentThread().getName()+" has Ended");
        }
    }
    
}
/*
Point to be noted
for both thread t1 and t2 there is one command object lock object because
Processor object's constructor is executed at the time of object creation
Thus "object lock" ensures that all the threads depending on the same object are synchronized.
*/