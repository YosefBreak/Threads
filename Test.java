package com.threads;

public class Test {

    public static void main(String[] args) {
        int
                threads_arr_length = 12;

        Stack new_st = new Stack();

        Thread[] threads_arr = new Thread[threads_arr_length];

        for (int i = 0; i < threads_arr_length / 2; i++) {
            threads_arr[i] = new Thread(new Producer(new_st), "W" + i);
        }

        for (int i = threads_arr_length / 2; i < threads_arr_length; i++) {
            threads_arr[i] = new Thread(new Consumer(new_st), "W" + i);
        }

        for (int i = 0; i < threads_arr_length ; i++) {
            threads_arr[i].start();
        }


        for (int i = 0; i < threads_arr_length ; i++) {
            try {
                threads_arr[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        new_st.print();
    }
}
