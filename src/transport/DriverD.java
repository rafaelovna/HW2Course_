package transport;

public class DriverD extends Driver {
    public DriverD(String name, boolean driverLicense, int experience) {
        super(name, driverLicense, experience);
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель категории D " + getName() + " начал движение");
    }

    @Override
    public void finishMovement() {
        System.out.println("Водитель категории D " + getName() + " закончил движение");
    }

    @Override
    public void refuelCar() {
        System.out.println("Водитель категории D " + getName() + " заправляет авто");
    }

    @Override
    public String toString() {
        return super.toString() + "Категория: D ";
    }
}
