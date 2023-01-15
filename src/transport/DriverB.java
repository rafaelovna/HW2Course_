package transport;

public class DriverB extends Driver{
    public DriverB(String name, boolean driverLicense, int experience) {
        super(name, driverLicense, experience);
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель категории В " + getName() + " начал движение");
    }

    @Override
    public void finishMovement() {
        System.out.println("Водитель категории В " + getName() + " закончил движение");
    }

    @Override
    public void refuelCar() {
        System.out.println("Водитель категории В " + getName() + " заправляет авто");
    }

    @Override
    public String toString() {
        return super.toString() + "Категория: B ";
    }
}
