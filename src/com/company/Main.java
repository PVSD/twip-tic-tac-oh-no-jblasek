package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        String board[][] = new String[3][3];
        Scanner kbReader = new Scanner(System.in);
        boolean continuee = true;
        int r = 0;
        int c = 0;
        Random ran = new Random();

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

            int counter = 0;

            while(continuee){
                //checks to see if the board is filled
                if(counter == 9){
                    System.out.println("AYYYYYYYYYYE YALL GOT A TIE.");
                    continuee = false;
                    break;
                }

                //records response
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
                counter++;
                System.out.println(counter);

                //ai first time
                if(counter == 1){
                    if(response != 5 && board[1][1].equals("5")) {
                        board[1][1] = "O";
                    }
                    else if(response == 5 && board[0][0].equals("1") ) {
                        board[0][0] = "O";
                    }
                }

                else if(counter >= 2){
                    int worked = 0;
                    while (worked < 1) {

                        int random = ran.nextInt(9) + 1;

                        if (random == 1 && board[0][0].equals("1")) {
                            board[0][0] = "O";
                            worked++;
                        }
                        else if (random == 2 && board[0][1].equals("2")) {
                            board[0][1] = "O";
                            worked++;
                        }
                        else if (random == 3 && board[0][2].equals("3")) {
                            board[0][2] = "O";
                            worked++;
                        }
                        else if (random == 4 && board[1][0].equals("4")) {
                            board[1][0] = "O";
                            worked++;
                        }
                        else if (random == 5 && board[1][1].equals("5")) {
                            board[1][1] = "O";
                            worked++;
                        }
                        else if (random == 6 && board[1][2].equals("6")) {
                            board[1][2] = "O";
                            worked++;
                        }
                        else if (random == 7 && board[2][0].equals("7")) {
                            board[2][0] = "O";
                            worked++;
                        }
                        else if (random == 8 && board[2][1].equals("8")) {
                            board[2][1] = "O";
                            worked++;
                        }
                        else if (random == 9 && board[2][2].equals("9")) {
                            board[2][2] = "O";
                            worked++;
                        }
                        else if (counter == 8){
                            break;
                        }
                    }
                    counter++;
                    System.out.println(counter);
                }

                System.out.println(" " + board[0][0] + "  " + "|" + "  " + board[0][1] + "  " + "|" + "  " + board[0][2]);
                System.out.println("---------------");
                System.out.println(" " + board[1][0] + "  " + "|" + "  " + board[1][1] + "  " + "|" + "  " + board[1][2]);
                System.out.println("---------------");
                System.out.println(" " + board[2][0] + "  " + "|" + "  " + board[2][1] + "  " + "|" + "  " + board[2][2]);

                //horizontal X win
                int xHori = 0;
                for(int i = 0; i < 9; i++) {
                    if (i % 3 == 0 && i != 0) {
                        xHori = 0;
                    }
                    if(board[i/3][i%3].equals("X")) {
                        xHori++;
                        if (xHori == 3) {
                            System.out.println("X Wins!");
                            continuee = false;
                            break;
                        }
                    }
                }
                //horizontal

                //vertical X win
                int xVert = 0;
                for(int i = 0; i < 9; i++) {
                    if (i % 3 == 0 && i != 0) {
                        xVert = 0;
                    }
                    if(board[i%3][i/3].equals("X")) {
                        xVert++;
                        if (xVert == 3) {
                            System.out.println("X Wins!");
                            continuee = false;
                            break;
                        }
                    }
                }
                //vertical




                //horizontal O win
                int oHori = 0;
                for(int i = 0; i < 9; i++) {
                    if (i % 3 == 0 && i != 0) {
                        oHori = 0;
                    }
                    if(board[i/3][i%3].equals("O")) {
                        oHori++;
                        if (oHori == 3) {
                            System.out.println("O Wins!");
                            continuee = false;
                            break;
                        }
                    }
                }
                //horizontal

                //vertical O win
                int oVert = 0;
                for(int i = 0; i < 9; i++) {
                    if (i % 3 == 0 && i != 0) {
                        oVert = 0;
                    }
                    if(board[i%3][i/3].equals("O")) {
                        oVert++;
                        if (oVert == 3) {
                            System.out.println("O Wins!");
                            continuee = false;
                            break;
                        }
                    }
                }
                //vertical

                //diagonal left
                if( (board[0][0].equals("X") && board[1][1].equals("X") && board[2][2].equals("X")) || (board[0][0].equals("O") && board[1][1].equals("O") && board[2][2].equals("O")) ) {
                    if(board[0][0].equals("X")){
                        System.out.println("X Wins!");
                    }
                    else if(board[0][0].equals("O")){
                        System.out.println("O Wins!");
                    }
                    continuee = false;
                    break;
                }
                else if( (board[0][2].equals("X") && board[1][1].equals("X") && board[2][0].equals("X")) || (board[0][2].equals("O") && board[1][1].equals("O") && board[2][0].equals("O")) ){
                    if(board[0][2].equals("X")){
                        System.out.println("X Wins!");
                    }
                    else if(board[0][2].equals("O")){
                        System.out.println("O Wins!");
                    }
                    continuee = false;
                    break;
                }
                //diagonal

            }
    }
}
