package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Dialog dialog = new English();

        Sprog sprog = new Sprog();

        while (!   getString(dialog.quit() ).equalsIgnoreCase("q") )  {
            if(getString("change language ?").equalsIgnoreCase("y")) {
                StringBuilder sb = new StringBuilder();
                sprog.getAll().forEach((key,value)
                        -> sb.append(key)
                        .append(" = ")
                        .append(value.getLanguage())
                        .append("\n"));
                sb.append("Pick language code");
                dialog = sprog.SkiftSprog(getString(sb.toString()));
            }
            System.out.println(dialog.selectedLanguage() + " " + dialog.getLanguage());
            System.out.println();
        }


    }

    public static String getString(String s) {

        Scanner scanner = new Scanner(System.in);

        System.out.print(s + ": ");

        return scanner.nextLine();

    }
}
