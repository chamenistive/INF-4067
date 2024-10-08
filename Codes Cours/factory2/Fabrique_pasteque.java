//fabrique concrete de la pasteque

public class Fabrique_pasteque extends Fabrique_abstraite_fruit {
    
    protected Fruit create_fruit(){
        return new Pasteque();
    }
    
}
