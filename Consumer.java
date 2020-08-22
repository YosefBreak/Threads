package com.threads;

/*
mission description :
* Create com.threads.Consumer
* implement Runnable
* add CTOR that accepts and keeps the stack override run() to :
    1- pop  20  values from the stack .
    2-sleep for random period.
 */


import java.util.Random;

public class Consumer implements Runnable {

    private Stack stack;

    public Consumer(Stack stack) {
        this.stack = stack;
    }

    @Override
    public void run() {

        int [] arr = new int [20];
        Random rand = new Random();

        for (int i = 0 ; i < 20 ; i++) {

            try {
                this.stack.pop();
            } catch (EmptyExpection emptyExpection) {
                emptyExpection.printStackTrace();
            }

            try {

                Thread.sleep(rand.nextInt(500));

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
