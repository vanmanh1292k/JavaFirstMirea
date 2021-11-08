package ru.mirea.task14;
import java.util.Scanner;
import java.util.LinkedList;

public class TestDoubleList {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("""
                The rules of the 'drunkard' game:\s
                \t1) There are 10 cards in the game with values from 0 to 9, the larger card wins the smaller one, card <<0>> beats card <<9>> .
                \t2) In this game, a deck of cards is dealt equally to two players.\s
                \t3) Then they reveal one of the top cards, and the one whose card is higher takes both of them open the cards that are put under the bottom of his deck. Anyone who is left without cards loses.
                \t4) For simplicity, we will assume that all cards are different in value and that the lowest card the highest card wins (“six takes ace”).
                \t5) The player who draws his cards first puts the first player's card under the bottom of his deck, then the second player's card (that is, the second player's card is at the bottom of the deck).\s""");
        System.out.println("Using a double list");
        LinkedList<Integer> firstPlayerDl = new LinkedList<>();
        System.out.println("Enter the cards of the first player");
        for (int i = 0; i < 5; i++) {
            firstPlayerDl.add(keyboard.nextInt());
        }
        LinkedList<Integer> secondPlayerDl = new LinkedList<>();
        System.out.println("Enter the cards of the second player");
        for (int i = 0; i < 5; i++) {
            secondPlayerDl.add(keyboard.nextInt());
        }
        System.out.println("Result: " + DoubleList.game(firstPlayerDl, secondPlayerDl) + "\n\n");
    }
}