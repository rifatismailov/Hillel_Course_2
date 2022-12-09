package homework_three.cars;

public class Car {

    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
    }

    private void startElectricity() {
        System.out.println("Start Electricity");
    }

    private void startCommand() {
        System.out.println("Start Command");
    }

    private void startFuelSystem() {
        System.out.println("start Fuel System");
    }
}
