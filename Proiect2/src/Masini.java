public class Masini
{
        private String model;
        private String licenseplatenumber;
        private int fabricationyear;

        private String nume;

        private String adresa;

        private String reparatie;

        public Masini(String model, String licenseplatenumber, int fabricationyear)
        {
            this.model = model;
            this.licenseplatenumber = licenseplatenumber;
            this.fabricationyear = fabricationyear;
        }

        public Masini(String nume, String adresa, String reparatie)
        {
            this.nume = nume;
            this.adresa = adresa;
            this.reparatie = reparatie;
        }

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


}
