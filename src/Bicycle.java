public class Bicycle extends BlankForVehicle {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check(Car vehicle) {
    }

    @Override
    public void check(Truck vehicle) {
    }

    public void check(Bicycle vehicle) {
        System.out.println("Обслуживаем " + super.getModelName());
        for (int i = 0; i < super.getWheelsCount(); i++) {
            updateTyre();
        }
    }
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}
