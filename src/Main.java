public class Main {

    public static void main(String[] args){

            CarVehicle car = new CarVehicle("car1", 4);
            CarVehicle car2 = new CarVehicle("car2", 4);

            TruckVehicle truck = new TruckVehicle("truck1", 6);
            TruckVehicle truck2 = new TruckVehicle("truck2", 8);

            BicycleVehicle bicycle = new BicycleVehicle("bicycle1", 2);
            BicycleVehicle bicycle2 = new BicycleVehicle("bicycle2", 2);

            ServiceStation station = new ServiceStation(){};

        station.check(car, null, null);
        station.check(car2, null, null);
        station.check(null, bicycle, null);
        station.check(null, bicycle2, null);
        station.check(null, null, truck);
        station.check(null, null, truck2);
    }
}

