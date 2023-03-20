package com.startjava.leasson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] attempts;

    private int count = 10;

    public Player(String name) {
        this.name = name;
        this.attempts = new int[10];
    }

    public String getName() {
        return name;
    }

    public int[] getAttempts() {
        return Arrays.copyOf(attempts, attempts.length);
    }

    public void addAttempt(int guess) {
        for (int i = 0; i < attempts.length; i++) {
            if (attempts[i] == 0) {
                attempts[i] = guess;
                return;
            }
        }
    }

    public void clearAttempts() {
        Arrays.fill(attempts, 0, count, 0);
    }
}
