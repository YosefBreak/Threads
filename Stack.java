package com.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
                                    Thread Task by Yosef.
* Synchronized stack implementation
    - List<Interger> nums : ArrayList<>()

* Stack class support the following methods:
    +push (int) - insert value to the list.
    +pop() : removes and returns last value from the list protect ArrayList
        by making the stack thread-safe.
    +print() : printing the stack values.


 */
public class Stack {

    private List<Integer> ls ;

    public Stack()
    {
        ls = new ArrayList<Integer>();
    }

    public synchronized void  push (int num )
    {
        System.out.println(" Added value of " + num);
        this.ls.add(num);
    }

    public synchronized int pop () throws EmptyExpection {
    if(ls.isEmpty())
    {
        throw new EmptyExpection ( "The_Stack_is_empty");
    }
    int last = ls.get(ls.size()-1);
    System.out.println(" Removed value of  " + last);

    return last;
    }


    public void print ()
    {
        System.out.print(ls);
    }





}
