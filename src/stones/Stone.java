package stones;

class Stone{
    private static final int MIN_CLR = 1;
    private static final int MAX_CLR = 10;

    private int weightInCarats;
    private int priceByCarat;
    private int clarity;

    Stone(int weight, int price, int clarity) {
        this.weightInCarats = weight;
        this.priceByCarat = price;
        clarityValidator(clarity);
        this.clarity = clarity;
    }

    void clarityValidator(int clarity) {
        if (clarity < MIN_CLR || clarity > MAX_CLR ) {
            throw new IllegalArgumentException("Clarity must be 1-10");
        }
    }

    int getWeight() {
        return weightInCarats;
    }

    int getPrice() {
        return priceByCarat * weightInCarats * clarity / MAX_CLR;
    }

    int getClarity() {
        return clarity;
    }
}
