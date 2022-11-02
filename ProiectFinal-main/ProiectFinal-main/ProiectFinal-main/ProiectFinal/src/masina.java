public class
masina extends vehicles {

    // declarare campuri

    private String model;
    private String engine;

    private String sasiu;

    private String distributie;

    //constructorul clasei

    masina(String model, String engine, String sasiu, String distributie){
        this.model = model;
        this.engine = engine;
        this.sasiu = sasiu;
        this.distributie = distributie;
    }

    //metodele de get

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

    //mdetodele de set

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


    //metoda getHorsePower declarata abstracta in clasa vehicles

    @Override
    public int getHorsePower() {return 0;}
}
