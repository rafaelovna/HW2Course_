package transport;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Mechanic <T extends Transport>{
    private String name;
    private String company;
    private Queue<T> typeOfCar = new LinkedList<>();

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

    public Queue<T> getTypeOfCar() {
        return typeOfCar;
    }


    public void addTransport(T transport) {
        typeOfCar.add(transport);
    }


    //Метод провести техобслуживание.
    public void performMaintenance() {
        T transport = typeOfCar.peek();
        if (transport != null) {
            transport.passDiagnostics();
            System.out.println(transport + " прошёл техобслуживание!");
        }
    }

    //Метод починить машину.
    public void fixTheCar() {
        T transport = typeOfCar.poll();
        if (transport != null) {
            System.out.println("Механик " + name
                    + ", из компании - "
                    + company + ", чинит: "
                    + transport);
            fixTheCar();
        }
    }

    @Override
    public String toString() {
        return "Механик " + name
                + ", из компании - "
                + company;
    }

}

