package transport;

import java.util.HashSet;
import java.util.Set;

public class Mechanic<T extends Transport<?>> {
    private final String name;
    private final String company;


    public Mechanic(String name, String company) {
        this.name = name;
        this.company = company;
    }


    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }


    //Метод провести техобслуживание.
    public void performMaintenance() {
        System.out.println("Механик " + name + " из компании " + company + " проводит техобслуживание!");
    }

    //Метод починить машину.
    public void fixTheCar() {
        System.out.println("Механик " + name
                + ", из компании - "
                + company + ", чинит автомобиль");
    }


    @Override
    public String toString() {
        return "Механик " + name
                + ", из компании - "
                + company;
    }

}

