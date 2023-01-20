package transport;

import java.util.ArrayList;

public class Car extends Transport <DriverB> {
    public enum BodyType{
        SEDAN( "Седан"),
        HATCHBACK("Хетчбек"),
        COMPARTMENT("Купе"),
        STATION_WAGON("Универсал"),
        SUV("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивэн");

        private final String typeOfBody;


        BodyType(String typeOfBody) {
            this.typeOfBody = typeOfBody;
        }

        public String getTypeOfBody() {
            return typeOfBody;
        }


        @Override
        public String toString() {
            return "Тип кузова: " + typeOfBody;
        }
    }

    private BodyType bodyTypes;


    public Car(String brand, String model, double engineVolume, DriverB driver, BodyType bodyTypes) {
        super(brand, model, engineVolume, driver);
        this.bodyTypes = bodyTypes;
    }

    public BodyType getBodyTypes() {
        return bodyTypes;
    }

    public void setBodyTypes(BodyType bodyTypes) {
        this.bodyTypes = bodyTypes;
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
    public void printType() {
        if (bodyTypes == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Тип кузова: " + bodyTypes);
        }
    }

    @Override
    public void passDiagnostics() {
        super.passDiagnostics();
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
    public void maximumSpeed() {
        int minBound = 100;
        int maxBound = 160;
        int maxSpeed =(int) (minBound + (maxBound-minBound) * Math.random());
        System.out.println("Максимальная скорость для легкового автомобиля " + maxSpeed);
    }

}
