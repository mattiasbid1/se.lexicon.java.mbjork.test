package org.example;

import java.util.Scanner;

public class SecondConverter {

    public static void main(String[] args) {

        // test test
        Scanner scan = new Scanner(System.in);
        System.out.print("Input seconds: ");
        int seconds = scan.nextInt();

        int hours = seconds / 3600;
        int mins = (seconds % 3600) / 60;
        int secs = (seconds % 3600) % 60;

        System.out.println(hours + ":" + mins + ":" + secs);





    }
}
