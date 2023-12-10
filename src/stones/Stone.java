package stones;

class Stone{
    private int weightInCarats;
    private int priceByCarat;

    Stone(int weight, int price) {
        this.weightInCarats = weight;
        this.priceByCarat = price;
    }

    int getWeight() {
        return weightInCarats;
    }

    int getPrice() {
        return priceByCarat * weightInCarats;
    }
}
