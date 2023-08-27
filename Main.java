package org.example;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                Random random = new Random();

                int lowValue = 0;
                int highValue = 50;
                int numberToGuess = random.nextInt(highValue) + lowValue;
                int noOfGuess = 0;
                boolean correctGuesses= false;

                System.out.println("Welcome to the Number Guessing Game...");
                System.out.println("Iam thinking  a number between " + lowValue + " and " + highValue + ". Can you guess?");

                while (!correctGuesses) {
                    System.out.print("Enter your guess value: ");
                    int userGuess = sc.nextInt();
                    noOfGuess ++;

                    if (userGuess > numberToGuess) {
                        System.out.println("You guessed value is high.");
                    } else if (userGuess < numberToGuess) {
                        System.out.println("You guessed value low.");
                    } else {
                        correctGuesses = true;
                        System.out.println("Congratulations! You are guessed the number in " + noOfGuess + " guesses");
                    }

                }
        System.out.println("click for new game");
            }

        }
