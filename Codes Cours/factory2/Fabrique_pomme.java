//fabrique concrete de la pomme

public class Fabrique_pomme extends Fabrique_abstraite_fruit {

    protected Fruit create_fruit() {
        return new Pomme();
    }

}
