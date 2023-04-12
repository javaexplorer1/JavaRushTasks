package com.javarush.task.task20.task2002;

import java.io.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/* 
Читаем и пишем в файл: JavaRush
*/

public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File yourFile = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            JavaRush javaRush = new JavaRush();
            User user = new User();
            user.setFirstName("Иван");
            user.setLastName("Иванов");
            user.setBirthDate(new Date(80, Calendar.NOVEMBER, 12));
            user.setMale(true);
            user.setCountry(User.Country.RUSSIA);

            javaRush.users.add(user);

            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);

            System.out.println(loadedObject.equals(javaRush));

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            try (PrintWriter printWriter = new PrintWriter(outputStream)) {
                if (users.size() > 0) {
                    for (User user : users) {
                        String string = user.getFirstName() + " " + user.getLastName() + " " + user.getBirthDate().getTime() +
                                " " + user.isMale() + " " + user.getCountry().getDisplayName();
                        printWriter.println(string);
                    }
                }
            }
        }

        public void load(InputStream inputStream) throws Exception {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
                String string;
                while ((string = reader.readLine()) != null) {
                    User user = new User();
                    String[] strings = string.split(" ");
                    if (strings.length < 5) {
                        break;
                    }
                    user.setFirstName(strings[0]);
                    user.setLastName(strings[1]);
                    user.setBirthDate(new Date(Long.parseLong(strings[2])));
                    user.setMale(Boolean.parseBoolean(strings[3]));
                    user.setCountry(User.Country.valueOf(strings[4].toUpperCase()));
                    users.add(user);
                }
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
