package com.javarush.task.task25.task2505;

/* 
Без дураков
*/

public class Solution {

    public static void main(String[] args) {
        MyThread myThread = new Solution().new MyThread("super secret key");
        myThread.start();
    }


    public class MyThread extends Thread {
        private String secretKey;

        public MyThread(String secretKey) {
            this.secretKey = secretKey;
            setUncaughtExceptionHandler(new MyUncaughtExceptionHandler());
//            setDaemon(true);
        }

        @Override
        public void run() {
            throw new NullPointerException("it's an example");
        }

        private class MyUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
            public MyUncaughtExceptionHandler() {
            }

            public void uncaughtException(Thread t, Throwable e) {
                String formatMessage = String.format("%s, %s, %s", secretKey, t.getName(), e.getMessage());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
                System.out.println(formatMessage);
            }
        }
    }



}

