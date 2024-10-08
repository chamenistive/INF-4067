

public final class Operation_mathematique 
{
    private static Operation_mathematique instance = null;
    private int x;
    private int y;
    private int z;

    //contructeur prive
    private Operation_mathematique(){
        super();
    }
    //constructeur a deux parametres
    private Operation_mathematique(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    //constructeur a trois parametres
    private Operation_mathematique(int x, int y, int z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    //methode renvoyant une instance de la classe Operation_mathematique
    public static Operation_mathematique getInstance()
    {
        if (instance == null) {
            instance = new Operation_mathematique();
        }
        return instance;
    }
    //methode renvoyant une instance de la classe Operation_mathematique

    public static Operation_mathematique(int x, int y)
    {
        if (instance == null)
        {
            instance = new Operation_mathematique(x, y);
        }
        return instance;
    }

    public int somme(int x, int y)
    {
        return x+y;
    }
    public float moyenne(int x, int y)
    {
        return somme(x, y)/2;
    }
    public void afficher()
    {
        System.out.println("\n je suis une operation mathematique et mes  valeure sont: x="+ this.x +"et y="+this.y);
    }
    @Override
    public Object clone()throws
    CloneNotSupportedException{
        throw new CloneNotSupportedException();
    }
}