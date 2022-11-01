public abstract class vehicles implements Garage {
    private String model;
    private String licenseplatenumber;
    private int fabricationyear;

    public String getModel()
    {
        return this.model;
    }

    public String getLicenseplatenumber()
    {
        return this.licenseplatenumber;
    }

    public int getFabricationYear()
    {
        return this.fabricationyear;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public void setLicenseplatenumber(String licenseplatenumber)
    {
        this.licenseplatenumber = licenseplatenumber;
    }

    public void setFabricationyear(int fabricationyear)
    {
        this.fabricationyear = fabricationyear;
    }

    abstract int getHorsePower();

}

