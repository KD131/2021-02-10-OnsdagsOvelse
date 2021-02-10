package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Dialog dialog = new English();

        Sprog sprog = new Sprog();

        while (!   getString(dialog.quit() ).equalsIgnoreCase("q") )  {


            if(getString("change language ?").equalsIgnoreCase("y")) {

                dialog = sprog.SkiftSprog(getString("da / eng"));

            }
            System.out.println(dialog.selectedLanguage() + " " + dialog.getLanguage());

        }


    }

    public static String getString(String s) {

        Scanner scanner = new Scanner(System.in);

        System.out.print(s + " : ");

        return scanner.nextLine();

    }
}
