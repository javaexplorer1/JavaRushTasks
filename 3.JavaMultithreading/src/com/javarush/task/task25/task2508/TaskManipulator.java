package com.javarush.task.task25.task2508;

public class TaskManipulator implements Runnable, CustomThreadManipulator {

    private Thread thread;

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
//            throw new RuntimeException(e);     // delete new RuntimeException
        }
    }

    @Override
    public void start(String threadName) {
        TaskManipulator taskManipulator = new TaskManipulator();
        thread = new Thread(taskManipulator, threadName);
        thread.start();


    }

    @Override
    public void stop() {
        thread.interrupt();

    }
}
