package com.book.text;

import java.util.Scanner;

public class GuessWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int exit;
        do {
            String word = getWord();
            StringBuilder guess = new StringBuilder();
            String user;
            guess.append("*".repeat(word.length()));//将word等价替换为*，其中String.repeat（int）为jdk11引入的新方法；jdk8，可用for循环替换此语句；
            do {
                System.out.print("(guess) Enter a letter in word " + guess + " >");
                user = input.next();
                if (word.contains(user)) {
                    int index = word.indexOf(user);
                    do {
                        guess = new StringBuilder(guess.substring(0, index) + user + guess.substring(index + 1));
                        index = word.indexOf(user, index + 1);
                    } while (index != -1);
                }
            } while (!word.equals(guess.toString()));//当用户输入完全符合时，结束此次猜词
            System.out.print("yeah，it is " + guess + "\nnext?(y/n):");
            exit = (input.next().contains("y")) ? 0 : 1;//用于判断程序是否结束
        } while (exit == 0);
    }
//从数组中获得一个随机的单词
    public static String getWord() {
        String[] word = {"hello", "world", "java", "learn", "love", "sky", "ten", "weather", "point", "github", "google", "baidu", "China"};
        int a = (int) (Math.random() * word.length);
        return word[a];
    }
}
