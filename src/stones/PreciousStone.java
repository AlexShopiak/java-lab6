package stones;

class PreciousStone extends Stone{
    PreciousStone(int weight) {
        super(weight);
    }
}

//--------------------------------------
class Diamond extends PreciousStone{
    private float price = 0; //todo
 
    Diamond(int weight) {
        super(weight);
    }
}

class Emerald extends PreciousStone{
    private float price = 0; //todo
 
    Emerald(int weight) {
        super(weight);
    }
}


class Ruby extends PreciousStone{
    private float price = 0; //todo
 
    Ruby(int weight) {
        super(weight);
    }
}