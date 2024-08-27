package Week_4;

import java.lang.Thread;

public class multithreadingWeek4
{
    // Method to be executed by a thread
    public static void threadMethod()
    {
        System.out.println("Thread 3 is running");
    }

    public static void main(String[] args)
    {
        // Creating a thread using an anonymous inner class and lambda expression
        Thread thread1 = new Thread(() -> System.out.println("Thread 1 is running"));
        thread1.start();

        // Creating a thread using a Runnable interface and lambda expression
        Runnable runnable = () -> System.out.println("Thread 2 is running");
        Thread thread2 = new Thread(runnable);
        thread2.start();

        // Creating a thread using a method reference
        Thread thread3 = new Thread(multithreadingWeek4::threadMethod);
        thread3.start();

        // Getting thread information
        System.out.println("Thread 1 name: " + thread1.getName());
        System.out.println("Thread 2 is alive: " + thread2.isAlive());

        // Pausing a thread using sleep
        try
        {
            Thread.sleep(10000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        // Interrupting a thread
//        thread3.interrupt();
        try
        {
            thread3.join();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
