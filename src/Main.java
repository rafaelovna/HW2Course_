import transport.*;

import java.sql.Array;
import java.sql.JDBCType;
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static List <Transport<?>> transport = new ArrayList<>();
    public static List<Car> carList = new ArrayList<>();
    public static List<Bus> busList = new ArrayList<>();
    public static List<Truck> truckList = new ArrayList<>();

    public static void main(String[] args) {
        DriverD alex = new DriverD(true, "Alex ", 20, DriverLicense.FindCategory.D);
        DriverD ivan = new DriverD( true, "Ivan ", 13, DriverD.FindCategory.D);
        DriverD fedor = new DriverD(true, "Fedor ", 6, DriverD.FindCategory.D);
        DriverD sergei = new DriverD(true, "Sergei ", 5, DriverD.FindCategory.D);
        DriverB igor = new DriverB(true, "Igor cat ", 1, DriverB.FindCategory.B);
        DriverB viktor = new DriverB(true, "Viktor ", 7, DriverB.FindCategory.B);
        DriverB oleg = new DriverB(true, "Oleg", 11, DriverLicense.FindCategory.B);
        DriverB misha = new DriverB(true, "Misha ", 7, DriverB.FindCategory.B);
        DriverC vova = new DriverC(true, "Vova ", 6, DriverLicense.FindCategory.C);
        DriverC petya = new DriverC(true, "Petya ", 15, DriverLicense.FindCategory.C);
        DriverC kolya = new DriverC(true, "Kolya ", 8, DriverLicense.FindCategory.C);
        DriverC andrey = new DriverC(true, "Andrey ", 6, DriverLicense.FindCategory.C);


        Bus liaz = new Bus("ЛиАЗ", "529267", 8.6, alex, Bus.BusCapacity.BIG);
        Bus higer = new Bus("Higer", "KLQ 6129", 9.5, ivan, Bus.BusCapacity.BIG);
        Bus paz = new Bus("ПАЗ", "320405-04", 4.6, fedor, Bus.BusCapacity.SMALL);
        Bus higer1 = new Bus("Higer", "KLQ 6128", 9.5, sergei, Bus.BusCapacity.THE_BIGGEST);
        Car hyundai = new Car("Hyundai", "Avante", 1.6, igor, Car.BodyType.SEDAN);
        Car kia = new Car("Kia", "Sportage 4-го поколения", 1.8, viktor, Car.BodyType.HATCHBACK);
        Car bmv = new Car("BMW", "Z8", 3.0, oleg, Car.BodyType.SEDAN);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, misha, Car.BodyType.CROSSOVER);
        Truck isuzu = new Truck("Isuzu", "Forward", 5.2, vova, Truck.LoadCapacity.N3);
        Truck jac = new Truck("JAC", "N350", 6.9, petya, Truck.LoadCapacity.N1);
        Truck volvo = new Truck("Volvo", "VHD", 15.0, kolya, Truck.LoadCapacity.N3);
        Truck shacman = new Truck("Shacman", "X3000", 12.0, andrey, Truck.LoadCapacity.N2);
//        printInfo(shacman);
//        printInfo(volvo);
//        printInfo(jac);
//        printInfo(isuzu);
//        printInfo(audi);
//        printInfo(bmv);
//        bmv.passDiagnostics();
//        printInfo(kia);
//        printInfo(hyundai);
//        printInfo(higer1);
//        printInfo(paz);
//        printInfo(higer);
//        printInfo(liaz);
//        liaz.passDiagnostics();
//        shacman.passDiagnostics();
//        findCategoryDriver(oleg, viktor,alex, ivan, fedor, sergei, igor, misha, vova, petya, kolya, andrey);  //метод найти категорию
        transport.add(shacman);
        transport.add(volvo);
        transport.add(jac);
        transport.add(audi);
        transport.add(bmv);
        transport.add(kia);
        transport.add(hyundai);
        transport.add(paz);
        transport.add(higer);
        transport.add(liaz);
        transport.add(isuzu);
        transport.add(higer1);
//        System.out.println("Общее число транспортов, учавствующих в автогонках: " + transport.size());
        carList.add(audi);
        carList.add(bmv);
        carList.add(kia);
        carList.add(hyundai);
//        System.out.println("Список легковых автомобилей: " + carList.size());


        Mechanic <Transport> petyaPetrov = new Mechanic<>("Petya Petrov", "OOO Ремонт");
        Mechanic <Bus> sidorov = new Mechanic<>("Nikolay Sidorov", "АО Без проблем");
        Mechanic <Transport> limako = new Mechanic<>("Andrey Limako", "OOO Мы можем больше");
        Mechanic <Car> fedorenko = new Mechanic<>("Michail Fedorenko", "OOO Ремонт");
        Mechanic <Truck> petrov = new Mechanic<>("Andrey Petrov", "OOO Мы можем больше");
        Mechanic <Transport> dorohov = new Mechanic<>("Sergey Dorohov", "АО Без проблем");


        sidorov.addTransport(higer);
        sidorov.addTransport(higer1);
        sidorov.addTransport(liaz);
        limako.addTransport(shacman);
        limako.addTransport(volvo);
        limako.addTransport(jac);
        fedorenko.addTransport(hyundai);
        fedorenko.addTransport(bmv);
        fedorenko.addTransport(audi);
        fedorenko.addTransport(kia);
        petrov.addTransport(jac);
        petrov.addTransport(shacman);
        petrov.addTransport(isuzu);
        dorohov.addTransport(volvo);
        dorohov.addTransport(liaz);
        dorohov.addTransport(paz);
        dorohov.addTransport(higer1);
        petyaPetrov.addTransport(kia);
        petyaPetrov.addTransport(bmv);
        petyaPetrov.addTransport(paz);

        // метод вывести водителя авто с именем и механиками

        kia.getMechanic().add(fedorenko);
        kia.getMechanic().add(petyaPetrov);
        higer.getMechanic().add(sidorov);
        higer1.getMechanic().add(sidorov);
        higer1.getMechanic().add(dorohov);
        liaz.getMechanic().add(sidorov);
        liaz.getMechanic().add(dorohov);
        shacman.getMechanic().add(limako);
        shacman.getMechanic().add(petrov);
        volvo.getMechanic().add(dorohov);
        volvo.getMechanic().add(limako);
        jac.getMechanic().add(limako);
        jac.getMechanic().add(petrov);
        isuzu.getMechanic().add(petrov);
        paz.getMechanic().add(dorohov);
        paz.getMechanic().add(petyaPetrov);
        bmv.getMechanic().add(petrov);
        hyundai.getMechanic().add(fedorenko);
        audi.getMechanic().add(fedorenko);

        //метод вывести водителя авто с именем и механиками
        findCarData(kia,higer1,hyundai,higer,liaz,shacman,volvo,jac,isuzu,paz,bmv,audi);


        // метод починить машину
        fixTheCar(petyaPetrov,sidorov,limako,fedorenko,petrov,dorohov);


        // метод провести техобслуживание.
        performMaintenance(limako);
        performMaintenance(dorohov);
        performMaintenance(petrov);
        performMaintenance(petyaPetrov);
        performMaintenance(fedorenko);
        performMaintenance(sidorov);




}

    public static void findCarData(Transport... transport) {
        for (Transport transport1 : transport) {
            transport1.findCarData();
        }
    }

    public static void fixTheCar (Mechanic... mechanics) {
        for (Mechanic mechanic : mechanics) {
            mechanic.fixTheCar();
        }
    }

    public static void performMaintenance (Mechanic... mechanics) {
        for (Mechanic mechanic : mechanics) {
                mechanic.performMaintenance();
        }
    }

    public static void findCategoryDriver (Driver... drivers) {
        for (Driver driver : drivers) {
            try {
                driver.findCategoryDriverLicense();
            } catch (SpecifyDriverLicenseTypeException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void printInfo(Transport<?> transport) {
        System.out.println("Водитель " + transport.getDriver().getName() +
                " со стажем " + transport.getDriver().getExperience() + " лет, управляет автомобилем "
                + transport.getBrand() + " " + transport.getModel());
    }

}