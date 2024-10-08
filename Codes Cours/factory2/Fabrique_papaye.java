//fabrique concrete de la papaye

public class Fabrique_papaye extends Fabrique_abstraite_fruit{
    protected Fruit create_fruit(){
        return new Papaye();
    }    
}
