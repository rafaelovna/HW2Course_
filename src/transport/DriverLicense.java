package transport;

public class DriverLicense {
    //Создала класс для водительского
    // удостоверения с целью присвоения категорий.
    //Думаю так будет правильней, чтобы не смешивать водителей и документы.

    public enum FindCategory {
        B,
        C,
        D
    }
    private boolean driverLicense;


    public DriverLicense(boolean driverLicense) {
        this.driverLicense = driverLicense;
    }

    public boolean isDriverLicense() {
        return driverLicense;
    }


    @Override
    public String toString() {
        return " Водительское удостоверение категории: " + driverLicense;
    }
}

