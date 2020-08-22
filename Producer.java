package com.threads;
/*
mission description :
* Create com.threads.Producer
* implement Runnable
* add CTOR that accepts and keeps the stack override run() to :
    1- generate 20 random values.
    2-push all to the stack.
    3-sleep for random period.
 */


import java.util.Random;

public class Producer implements Runnable{

    private  Stack stack;

    public Producer ( Stack stack)
    {
        this.stack = stack;
    }

    @Override
    public void run() {
        int [] arr = new int [20];
        Random rand = new Random();
        for ( int i = 0 ; i < 20 ; i++)
        {
            arr[i] = rand.nextInt(100*i+10);
        }

        for ( int i : arr)
        {
            this.stack.push(i);
            try
            {
                Thread.sleep(rand.nextInt(500));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
