package com.javarush.task.task20.task2022;

import java.io.*;

/* 
Переопределение сериализации в потоке
*/

public class Solution implements Serializable, AutoCloseable {
    private transient FileOutputStream stream;
    private String fileName;

    public Solution(String fileName) throws FileNotFoundException {
        this.stream = new FileOutputStream(fileName);
        this.fileName = fileName;
    }

    public void writeObject(String string) throws IOException {
        stream.write(string.getBytes());
        stream.write("\n".getBytes());
        stream.flush();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        stream = new FileOutputStream(fileName, true);
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing everything!");
        stream.close();
    }

    public static void main(String[] args) throws IOException {
        String file1 = "C:\\Downloads\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task20\\task2022\\file1.txt";
        String file2 = "C:\\Downloads\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task20\\task2022\\file2.txt";
        try (FileOutputStream fileOutput = new FileOutputStream(file2);
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutput)) {
            Solution solution = new Solution(file1);
            solution.writeObject("Hallo");
            outputStream.writeObject(solution);
            outputStream.flush();
            FileInputStream fileInput = new FileInputStream(file2);
            ObjectInputStream inputStream = new ObjectInputStream(fileInput);
            Solution loadSolution = (Solution) inputStream.readObject();
            loadSolution.writeObject("World");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
