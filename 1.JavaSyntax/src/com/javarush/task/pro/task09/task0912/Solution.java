package com.javarush.task.pro.task09.task0912;

/* 
Проверка URL-адреса
*/

public class Solution {
    public static void main(String[] args) {
        String[] urls = {"https://javarush.ru", "https://google.com", "http://wikipedia.org", "facebook.com", "https://instagram", "codegym.cc"};
        for (String url : urls) {
            String protocol = checkProtocol(url);
            String domain = checkDomain(url);

            System.out.println("У URL-адреса - " + url + ", сетевой протокол - " + protocol + ", домен - " + domain);
        }
    }

    public static String checkProtocol(String url) {
        String protocol = "неизвестный";
        int index = url.indexOf(":");
        if (index >= 0) {
            protocol = url.substring(0, index);
        }
        return protocol;
    }

    public static String checkDomain(String url) {
        String domain = "неизвестный";
        String domEnd = "";
        int index = url.lastIndexOf(".");
        if (index >= 0) {
            domEnd = url.substring(index + 1);
            if (domEnd.equalsIgnoreCase("com") || domEnd.equalsIgnoreCase("net") || domEnd.equalsIgnoreCase("org") || domEnd.equalsIgnoreCase("ru")) {
                domain = domEnd;
            }
        }
        return domain;
    }
}
