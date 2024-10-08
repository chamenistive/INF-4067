public class Client {
    public static void main(String[] args) {
        
        Fabrique_abstraite_fruit Fabrique_mangue = new Fabrique_mangue();
        Fabrique_abstraite_fruit Fabrique_papaye = new Fabrique_papaye();
        Fabrique_abstraite_fruit Fabrique_pasteque = new Fabrique_pasteque();
        Fabrique_abstraite_fruit Fabrique_pomme = new Fabrique_pomme();

        Fruit fruit = null;

        System.out.println("utilisation de la fabrique de mangue");
        fruit = Fabrique_mangue.getFruit();
        fruit.methodeF();

        System.out.println("utilisation de la fabrique de papaye");
        fruit = Fabrique_papaye.getFruit();
        fruit.methodeF();

        System.out.println("utilisation de la fabrique de pasteque");
        fruit = Fabrique_pasteque.getFruit();
        fruit.methodeF();

        System.out.println("utilisation de la fabrique de pomme");
        fruit = Fabrique_pomme.getFruit();
        fruit.methodeF();
    
    }
}
