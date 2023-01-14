package transport;

public class Bus extends Transport<Driver_D> {
    public enum BusCapacity {
        THE_SMALLEST(0, 10),
        SMALL(0, 25),
        AVERAGE(40,50),
        BIG(60,80),
        THE_BIGGEST(100,120);

        private final Integer lowerLimitsCapacityBus;
        private final Integer upperLimitsCapacityBus;

        BusCapacity(Integer lowerLimitsCapacityBus, Integer upperLimitsCapacityBus) {
            if (lowerLimitsCapacityBus == 0) {
               this.lowerLimitsCapacityBus = null;
            } else {
                this.lowerLimitsCapacityBus = lowerLimitsCapacityBus;
            }

            if (upperLimitsCapacityBus == 0) {
                this.upperLimitsCapacityBus = null;
            } else {
                this.upperLimitsCapacityBus = lowerLimitsCapacityBus;
            }
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
            } else {
                return "Вместимость: " + lowerLimitsCapacityBus +
                        " - " + upperLimitsCapacityBus + " мест.";
            }
        }
    }

    private BusCapacity[] busCapacities = new BusCapacity[0];

    public Bus(String brand, String model, double engineVolume, Driver_D driver) {
        super(brand, model, engineVolume, driver);
    }

    public BusCapacity[] getBusCapacities() {
        return busCapacities;
    }

    public void setBusCapacities(BusCapacity[] busCapacities) {
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

    @Override
    public String toString() {
        return "Автобус: "+ super.toString();
    }

}
