public class Main {
    public static void main(String[] args) {

        Car c = new Car("BMW", "M3", 2023, 135.5, 10.4);

        Truck t = new Truck("Volvo", "FH 16", 2015, 540, 17.4, 3000);

        System.out.println(c.calculateFuelEfficiency());
        System.out.println(t.calculateFuelEfficiency());
    }
}