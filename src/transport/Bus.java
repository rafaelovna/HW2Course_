package transport;

public class Bus extends Transport<DriverD> {
    public enum BusCapacity {
        THE_SMALLEST(null, 10),
        SMALL(null, 25),
        AVERAGE(40,50),
        BIG(60,80),
        THE_BIGGEST(100,120);

        private final Integer lowerLimitsCapacityBus;
        private final Integer upperLimitsCapacityBus;

        BusCapacity(Integer lowerLimitsCapacityBus, Integer upperLimitsCapacityBus) {
                this.lowerLimitsCapacityBus = lowerLimitsCapacityBus;
                this.upperLimitsCapacityBus = upperLimitsCapacityBus;
        }

        public Integer getLowerLimitsCapacityBus() {
            return lowerLimitsCapacityBus;
        }

        public Integer getUpperLimitsCapacityBus() {
            return upperLimitsCapacityBus;
        }

        @Override
        public String toString() {
            if (lowerLimitsCapacityBus == null) {
                return "Вместимость: до" + upperLimitsCapacityBus;
            } else if (upperLimitsCapacityBus == null) {
                return "Вместимость: от " + lowerLimitsCapacityBus;
            } else {
                return "Вместимость: " + lowerLimitsCapacityBus +
                        " - " + upperLimitsCapacityBus + " мест.";
            }
        }
    }

    private BusCapacity busCapacities;

    public Bus(String brand, String model, double engineVolume, DriverD driver, BusCapacity busCapacities) {
        super(brand, model, engineVolume, driver);
    }

    public BusCapacity getBusCapacities() {
        return busCapacities;
    }

    public void setBusCapacities(BusCapacity busCapacities) {
        this.busCapacities = busCapacities;
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
    public void printType() {
        if (busCapacities == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Вместимость: " + busCapacities);
        }
    }

    @Override
    public void passDiagnostics() {
        throw new RuntimeException("Автобусы диагностику проходить не могут!");
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
    public void maximumSpeed() {
        int minBound = 80;
        int maxBound = 120;
        int maxSpeed =(int) (minBound + (maxBound-minBound) * Math.random());
        System.out.println("Максимальная скорость для автобуса " + maxSpeed);
    }

    @Override
    public String toString() {
        return "Автобус: "+ super.toString();
    }

}
