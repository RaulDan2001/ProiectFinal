class Singleton extends Afisier
{

   // declarare campuri
    private static Singleton instance;

    private String s;

    //constructorul clasei

    private Singleton()
    {
        this.s="";
    }

    //metoda de obtinere a instantei

    public static Singleton getInstance()
    {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }
}
