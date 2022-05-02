package threads.examples;

public class Example3 extends Thread
{
    public void run ()
    {
        for (int i = 0; i <= 5; i++)
        {
         System.out.println("Run: " + i);
        }
    }
    public static void main (String[]args)
    {
    	System.out.println("Example3");
    	Example3 mt = new Example3();
        mt.start();
        mt.run();
        for (int i = 0; i <= 5; i++)
        {
         System.out.println("Main: " + i);
        }
    }
}