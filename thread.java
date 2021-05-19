package com.company;

import java.io.*;

public class ThreadTester {  // at least one class and the class here is 'Main'

    public static void main(String[] args) { // this statement is compulsory
	// write your code here
        Runnable threadJob = new MyRunnable();
        Thread myThread = new Thread(threadJob);

        myThread.start();
        System.out.println("back in main");

    }
}

public class MyRunnable implements Runnable{
    public void run(){
        go();
    }
    public void go(){
        doMore();
    }
    public void doMore(){
        System.out.println("top o the stack");
    }
}

