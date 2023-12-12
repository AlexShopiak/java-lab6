/*
 * Printer
 *
 * Version 1.0
 *
 * (c) 2023 Oleksii Shopiak
 * All rights reserved.
 *
 * Printer class allows us to print info about necklase
 */
package stones;

import java.util.ArrayList;

class Printer {
    private static final String BOLD_STR = "\u001B[1m";
    private static final String BOLD_END = "\u001B[0m";

    static void printNecklace(String title, ArrayList<Stone> necklace, int weight, int price) {
        System.out.println(BOLD_STR + title + BOLD_END + "-".repeat(43 - title.length()));

        for (Stone stone : necklace) {
            String sName = stone.getClass().getSimpleName();
            int sWeight = stone.getWeight();
            int sClarity = stone.getClarity();
            int sPrice = stone.getPrice();

            printRow(sName, sWeight, sClarity, sPrice);
        }

        printResultRow("Total", weight, price);
    }

    private static void printRow(String name, int weight, int clarity, int price) {
        System.out.print(String.format(" %-9s ", name));
        System.out.print(String.format("%10s ", weight + " carats"));
        System.out.print(String.format("%10s ", clarity + "/10 cl"));
        System.out.print(String.format("%10s ", price + " USD"));
        System.out.println();
    }

    private static void printResultRow(String name, int weight, int price) {
        System.out.print(BOLD_STR);
        System.out.print(String.format("%-10s ", name));
        System.out.print(String.format("%10s ", weight + " carats"));
        System.out.print(String.format("%10s ", ""));
        System.out.print(String.format("%10s ", price + " USD"));
        System.out.println(BOLD_END);
        System.out.println();
    }
}
