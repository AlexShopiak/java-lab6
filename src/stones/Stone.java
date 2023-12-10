package stones;

class Stone{
    private int weight;
    private int price;

    Stone(int weight, int price) {
        this.weight = weight;
        this.price = price;
    }

    int getWeight() {
        return weight;
    }

    int getPrice() {
        return price;
    }
}
