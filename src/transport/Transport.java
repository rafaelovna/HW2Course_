package transport;

import java.util.*;

public abstract class Transport<T extends Driver> implements Competing {
    private static int count;
    private final   String brand;
    private final String model;
    private double engineVolume;
    private T driver;
    private ArrayList <Mechanic> mechanic;

    public Transport(String brand, String model, double engineVolume, T driver) {
        if (brand == null || brand.isBlank() || brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (model == null || model.isBlank() || model.isEmpty()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        setEngineVolume(engineVolume);
        setDriver(driver);

        mechanic = new ArrayList<>();
        count++;
    }

    public static int getCount() {
        return count;
    }

    public ArrayList<Mechanic> getMechanic() {
        return mechanic;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }


    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

    }

    public abstract void startMoving();
    public abstract void finishMovement();
    public abstract void printType();

    public void findCarData() {  // метод вывести водителя авто с именем и механиками
        System.out.println(getDriver()
                + ". Транспорт: "
                + getBrand()
                + " " + getModel()
                + " обслуживает механик "
                + getMechanic());
    }

    public void passDiagnostics() throws RuntimeException {
        System.out.println("Диагностику проходит: " + getBrand() + " " + getModel());
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport<?> transport = (Transport<?>) o;
        return Double.compare(transport.engineVolume, engineVolume) == 0 && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model) && Objects.equals(driver, transport.driver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, driver);
    }

    @Override
    public String toString() {
        return brand +
                " " + model +
                ". Объем двигателя: " + engineVolume;
    }
}
