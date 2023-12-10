import stones.Necklace;

public class Main {
    public static void main(String[] args) {
        Necklace necklace = new Necklace();

        necklace.addStone("Diamond", 2);
        necklace.addStone("Pearl", 2);

        int weight = necklace.getWeight();
        int price = necklace.getPrice();

        System.out.println("Weight: " + weight + " carats");
        System.out.println("Price : " + price + " USD");
    }
}
