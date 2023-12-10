package stones;

class SemiPreciousStone extends Stone{
    SemiPreciousStone(int weight, int price, int clarity) {
        super(weight, price, clarity);
    }
}

//----------------------------------------
class Onyx extends SemiPreciousStone{
    Onyx(int weight, int clarity) {
        super(weight, 50, clarity);
    }
}

class Opal extends SemiPreciousStone{
    Opal(int weight, int clarity) {
        super(weight, 200, clarity);
    }
}

class Pearl extends SemiPreciousStone{
    Pearl(int weight, int clarity) {
        super(weight, 100, clarity);
    }
}
