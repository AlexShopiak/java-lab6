package stones;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class Necklace{
    private static final int MIN_CLR = 1;
    private static final int MAX_CLR = 10;

    private ArrayList<Stone> necklace;

    public Necklace() {
        necklace = new ArrayList<>();
    }

    public void addStone(String name, int weight, int clarity) {
        switch (name.toLowerCase()) {
            case "diamond":
                necklace.add(new Diamond(weight, clarity));
                break;
            case "emerald":
                necklace.add(new Emerald(weight, clarity));
                break;
            case "ruby":
                necklace.add(new Ruby(weight, clarity));
                break;
            case "onyx":
                necklace.add(new Onyx(weight, clarity));
                break;
            case "opal":
                necklace.add(new Opal(weight, clarity));
                break;
            case "pearl":
                necklace.add(new Pearl(weight, clarity));
                break;
            default:
                throw new IllegalArgumentException("We don't have " + name);
        } 
    }

    public void sortByPrice() {
        if (necklace.size() > 1) {
            necklace.sort(new Comparator<Stone>() {
                @Override
                public int compare(Stone stone1, Stone stone2) {
                    return Integer.compare(stone1.getPrice(), stone2.getPrice());
                }
            });
        }
    }

    public void filterByClearence(int bottom, int top) {
        clarityValidator(bottom);
        clarityValidator(top);
        Iterator<Stone> iterator = necklace.iterator();

        while (iterator.hasNext()) {
            Stone stone = iterator.next();
            int clarity = stone.getClarity();
            if (clarity < bottom || clarity > top) {
                iterator.remove();
            }
        }
    }

    public int getWeight() {
        int weight = 0;

        for (Stone stone : necklace) {
            weight += stone.getWeight();
        }

        return weight;
    }

    public int getPrice() {
        int price = 0;

        for (Stone stone : necklace) {
            price += stone.getPrice();
        }

        return price;
    }

    public void display(String title) {
        String BOLD_STR = "\u001B[1m";
        String BOLD_END = "\u001B[0m";
        System.out.println(BOLD_STR + title + BOLD_END);

        for (Stone stone : necklace) {
            String name = stone.getClass().getSimpleName();
            int weight = stone.getWeight();
            int price = stone.getPrice();
            System.out.println(name + " " + weight + " carats, " + price + " USD");
        }
        
        System.out.println(BOLD_STR + "Weight: " + BOLD_END + getWeight() + " carats");
        System.out.println(BOLD_STR + "Price : " + BOLD_END +  getPrice() + " USD");
        System.out.println();
    }

    private void clarityValidator(int clarity) {
        if (clarity < MIN_CLR || clarity > MAX_CLR ) {
            throw new IllegalArgumentException("Clarity must be 1-10");
        }
    }
}