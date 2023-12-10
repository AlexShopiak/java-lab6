package stones;

import java.util.ArrayList;

public class Necklace{
    private ArrayList<Stone> necklace;

    public Necklace() {
        necklace = new ArrayList<>();
    }

    public void addStone(String name, int weight) {
        switch (name.toLowerCase()) {
            case "diamond":
                necklace.add(new Diamond(weight));
                break;
            case "emerald":
                necklace.add(new Emerald(weight));
                break;
            case "ruby":
                necklace.add(new Ruby(weight));
                break;
            case "onyx":
                necklace.add(new Onyx(weight));
                break;
            case "opal":
                necklace.add(new Opal(weight));
                break;
            case "pearl":
                necklace.add(new Pearl(weight));
                break;
            default:
                throw new IllegalArgumentException("We don't have " + name);
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
            price += stone.getWeight() * stone.getPrice();
        }

        return price;
    }
}