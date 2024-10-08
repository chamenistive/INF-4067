public class Produit_Factory {

    public static final int TYPE_PRODUIT_ORDINATEUR = 1;
    public static final int TYPE_PRODUIT_VIDEO_PROJECTEUR = 2;
    public static final int TYPE_PRODUIT_SOURIS = 3;
    public static final int TYPE_PRODUIT_IMPRIMENTE = 4;


    public Produit getProduit(int typeProduit){
        Produit ordinateur = null;

        switch (typeProduit) {
            case TYPE_PRODUIT_ORDINATEUR:
                ordinateur = new Ordinateur();
                break;
                case TYPE_PRODUIT_VIDEO_PROJECTEUR:
                ordinateur = new Video_projecteur();
                break;
                //Il s'agit ici des produits qui ont ete ajoutes pour ce pattron factory
                case TYPE_PRODUIT_SOURIS:
                ordinateur = new Souris();
                break;
                case TYPE_PRODUIT_IMPRIMENTE:
                ordinateur = new Imprimente();
                break;
            default:
                throw new IllegalArgumentException("type de produit inconnu");
        }
        
        return ordinateur;
    }
}
