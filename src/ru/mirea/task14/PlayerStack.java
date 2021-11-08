package ru.mirea.task14;

import java.util.Scanner;
import java.util.Stack;
import java.util.stream.*;
import java.lang.System;

public class PlayerStack {
    private String name;
    // Create Integer type stack
    Stack<Integer> postTray = new Stack<Integer>();

    public PlayerStack(String name) {
        this.name = name;
    }

    public PlayerStack() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addCardsToPostTray(Integer card) {
        if (card > 0 && card < 10) {
            this.postTray.push(card);
        } else if (card == 0) {
            this.postTray.push(10);
        } else {
            System.out.println("Something wrong.");
        }
    }

    public void rebuildPostTray(Integer cardBigger, Integer cardSmaller) {
        Stack<Integer> postTrayTemp = new Stack<>();

        while (!this.postTray.isEmpty()) {
            postTrayTemp.push(postTray.pop());
        }

        this.postTray.push(cardSmaller);
        this.postTray.push(cardBigger);

        while (!postTrayTemp.isEmpty()) {
            this.postTray.push(postTrayTemp.pop());
        }
    }

    public void showCards() {
        if (!this.postTray.isEmpty()) {
            System.out.print("Cards of player " + this.name + " (bottom to top): ");
            Stream<Integer> playerStream = this.postTray.stream();
            playerStream.forEach((element) ->
            {
                if(element != 10){
                    System.out.print(" " + element);
                } else {
                    System.out.print(" " + 0);
                }
            });
        } else {
            System.out.print("Cards of player " + this.name + " empty.");
        }
    }

}