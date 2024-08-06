public abstract class BlankForVehicle {

    private String modelName;
    private int wheelsCount;

    public BlankForVehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() { return this.modelName; }
    public int getWheelsCount() { return this.wheelsCount; }
    public void setModelName(String modelName) { this.modelName = modelName; }
    public void setWheelsCount(int wheelsCount) { this.wheelsCount = wheelsCount; }
    public abstract void check(Bicycle vehicle);
    public abstract void check(Car vehicle);
    public abstract void check(Truck vehicle);
}
