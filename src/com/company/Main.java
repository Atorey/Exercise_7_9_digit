package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int oneDigit = 0, twoDigit = 0, threeDigit = 0, moreDigit = 0;

        System.out.print("Insert a number: ");
        String finish = scan.next();

        while (!finish.equals("end")) {
            int input = Integer.parseInt(finish);

            if (input != 0) {
                if (input / 10 == 0)
                    oneDigit++;
                else if (input / 100 == 0)
                    twoDigit++;
                else if (input / 1000 == 0)
                    threeDigit++;
                else
                    moreDigit++;
            }
            finish = scan.next();
        }

        System.out.println("one: " + oneDigit + ", two: " + twoDigit + ", three: " + moreDigit + ", more: " + moreDigit);
    }
}
