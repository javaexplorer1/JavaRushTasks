package com.javarush.task.task25.task2506;

public class LoggingStateThread extends Thread {
    private Thread thread;

    public LoggingStateThread(Thread thread) {
        this.thread = thread;
        setDaemon(true);
    }

    @Override
    public void run() {
        Thread.State state = thread.getState();
        System.out.println(state);
        while (true) {
            Thread.State newState = thread.getState();
            if (!newState.equals(state)) {
                System.out.println(newState);
                state = newState;
            } else if (newState.equals(State.TERMINATED)) {
                break;
            }

        }
    }
}
