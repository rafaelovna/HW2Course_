import transport.*;

public class Main {
    public static void main(String[] args) {
        DriverD alex = new DriverD(true, "Alex ", 20, null);
        DriverD ivan = new DriverD( true, "Ivan ", 13, DriverD.FindCategory.D);
        DriverD fedor = new DriverD(true, "Fedor ", 6, DriverD.FindCategory.D);
        DriverD sergei = new DriverD(true, "Sergei ", 5, DriverD.FindCategory.D);
        DriverB igor = new DriverB(true, "Igor cat ", 1, DriverB.FindCategory.B);
        DriverB viktor = new DriverB(false, "Viktor ", 7, DriverB.FindCategory.B);
        DriverB oleg = new DriverB(true, "Oleg", 11, DriverLicense.FindCategory.B);
        DriverB misha = new DriverB(true, "Misha ", 7, DriverB.FindCategory.B);
        DriverC vova = new DriverC(true, "Vova ", 6, DriverLicense.FindCategory.C);
        DriverC petya = new DriverC(true, "Petya ", 15, DriverLicense.FindCategory.C);
        DriverC kolya = new DriverC(true, "Kolya ", 8, DriverLicense.FindCategory.C);
        DriverC andrey = new DriverC(true, "Andrey ", 6, DriverLicense.FindCategory.C);


        findCategoryDriver(oleg, viktor,alex, ivan, fedor, sergei, igor, misha, vova, petya, kolya, andrey);


        Bus liaz = new Bus("ЛиАЗ", "529267", 8.6, alex, Bus.BusCapacity.BIG);
        printInfo(liaz);
        liaz.passDiagnostics();

        Bus higer = new Bus("Higer", "KLQ 6129", 9.5, ivan, Bus.BusCapacity.BIG);
        printInfo(higer);

        Bus paz = new Bus("ПАЗ", "320405-04", 4.6, fedor, Bus.BusCapacity.SMALL);
        printInfo(paz);

        Bus higer1 = new Bus("Higer", "KLQ 6128", 9.5, sergei, Bus.BusCapacity.THE_BIGGEST);
        printInfo(higer1);

        Car hyundai = new Car("Hyundai", "Avante", 1.6, igor, Car.BodyType.SEDAN);
        printInfo(hyundai);

        Car kia = new Car("Kia", "Sportage 4-го поколения", 1.8, viktor, Car.BodyType.HATCHBACK);
        printInfo(kia);

        Car bmv = new Car("BMW", "Z8", 3.0, oleg, Car.BodyType.SEDAN);
        printInfo(bmv);
        bmv.passDiagnostics();

        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, misha, Car.BodyType.CROSSOVER);
        printInfo(audi);

        Truck isuzu = new Truck("Isuzu", "Forward", 5.2, vova, Truck.LoadCapacity.N3);
        printInfo(isuzu);

        Truck jac = new Truck("JAC", "N350", 6.9, petya, Truck.LoadCapacity.N1);
        printInfo(jac);

        Truck volvo = new Truck("Volvo", "VHD", 15.0, kolya, Truck.LoadCapacity.N3);
        printInfo(volvo);

        Truck shacman = new Truck("Shacman", "X3000", 12.0, andrey, Truck.LoadCapacity.N2);
        printInfo(shacman);
        shacman.passDiagnostics();

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