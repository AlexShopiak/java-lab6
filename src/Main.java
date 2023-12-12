/*
 * Main
 *
 * Version 1.0
 *
 * (c) 2023 Oleksii Shopiak
 * All rights reserved.
 *
 * This is an entry point of a project
 */
import stones.Necklace;

public class Main {
    public static void main(String[] args) {
        Necklace necklace = new Necklace();
        
        necklace.addStone("Diamond", 2, 10);
        necklace.addStone("Pearl",   2, 9);
        necklace.addStone("Emerald", 1, 1);
        necklace.addStone("Emerald", 1, 1);
        necklace.addStone("Emerald", 1, 1);
        necklace.addStone("Ruby",    3, 7);
        necklace.display("Initial");

        necklace.sortByPrice();
        necklace.display("Sorted");

        necklace.filterByClearence(9, 10);
        necklace.display("Filtered");
    }
}
