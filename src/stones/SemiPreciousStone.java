package stones;

class SemiPreciousStone extends Stone{
    SemiPreciousStone(int weight, int price) {
        super(weight, price);
    }
}

//----------------------------------------
class Onyx extends SemiPreciousStone{
    Onyx(int weight) {
        super(weight, 50);
    }
}

class Opal extends SemiPreciousStone{
    Opal(int weight) {
        super(weight, 200);
    }
}

class Pearl extends SemiPreciousStone{
    Pearl(int weight) {
        super(weight, 100);
    }
}
