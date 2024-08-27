package Week_4;

public class daemonthreadsWeek4
{
    public static void main(String[] args)
    {
        // Create a daemon thread
        Thread daemonThread = new Thread(() -> {
            while (true)
            {
                System.out.println("Daemon thread is running...");
                try
                {
                    Thread.sleep(1000);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        });

        // Set the thread as a daemon
        daemonThread.setDaemon(true);

        // Start the daemon thread
        daemonThread.start();

        // Main thread does something here
        System.out.println("Main thread is running...");
        try
        {
            Thread.sleep(5000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println("Main thread is exiting...");
    }
}