package transport;

import java.util.*;

public class CarService {

    private Queue<Transport<?>> typeOfCar = new ArrayDeque<>();

    public Queue<Transport<?>> getTypeOfCar() {
        return typeOfCar;
    }

    public void addTransport(Transport transport) {
        if (transport instanceof Bus) {
            System.out.println("Автобусы не нуждаются в ТО");
        } else {
            typeOfCar.add(transport);
        }
    }

    public void undergoMaintenance() {
        Transport<?> transport = typeOfCar.poll();
        if (transport != null) {
            transport.passDiagnostics();
            System.out.println(transport + " прошёл техобслуживание!");
        }
    }

    public void setTypeOfCar(Queue<Transport<?>> typeOfCar) {
        this.typeOfCar = typeOfCar;
    }

}
