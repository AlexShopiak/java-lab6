import stones.Necklace;

public class Main {
    public static void main(String[] args) {
        Necklace necklace = new Necklace();

        necklace.addPearl(2);
        necklace.addPearl(1);

        int result = necklace.getSize();
        System.out.println(result);
    }
}
