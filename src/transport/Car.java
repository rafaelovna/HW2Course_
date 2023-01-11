package transport;

public class Car extends Transport <Driver_B> {

    public Car(String brand, String model, double engineVolume, Driver_B driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMoving() {
        System.out.println("Начал движение автомобиль марки:" + getBrand() + " " + getModel());
    }

    @Override
    public void finishMovement() {
        System.out.println("Закончил движение автомобиль марки: " + getBrand() + " " + getModel());
    }

    @Override
    public String toString() {
        return "Легковой автомобиль: "+ super.toString();
    }

    @Override
    public void pit_stop() {
        System.out.println("Пит-стоп у легкового автомобиля");
    }

    @Override
    public void bestLapTime() {
        int minBound = 70;
        int maxBound = 120;
        int bestLapTimeInMints =(int) (minBound + (maxBound-minBound) * Math.random());
        System.out.println("Лучшее время круга для легкового автомобиля в минутах " + bestLapTimeInMints);
    }

    @Override
    public void MaximumSpeed() {
        int minBound = 100;
        int maxBound = 160;
        int maxSpeed =(int) (minBound + (maxBound-minBound) * Math.random());
        System.out.println("Максимальная скорость для легкового автомобиля " + maxSpeed);
    }
}
