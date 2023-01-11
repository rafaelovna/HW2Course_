package transport;

public class Bus extends Transport<Driver_D> {

    public Bus(String brand, String model, double engineVolume, Driver_D driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMoving() {
        System.out.println("Начал движение автобус марки:" + getBrand() + " " + getModel());
    }

    @Override
    public void finishMovement() {
        System.out.println("Закончил движение автобус марки: " + getBrand() + " " + getModel());
    }


    @Override
    public String toString() {
        return "Автобус: "+ super.toString();
    }

    @Override
    public void pit_stop() {
        System.out.println("Пит-стоп у автобуса");
    }

    @Override
    public void bestLapTime() {
        int minBound = 100;
        int maxBound = 150;
        int bestLapTimeInMints =(int) (minBound + (maxBound-minBound) * Math.random());
        System.out.println("Лучшее время круга для автобуса в минутах " + bestLapTimeInMints);
    }

    @Override
    public void MaximumSpeed() {
        int minBound = 80;
        int maxBound = 120;
        int maxSpeed =(int) (minBound + (maxBound-minBound) * Math.random());
        System.out.println("Максимальная скорость для автобуса " + maxSpeed);
    }
}
