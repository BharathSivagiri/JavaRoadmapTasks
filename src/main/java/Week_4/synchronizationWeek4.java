package Week_4;

import java.lang.Thread;

public class synchronizationWeek4
{

    // A simple counter class without synchronization
    class Counter
    {
        private int count = 0;

        public void increment()
        {
            count++;
        }

        public int getCount()
        {
            return count;
        }
    }

    // A counter class with synchronization
    class SynchronizedCounter
    {
        private int count = 0;

        public synchronized void increment()
        {
            count++;
        }

        public synchronized int getCount()
        {
            return count;
        }
    }

    public static void main(String[] args)
    {
        Counter counter = new synchronizationWeek4().new Counter();
        SynchronizedCounter synchronizedCounter = new synchronizationWeek4().new SynchronizedCounter();

        // Without synchronization, multiple threads can access and modify the counter simultaneously
        Thread thread1 = new Thread(() ->
        {
            for (int i = 0; i < 10000; i++)
            {
                counter.increment();
            }
        });

        Thread thread2 = new Thread(() ->
        {
            for (int i = 0; i < 10000; i++)
            {
                counter.increment();
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println("Counter without synchronization: " + counter.getCount()); // May not be 20000

        // With synchronization, only one thread can access the increment method at a time
        Thread synchronizedThread1 = new Thread(() ->
        {
            for (int i = 0; i < 10000; i++)
            {
                synchronizedCounter.increment();
            }
        });

        Thread synchronizedThread2 = new Thread(() ->
        {
            for (int i = 0; i < 10000; i++)
            {
                synchronizedCounter.increment();
            }
        });

        synchronizedThread1.start();
        synchronizedThread2.start();

        try
        {
            synchronizedThread1.join();
            synchronizedThread2.join();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println("Counter with synchronization: " + synchronizedCounter.getCount()); // Always 20000
    }
}
