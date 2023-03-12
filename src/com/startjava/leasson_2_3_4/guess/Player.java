package com.startjava.leasson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] attempts;

    public Player(String name) {
        this.name = name;
        this.attempts = new int[10];
    }

    public String getName() {
        return name;
    }

    public int[] getAttempts() {
        return Arrays.copyOf(attempts, getNumGuesses());
    }

    public int getNumGuesses(){
        int count = 0;
        for (int guess: attempts) {
            if (guess != 0){
                count++;
            }
        }
        return count;
    }

    public void addGuess(int guess, int numGuesses) {
        attempts[numGuesses - 1] = guess;
    }

    public void resetGuesses() {
        Arrays.fill(attempts, 0, getNumGuesses(), 0);
    }
}
