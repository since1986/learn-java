package com.github.since1986.learn.java;

public class LearnRoundRobin {

    public static void main(String[] args) throws InterruptedException {
        int length = 9;
        int current = length - 1;

        while (true) {
            current = (current + 1) % length;
            System.out.println(current);
            Thread.sleep(2000);
        }
    }
}
