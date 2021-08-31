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
    public static void Displayboard()
    {
        System.out.println("Board is here!!\n");
        System.out.println("_____________");
        System.out.println("| "+board[1]+" | "+board[2]+" | "+board[3]+" | ");
        System.out.println("_____________");
        System.out.println("| "+board[4]+" | "+board[5]+" | "+board[6]+" | ");
        System.out.println("_____________");
        System.out.println("| "+board[7]+" | "+board[8]+" | "+board[9]+" | ");
        System.out.println("_____________");
    }

    public static void fillingEmpty() {
        for (int i = 0; i < 10; i++)
            board[i] = ' ';

    }

    public static void main(String[] args) {
        fillingEmpty();
        choiceFilling();
        Displayboard();
    }


}
