package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        String board[][] = new String[3][3];
        Scanner kbReader = new Scanner(System.in);
        boolean continuee = true;

        int r = 0;
        int c = 0;
        for(int i = 1; i < 10; i++){
            board[r][c] = Integer.toString(i);
            if(c != 2){
                c++;
            }
            else if(c == 2) {
                c = 0;
                r++;
            }
        }

        System.out.println("Hi, welcome to tic-tac-toe. Please choose a place to play according to the number in each square.");
        System.out.println();
        //board set up cuz i dont feel like figuring out a normal way to do it
        System.out.println(" " + board[0][0] + "  " + "|" + "  " + board[0][1] + "  " + "|" + "  " + board[0][2]);
        System.out.println("---------------");
        System.out.println(" " + board[1][0] + "  " + "|" + "  " + board[1][1] + "  " + "|" + "  " + board[1][2]);
        System.out.println("---------------");
        System.out.println(" " + board[2][0] + "  " + "|" + "  " + board[2][1] + "  " + "|" + "  " + board[2][2]);



            while(continuee){
                int response = kbReader.nextInt();
                //player
                if(response == 1 && !board[0][0].equals("O")){
                    board[0][0] = "X";
                }
                else if(response == 2 && !board[0][1].equals("O")){
                    board[0][1] = "X";
                }
                else if(response == 3 && !board[0][2].equals("O")){
                    board[0][2] = "X";
                }
                else if(response == 4 && !board[1][0].equals("O")){
                    board[1][0] = "X";
                }
                else if(response == 5 && !board[1][1].equals("O")){
                    board[1][1] = "X";
                }
                else if(response == 6 && !board[1][2].equals("O")){
                    board[1][2] = "X";
                }
                else if(response == 7 && !board[2][0].equals("O")){
                    board[2][0] = "X";
                }
                else if(response == 8 && !board[2][1].equals("O")){
                    board[2][1] = "X";
                }
                else if(response == 9 && !board[2][2].equals("O")){
                    board[2][2] = "X";
                }
                else {
                    System.out.println("dude you cant be doing that");
                    break;
                }
                //ai first time
                if(response != 5 && board[1][1].equals("5")) {
                    board[1][1] = "O";
                }
                else if(response == 5 && board[0][0].equals("1") ) {
                    board[0][0] = "O";
                }

                System.out.println(" " + board[0][0] + "  " + "|" + "  " + board[0][1] + "  " + "|" + "  " + board[0][2]);
                System.out.println("---------------");
                System.out.println(" " + board[1][0] + "  " + "|" + "  " + board[1][1] + "  " + "|" + "  " + board[1][2]);
                System.out.println("---------------");
                System.out.println(" " + board[2][0] + "  " + "|" + "  " + board[2][1] + "  " + "|" + "  " + board[2][2]);
            }

    }
}
