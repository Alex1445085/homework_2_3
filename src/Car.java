public class Car extends BlankForVehicle{

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check(Bicycle vehicle) {
    }

    @Override
    public void check(Car vehicle) {
        System.out.println("Обслуживаем " + super.getModelName());
        for (int i = 0; i < super.getWheelsCount(); i++) {
            System.out.println("Меняем покрышку");
        }
    }

    @Override
    public void check(Truck vehicle) {
    }

    public void updateTyre() { System.out.println("Меняем покрышку"); }
    public void checkEngine() { System.out.println("Проверяем двигатель"); }
}
