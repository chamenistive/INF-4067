//fabrique abstraite de fruit
public abstract class Fabrique_abstraite_fruit {

    public Fruit getFruit(){
        return create_fruit();
    }

    protected abstract Fruit create_fruit();
}


