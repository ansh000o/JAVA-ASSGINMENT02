class Distance
{
    protected double Miles;

    public Distance(double Miles)
    {
        this.Miles = Miles;
    }

    public void travelTime()
    {
        double time = Miles / 60;
        System.out.println("Time taken to travel " + Miles + " miles at 60 mph: " + time + " hours");
    }
}

class DistanceMKS extends Distance
{
    public DistanceMKS(double KM)
    {
        super(KM);
    }

    @Override
    public void travelTime()
    {
        double time = Miles / 100; 
        System.out.println("Time taken to travel " + Miles + " kilometers at 100 km/s: " + time + " seconds");
    }
}

public class Q12
{
    public static void main(String[] args)
    {
        Distance distMiles = new Distance(120);
        System.out.println("Base Class Output:");
        distMiles.travelTime();

        DistanceMKS distKm = new DistanceMKS(200);
        System.out.println("\nDerived Class Output:");
        distKm.travelTime();
    }
}
