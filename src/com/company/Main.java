package com.company;

public class Main {

    public static void main(String[] args) {
	String array [] = new String [9];
        for(int i = 0; i < 9; i++) {
            array[i] = " ";
        }
        array[0] = "x";
            for(int i = 0; i < 9; i++) {
                if(i % 3 == 0 && i != 0) {
                    System.out.println("\n" + "-------------");
                }
                    System.out.print(array[i]);
                if(i == 2 || i == 5 || i == 8) {
                    int nothingHappens;
                }
                else {
                    System.out.print("\t" +  "|");
                }
        }



    }
}
