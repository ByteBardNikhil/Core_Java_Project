
package Code;

public class Threads {
    
  public void sleep()
  {
      try{
      Thread.sleep(10000);
      }
      catch(InterruptedException e)
      {
          System.out.println(e);
      }
  }
   public void waiting()
  {
      try{
      wait(10000);
      }
      catch(InterruptedException e)
      {
          System.out.println(e);
      }
  }
}
