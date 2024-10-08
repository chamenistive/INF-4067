public class Client {
    public static void main(String[] args) {
        Produit_Factory produit_Factory  = new Produit_Factory();

        Produit ordinateur = null;

        ordinateur = produit_Factory.getProduit(Produit_Factory.TYPE_PRODUIT_ORDINATEUR);
        ordinateur.methode1();
        ordinateur = produit_Factory.getProduit(Produit_Factory.TYPE_PRODUIT_VIDEO_PROJECTEUR);
        ordinateur.methode1();

        //Il s'agit ici des produits qui ont ete ajoutes pour ce pattron factory
        ordinateur = produit_Factory.getProduit(Produit_Factory.TYPE_PRODUIT_SOURIS);
        ordinateur.methode1();
        ordinateur = produit_Factory.getProduit(Produit_Factory.TYPE_PRODUIT_IMPRIMENTE);
        ordinateur.methode1();
        ordinateur = produit_Factory.getProduit(4);
        ordinateur.methode1();
    }
}
