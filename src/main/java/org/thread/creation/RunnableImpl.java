package org.thread.creation;

public class RunnableImpl implements Runnable {
    int count;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {

            count++;
        }
    }
}
