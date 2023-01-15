import transport.*;

public class Main {
    public static void main(String[] args) {
        DriverD alex = new DriverD("Alex cat. D", true, 20);
        DriverD ivan = new DriverD("Ivan cat. D", true, 13);
        DriverD fedor = new DriverD("Fedor cat. D", true, 6);
        DriverD sergei = new DriverD("Sergei cat. D", true, 5);
        DriverB igor = new DriverB("Igor cat. B", true, 1);
        DriverB viktor = new DriverB("Viktor cat. B", true, 7);
        DriverB oleg = new DriverB("Oleg cat. B", true, 11);
        DriverB misha = new DriverB("Misha cat. B", true, 7);
        DriverC vova = new DriverC("Vova cat. C", true, 6);
        DriverC petya = new DriverC("Petya cat. C", true, 15);
        DriverC kolya = new DriverC("Kolya cat. C", true, 8);
        DriverC andrey = new DriverC("Andrey cat. C", true, 6);

        Bus liaz = new Bus("ЛиАЗ", "529267", 8.6, alex, Bus.BusCapacity.AVERAGE);
        printInfo(liaz);

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

        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, misha, Car.BodyType.CROSSOVER);
        printInfo(audi);

        Trucks isuzu = new Trucks("Isuzu", "Forward", 5.2, vova, Trucks.LoadCapacity.N3);
        printInfo(isuzu);

        Trucks jac = new Trucks("JAC", "N350", 6.9, petya, Trucks.LoadCapacity.N1);
        printInfo(jac);

        Trucks volvo = new Trucks("Volvo", "VHD", 15.0, kolya, Trucks.LoadCapacity.N3);
        printInfo(volvo);

        Trucks shacman = new Trucks("Shacman", "X3000", 12.0, andrey, Trucks.LoadCapacity.N2);
        printInfo(shacman);



    }

    private static void printInfo(Transport<?> transport) {
        System.out.println("Водитель " + transport.getDriver().getName() +
                " со стажем "+ transport.getDriver().getExperience()+" лет, управляет автомобилем "
                + transport.getBrand() + " " + transport.getModel()  + " и будет учавствовать в заезде");
    }
}