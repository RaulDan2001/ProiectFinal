public class
masina extends vehicles {

    private String model;
    private String engine;

    private String chassis;

    private String drivetrain;

    masina(String model, String engine, String chassis, String drivetrain){
        this.model = model;
        this.engine = engine;
        this.chassis = chassis;
        this.drivetrain = drivetrain;
    }

    @Override
    public int getHorsePower() {



        return 0;
    }
}
