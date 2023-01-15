package transport;

public class DriverC extends Driver {
    public DriverC(String name, boolean driverLicense, int experience) {
        super(name, driverLicense, experience);
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель категории C " + getName() + " начал движение");
    }

    @Override
    public void finishMovement() {
        System.out.println("Водитель категории C " + getName() + " закончил движение");
    }

    @Override
    public void refuelCar() {
        System.out.println("Водитель категории C " + getName() + " заправляет авто");
    }

    @Override
    public String toString() {
        return super.toString() + "Категория: C ";
    }
}
