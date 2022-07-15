/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lock;


public class Lock_1{
   
    public static void main(String[] args) {
          Processor p1=new Processor();
    Thread t1=new Thread(p1,"t1");
    Thread t2=new Thread(p1,"t2");
        t1.start();
        t2.start();
    }
   
}
class Processor implements Runnable{
    public void run(){
        display();
    }
    
    public void display(){
        
        synchronized(this)
        {System.out.println("Object Lock started for Thread : "+Thread.currentThread().getName());
       
        for(int i=0;i<=5;i++)
        {
            System.out.println(" i : "+i+" In thread "+Thread.currentThread().getName());
        }
          System.out.println("Object Lock Ended for : "+Thread.currentThread().getName());
        System.out.println("");
        }
              
}
}

