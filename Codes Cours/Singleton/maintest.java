public class maintest {
    public static void main(String[] args) {
        int som = Operation_mathematique.getInstance().somme(24, 6);
        System.out.printf("la somme est %d",som);
        Operation_mathematique op1 = Operation_mathematique.getInstance();
        op1.afficher();
        Operation_mathematique op2 = Operation_mathematique.getInstance();
        op2.afficher();
    }
}
