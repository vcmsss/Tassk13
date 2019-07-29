package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        System.out.print("Text: ");
        String a = in.nextLine();
        int x = a.length();

        System.out.print("Text 2: ");
        String b = in.nextLine();
        int y = b.length();


        if(x>y)
            System.out.print(a);

        else if(x<y)
            System.out.print(b);

        else
            System.out.println("Строки равны");

    }

}