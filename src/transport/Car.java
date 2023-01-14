package transport;

public class Car extends Transport <Driver_B> {
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

    private BodyType[] bodyTypes = new BodyType[0];


    public Car(String brand, String model, double engineVolume, Driver_B driver) {
        super(brand, model, engineVolume, driver);
        setBodyTypes(bodyTypes);
    }

    public BodyType[] getBodyTypes() {
        return bodyTypes;
    }

    public void setBodyTypes(BodyType[] bodyTypes) {
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
    public String toString() {
        return "Легковой автомобиль: " + toString()+" "+ super.toString();
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
