public abstract class vehicles implements Garage {

    //creare campuri

    private String model;
    private String engine;
    private String sasiu;
    private String distributie;

    // creare metode de get

    public String getModel()
    {
        return this.model;
    }

    public String getEngine()
    {
        return this.engine;
    }

    public String getSasiu()
    {
        return this.sasiu;
    }
    public String getDistributie() {return this.distributie; }

    //creare metode de set

    public void setModel(String model)
    {
        this.model = model;
    }

    public void setEngine(String engine)
    {
        this.engine = engine;
    }

    public void setSasiu(String sasiu) {this.sasiu = sasiu;}

    public void setDistributie(String distributie){this.distributie = distributie;}

    //metoda abstracta

    abstract int getHorsePower();

}

