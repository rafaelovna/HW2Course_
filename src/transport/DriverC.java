package transport;

public class DriverC extends Driver {


    public DriverC(boolean driverLicense, String name, int experience, FindCategory findCategoryC) {
        super(driverLicense, name, experience);
        this.findCategoryC = findCategoryC;
    }

   private FindCategory findCategoryC;

    public FindCategory getFindCategoryC() {
        return findCategoryC;
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель категории C " + getName() + " начал движение");
    }

    @Override
    public void finishMovement() {
        System.out.println("Водитель категории C " + getName() + " закончил движение");
    }

    @Override
    public void refuelCar() {
        System.out.println("Водитель категории C " + getName() + " заправляет авто");
    }


    //Метод для выявления категории водительских прав.
    // Добавила проверки, если нет водительских прав он не выведет категорию.
    //Проверка чтобы не присвоить другую категорию для водителей легковых авто,
    // не знаю насколько это уместно, но раз мы в данном классе пишем методы для легковых авто,
    // не хотелось бы путаницы в майне)) Только для данного задания, в жизни понятно,
    // что в правах могут быть указаны все категории.
    @Override
    public void findCategoryDriverLicense() throws SpecifyDriverLicenseTypeException {
        if (!isDriverLicense()) {
            throw new SpecifyDriverLicenseTypeException("У ВОДИТЕЛЯ " + getName() + " НЕТ ПРАВ!");
        }else if (findCategoryC == FindCategory.C) {
            System.out.println("Категория прав у водителя " + getName() + ": " + getFindCategoryC());
        } else if (findCategoryC == null){
            throw new SpecifyDriverLicenseTypeException("У ВОДИТЕЛЯ: " + getName() + " НЕОБХОДИМО УКАЗАТЬ ТИП ВОДИТЕЛЬСКИХ ПРАВ!");
        } else if (findCategoryC != FindCategory.C) {
            throw new SpecifyDriverLicenseTypeException("У ВОДИТЕЛЯ: " + getName() + " КАТЕГОРИЯ ПРАВ УКАЗАНА НЕВЕРНО!");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Категория: C ";
    }
}
