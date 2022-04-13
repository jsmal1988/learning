package threads.examples;

public class Example2 extends Thread
{
    public void run ()
    {
        for (int i = 0; i <= 50; i++)
        {
         System.out.println ("Run: " + i);
        }
    }
    public static void main (String[]args) throws InterruptedException
    {
    	Example2 mt = new Example2();
        mt.run();
        mt.start();
        //if here we remove mt.join then mt.start and for loop under join will run concurently
        mt.join();
        for (int i = 0; i <= 50; i++)
        {
         System.out.println ("Main: " + i);
        }
    }
}
