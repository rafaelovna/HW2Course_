package transport;

public class Truck extends Transport<DriverC> {

    public enum LoadCapacity {
        N1(null, 3.5F),
        N2(3.5F, 12.0F),
        N3(12.0F, null);

        private Float lowerLimitsOfLoadCapacity;
        private Float upperLimitsOfLoadCapacity;


        LoadCapacity(Float lowerLimitsOfLoadCapacity, Float upperLimitsOfLoadCapacity) {
            setLowerLimitsOfLoadCapacity(lowerLimitsOfLoadCapacity);
            setUpperLimitsOfLoadCapacity(upperLimitsOfLoadCapacity);
        }

        public Float getLowerLimitsOfLoadCapacity() {
            return lowerLimitsOfLoadCapacity;
        }

        public void setLowerLimitsOfLoadCapacity(Float lowerLimitsOfLoadCapacity) {
            this.lowerLimitsOfLoadCapacity = lowerLimitsOfLoadCapacity;
        }

        public Float getUpperLimitsOfLoadCapacity() {
            return upperLimitsOfLoadCapacity;
        }

        public void setUpperLimitsOfLoadCapacity(Float upperLimitsOfLoadCapacity) {
            this.upperLimitsOfLoadCapacity = upperLimitsOfLoadCapacity;
        }

        @Override
        public String toString() {
            if (lowerLimitsOfLoadCapacity == null) {
                return "Грузоподъемность: до " + upperLimitsOfLoadCapacity + " тонн";
            } else if (upperLimitsOfLoadCapacity == null) {
                return "Грузоподъемность: от " + lowerLimitsOfLoadCapacity + " тонн";
            } else {
                return "Грузоподъемность: от " +
                        lowerLimitsOfLoadCapacity
                        +
                        " тонн до " + upperLimitsOfLoadCapacity +
                        " тонн.";
            }
        }
    }

    private LoadCapacity loadCapacities;

    public Truck(String brand, String model, double engineVolume, DriverC driver, LoadCapacity loadCapacities) {
        super(brand, model, engineVolume, driver);
        this.loadCapacities = loadCapacities;
    }

    public LoadCapacity getLoadCapacities() {
        return loadCapacities;
    }

    public void setLoadCapacities(LoadCapacity loadCapacities) {
        this.loadCapacities = loadCapacities;
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
    public void printType() {
        if (loadCapacities == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Вместимость: " + loadCapacities);
        }
    }

    @Override
    public void passDiagnostics() {
        super.passDiagnostics();
    }

    @Override
    public void pit_stop() {
        System.out.println("Пит-стоп у грузового автомобиля");
    }

    @Override
    public void bestLapTime() {
        int minBound = 90;
        int maxBound = 140;
        int bestLapTimeInMints = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Лучшее время круга для грузового автомобиля в минутах " + bestLapTimeInMints);
    }

    @Override
    public void maximumSpeed() {
        int minBound = 90;
        int maxBound = 130;
        int maxSpeed = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Максимальная скорость для грузового автомобиля " + maxSpeed);
    }

    @Override
    public String toString() {
        return "Грузовой автомобиль: " + super.toString();
    }
}
