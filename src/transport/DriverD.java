package transport;

public class DriverD extends Driver {

    public DriverD(boolean driverLicense, String name, int experience, FindCategory findCategoryD) {
        super(driverLicense, name, experience);
        this.findCategoryD = findCategoryD;
    }

   private FindCategory findCategoryD;

    public FindCategory getFindCategoryD() {
        return findCategoryD;
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель категории D " + getName() + " начал движение");
    }

    @Override
    public void finishMovement() {
        System.out.println("Водитель категории D " + getName() + " закончил движение");
    }

    @Override
    public void refuelCar() {
        System.out.println("Водитель категории D " + getName() + " заправляет авто");
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
        }else if (findCategoryD == FindCategory.D) {
            System.out.println("Категория прав у водителя " + getName() + ": " + getFindCategoryD());
        } else if (findCategoryD == null){
            throw new SpecifyDriverLicenseTypeException("У ВОДИТЕЛЯ: " + getName() + " НЕОБХОДИМО УКАЗАТЬ ТИП ВОДИТЕЛЬСКИХ ПРАВ!");
        } else if (findCategoryD != FindCategory.D) {
            throw new SpecifyDriverLicenseTypeException("У ВОДИТЕЛЯ: " + getName() + " КАТЕГОРИЯ ПРАВ УКАЗАНА НЕВЕРНО!");
        }
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString() + ". Категория: " + findCategoryD;
    }
}
