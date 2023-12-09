package stones;

class SemiPreciousStone extends Stone{
    SemiPreciousStone(int weight) {
        super(weight);
    }
}

//----------------------------------------
class Onyx extends SemiPreciousStone{
    private float price = 0; //todo
 
    Onyx(int weight) {
        super(weight);
    }
}

class Opal extends SemiPreciousStone{
    private float price = 0; //todo
 
    Opal(int weight) {
        super(weight);
    }
}

class Pearl extends SemiPreciousStone{
    private float price = 0; //todo
 
    Pearl(int weight) {
        super(weight);
    }
}
