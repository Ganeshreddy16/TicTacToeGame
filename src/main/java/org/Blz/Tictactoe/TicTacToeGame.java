package org.Blz.Tictactoe;

import java.util.Scanner;

public class TicTacToeGame {
    public static char[] board = new char[10];
    public static char Userchoice, ComputerChoice;


    public static void choiceFilling() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter X or O");
        Userchoice = input.next().charAt(0);
        if (Userchoice == 'x' || Userchoice == 'o' || Userchoice == 'X' || Userchoice == 'O')
            System.out.println("Your Input is taken");
        else
            System.out.println("Enter Correct choice");

        if (Userchoice == 'x' || Userchoice == 'X')
            ComputerChoice = 'O';
        else if (Userchoice == 'O' || Userchoice == 'o')
            ComputerChoice = 'X';
        System.out.println("Your choice is " + Userchoice + "\nComputers choice is " + ComputerChoice);

    }

    public static void fillingEmpty() {
        for (int i = 0; i < 10; i++)
            board[i] = ' ';

    }

    public static void main(String[] args) {
        choiceFilling();
    }


}
