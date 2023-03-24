package com.startjava.leasson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private String name;
    private final int[] attempts;

    private int count;

    public Player(String name) {
        this.name = name;
        this.attempts = new int[10];
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public int[] getAttempts() {
        return Arrays.copyOf(attempts, count);
    }

    public void addAttempt(int guess) {
        attempts[count++] = guess;
    }

    public void clearAttempts() {
        Arrays.fill(attempts, 0, count, 0);
        count = 0;
    }
}
