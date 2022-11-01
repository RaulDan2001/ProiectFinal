public abstract class vehicles implements Garage {
    private String model;
    private String engine;
    private String sasiu;
    private String distributie;

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

    abstract int getHorsePower();

}

