package com.javarush.task.jdk13.task34.task3408;

import java.lang.reflect.InvocationTargetException;

public class Generator<T> {

    private Class<T> clazz;

    public Generator(Class<T> aClass) {
        clazz = aClass;
    }

    T newInstance() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        return clazz.getDeclaredConstructor().newInstance();

    }
}
