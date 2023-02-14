package com.javarush.task.task14.task1419;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.nio.channels.AcceptPendingException;
import java.nio.channels.AlreadyConnectedException;
import java.nio.file.FileSystemNotFoundException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeoutException;


/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        exceptions.add(new IOException());
        exceptions.add(new InterruptedIOException());
        exceptions.add(new RuntimeException());
        exceptions.add(new AcceptPendingException());
        exceptions.add(new FileSystemNotFoundException());
        exceptions.add(new SQLException());
        exceptions.add(new AlreadyConnectedException());
        exceptions.add(new ClassCastException());
        exceptions.add(new TimeoutException());




    }
}
