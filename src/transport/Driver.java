package transport;

public abstract class Driver extends DriverLicense {

    private final String name;
    private int experience;


    public Driver(boolean driverLicense, String name, int experience) {
        super(driverLicense);
        if (name == null || name.isBlank() || name.isEmpty()) {
            this.name = "default";
        } else {
            this.name = name;
        }
        setExperience(experience);
    }


    public String getName() {
        return name;
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

    //Добавила метод для выявления категорий.

    public void findCategoryDriverLicense() throws SpecifyDriverLicenseTypeException {
    }

    @Override
    public String toString() {
        return "Водитель: " + name +
                ", стаж: " + experience + super.toString();
    }
}
