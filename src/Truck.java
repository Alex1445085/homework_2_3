public class Truck extends BlankForVehicle {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check(Bicycle vehicle) {
    }

    @Override
    public void check(Car vehicle) {
    }


    @Override
    public void check(Truck vehicle) {
        System.out.println("Обслуживаем " + super.getModelName());
        for (int i = 0; i < super.getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
        checkTrailer();
    }
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
