package transport;

public class DriverB extends Driver{


    public DriverB(boolean driverLicense, String name, int experience, FindCategory findCategoryB) {
        super(driverLicense, name, experience);
        this.findCategoryB = findCategoryB;
    }

    private FindCategory findCategoryB;

    public FindCategory getFindCategoryB() {
        return findCategoryB;
    }


    @Override
    public void startMoving() {
        System.out.println("Водитель категории В " + getName() + " начал движение");
    }

    @Override
    public void finishMovement() {
        System.out.println("Водитель категории В " + getName() + " закончил движение");
    }

    @Override
    public void refuelCar() {
        System.out.println("Водитель категории В " + getName() + " заправляет авто");
    }


    //Метод для выявления категории водительских прав.
    // Добавила проверки, если нет водительских прав он не выведет категорию.
    //Проверка чтобы не присвоить другую категорию для водителей легковых авто,
    // не знаю насколько это уместно, но раз мы в данном классе пишем методы для легковых авто,
    // не хотелось бы путаницы в майне)) Только для данного задания, в жизни понятно,
    // что в правах могут быть указаны все категории.

    @Override
    public void findCategoryDriverLicense()throws SpecifyDriverLicenseTypeException {
        if (!isDriverLicense()) {
            throw new SpecifyDriverLicenseTypeException("У ВОДИТЕЛЯ " + getName() + " НЕТ ПРАВ!");
        }else if (findCategoryB == FindCategory.B) {
            System.out.println("Категория прав у водителя " + getName() + ": " + getFindCategoryB());
        } else if (findCategoryB == null){
            throw new SpecifyDriverLicenseTypeException("У ВОДИТЕЛЯ: " + getName() + " НЕОБХОДИМО УКАЗАТЬ ТИП ВОДИТЕЛЬСКИХ ПРАВ!");
        } else if (findCategoryB != FindCategory.B) {
            throw new SpecifyDriverLicenseTypeException("У ВОДИТЕЛЯ: " + getName() + " КАТЕГОРИЯ ПРАВ УКАЗАНА НЕВЕРНО!");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Категория: B ";
    }
}
