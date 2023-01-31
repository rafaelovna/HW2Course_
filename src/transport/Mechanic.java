package transport;

import java.util.HashSet;
import java.util.Objects;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic<?> mechanic = (Mechanic<?>) o;
        return Objects.equals(name, mechanic.name) && Objects.equals(company, mechanic.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, company);
    }

    @Override
    public String toString() {
        return "Механик " + name
                + ", из компании - "
                + company;
    }

}

