class Vehicle
{
    protected String regnNumber;
    protected int speed;
    protected String color;
    protected String ownerName;

    public Vehicle(String regnNumber, int speed, String color, String ownerName)
    {
        this.regnNumber = regnNumber;
        this.speed = speed;
        this.color = color;
        this.ownerName = ownerName;
    }

    public void showData()
    {
        System.out.println("This is a vehicle class");
    }
}

class Bus extends Vehicle
{
    private int routeNumber;

    public Bus(String regnNumber, int speed, String color, String ownerName, int routeNumber)
    {
        super(regnNumber, speed, color, ownerName);
        this.routeNumber = routeNumber;
    }

    @Override
    public void showData()
    {
        super.showData();
        System.out.println("Registration Number: " + regnNumber);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Color: " + color);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Route Number: " + routeNumber);
    }
}

class Car extends Vehicle
{
    private String manufacturerName;

    public Car(String regnNumber, int speed, String color, String ownerName, String manufacturerName)
    {
        super(regnNumber, speed, color, ownerName);
        this.manufacturerName = manufacturerName;
    }

    @Override
    public void showData()
    {
        super.showData();
        System.out.println("Registration Number: " + regnNumber);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Color: " + color);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Manufacturer Name: " + manufacturerName);
    }
}

public class Q10
{
    public static void main(String[] args)
    {
        Bus bus = new Bus("MP09 7001", 60, "Yellow", "Udit narayan", 07);
        System.out.println("Bus Details:");
        bus.showData();

        Car car = new Car("MP22 8989", 100, "White", "Ansh", "Morris Garage");
        System.out.println("\nCar Details:");
        car.showData();
    }
}
