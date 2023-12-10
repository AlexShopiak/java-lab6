package stones;

class PreciousStone extends Stone{
    PreciousStone(int weight, int price) {
        super(weight, price);
    }
}

//--------------------------------------
class Diamond extends PreciousStone{
    Diamond(int weight) {
        super(weight, 3500);
    }
}

class Emerald extends PreciousStone{
    Emerald(int weight) {
        super(weight, 3000);
    }
}


class Ruby extends PreciousStone{
    Ruby(int weight) {
        super(weight, 3400);
    }
}