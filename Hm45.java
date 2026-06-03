
package hm45;


public class Hm45 extends Thread  {

   
    public static void main(String[] args) throws InterruptedException {
       for (int i=1;i<=5;i++)
       {
           System.out.println(i);
           Thread.sleep(2000);
       }
    }
    
}
