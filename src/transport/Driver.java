package transport;

public abstract class Driver {
    private final String name;
    private boolean driverLicense;
    private int experience;

    public Driver(String name, boolean driverLicense, int experience) {
        if (name == null || name.isBlank() || name.isEmpty()) {
            this.name = "default";
        } else {
            this.name = name;
        }
        setDriverLicense(driverLicense);
        setExperience(experience);
    }

    public String getName() {
        return name;
    }

    public void setDriverLicense(boolean driverLicense) {
        this.driverLicense = driverLicense;
    }

    public boolean isDriverLicense() {
        return driverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        if (experience <= 0) {
            this.experience = 1;
        } else {
            this.experience = experience;
        }
    }

    public abstract void startMoving();

    public abstract void finishMovement();

    public abstract void refuelCar();

}
