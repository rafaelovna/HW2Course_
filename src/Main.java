import transport.*;

public class Main {
    public static void main(String[] args) {
        Driver_D alex = new Driver_D("Alex cat. D", true, 20);
        Driver_D ivan = new Driver_D("Ivan cat. D", true, 13);
        Driver_D fedor = new Driver_D("Fedor cat. D", true, 6);
        Driver_D sergei = new Driver_D("Sergei cat. D", true, 5);
        Driver_B igor = new Driver_B("Igor cat. B", true, 1);
        Driver_B viktor = new Driver_B("Viktor cat. B", true, 7);
        Driver_B oleg = new Driver_B("Oleg cat. B", true, 11);
        Driver_B misha = new Driver_B("Misha cat. B", true, 7);
        Driver_C vova = new Driver_C("Vova cat. C", true, 6);
        Driver_C petya = new Driver_C("Petya cat. C", true, 15);
        Driver_C kolya = new Driver_C("Kolya cat. C", true, 8);
        Driver_C andrey = new Driver_C("Andrey cat. C", true, 6);

        Bus liaz = new Bus("ЛиАЗ", "529267", 8.6, alex);
        printInfo(liaz);

        Bus higer = new Bus("Higer", "KLQ 6129", 9.5, ivan);
        printInfo(higer);

        Bus paz = new Bus("ПАЗ", "320405-04", 4.6, fedor);
        printInfo(paz);

        Bus higer1 = new Bus("Higer", "KLQ 6128", 9.5,sergei);
        printInfo(higer1);

        Car hyundai = new Car("Hyundai", "Avante", 1.6, igor);
        printInfo(hyundai);

        Car kia = new Car("Kia", "Sportage 4-го поколения", 1.8, viktor);
        printInfo(kia);

        Car bmv = new Car("BMW", "Z8", 3.0, oleg);
        printInfo(bmv);

        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, misha);
        printInfo(audi);

        Trucks isuzu = new Trucks("Isuzu", "Forward", 5.2, vova);
        printInfo(isuzu);

        Trucks jac = new Trucks("JAC", "N350", 6.9, petya);
        printInfo(jac);

        Trucks volvo = new Trucks("Volvo", "VHD", 15.0, kolya);
        printInfo(volvo);

        Trucks shacman = new Trucks("Shacman", "X3000", 12.0, andrey);
        printInfo(shacman);

    }

    private static void printInfo(Transport<?> transport) {
        System.out.println("Водитель " + transport.getDriver().getName() +
                " со стажем "+ transport.getDriver().getExperience()+" лет, управляет автомобилем "
                + transport.getBrand() + " " + transport.getModel() + " и будет учавствовать в заезде");
    }
}