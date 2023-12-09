package stones;

import java.util.ArrayList;

public class Necklace{
    private ArrayList<Stone> necklace;

    public Necklace() {
        necklace = new ArrayList<>();
    }

    public void addPearl(int weight) {
        necklace.add(new Pearl(weight));
    }//todo example

    public int getWeightInCarats() {
        return 0;//todo
    }

    public int getPriceInUSD() {
        return 0;//todo
    }
}