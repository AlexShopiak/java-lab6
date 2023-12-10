package stones;

class PreciousStone extends Stone{
    PreciousStone(int weight, int price, int clarity) {
        super(weight, price, clarity);
    }
}

//--------------------------------------
class Diamond extends PreciousStone{
    Diamond(int weight, int clarity) {
        super(weight, 3500, clarity);
    }
}

class Emerald extends PreciousStone{
    Emerald(int weight, int clarity) {
        super(weight, 3000, clarity);
    }
}


class Ruby extends PreciousStone{
    Ruby(int weight, int clarity) {
        super(weight, 3400, clarity);
    }
}