package transport;

public class Trucks  extends Transport <Driver_C> {
    public Trucks(String brand, String model, double engineVolume, Driver_C driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMoving() {
        System.out.println("Начал движение грузовой автомобиль марки:" + getBrand() + " " + getModel());
    }

    @Override
    public void finishMovement() {
        System.out.println("Закончил движение грузовой автомобиль марки: " + getBrand() + " " + getModel());
    }

    @Override
    public String toString() {
        return "Грузовой автомобиль: "+ super.toString();
    }
    @Override
    public void pit_stop() {
        System.out.println("Пит-стоп у грузового автомобиля");
    }

    @Override
    public void bestLapTime() {
        int minBound = 90;
        int maxBound = 140;
        int bestLapTimeInMints =(int) (minBound + (maxBound-minBound) * Math.random());
        System.out.println("Лучшее время круга для грузового автомобиля в минутах " + bestLapTimeInMints);
    }

    @Override
    public void MaximumSpeed() {
        int minBound = 90;
        int maxBound = 130;
        int maxSpeed =(int) (minBound + (maxBound-minBound) * Math.random());
        System.out.println("Максимальная скорость для грузового автомобиля " + maxSpeed);
    }
}
