//fabrique concrete de la mangue

public class Fabrique_mangue  extends Fabrique_abstraite_fruit{

    protected Fruit create_fruit(){
        return new Mangue();
    }
    
}

// public class fabrique_mangue extends Fabrique_abstraite_fruit{
    
//     protected Fruit create_fruit() {
//         return new  Mangue();
//     }
    
// }

