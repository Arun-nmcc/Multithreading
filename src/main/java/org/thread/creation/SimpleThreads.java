package org.thread.creation;

public class SimpleThreads {


     static void startSimpleThreads() {
        Thread thread1 = new Thread(

                () -> {
                    for (int i = 0; i < 10; i++) {

                        System.out.println(Thread.currentThread().getName() + "  " + i);
                    }
                }
        );
        Thread thread2 = new Thread(

                () -> {
                    for (int i = 0; i < 10; i++) {

                        System.out.println(Thread.currentThread().getName() + "  " + i);
                    }
                }
        );

        ChildThread childThread = new ChildThread();
        childThread.setName("child thread");
        childThread.start();
        thread1.setName("thread1");
        thread2.setName("thread2");
         thread2.start();
         thread1.start();


    }

}