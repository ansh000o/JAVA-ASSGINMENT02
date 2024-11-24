import java.util.Scanner;

abstract class ThreeDObject
{
    public abstract double wholeSurfaceArea();
    public abstract double volume();
}

class Box extends ThreeDObject
{
    private double l, b, h;

    public Box(double length, double b, double h)
    {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    @Override
    public double wholeSurfaceArea()
    {
        return 2 * (l * b + b * h + h * l);
    }

    @Override
    public double volume()
    {
        return l * b * h;
    }
}

class Cube extends ThreeDObject
{
    private double s;

    public Cube(double s)
    {
        this.s = s;
    }

    @Override
    public double wholeSurfaceArea()
    {
        return 6 * s * s;
    }

    @Override
    public double volume()
    {
        return s * s * s;
    }
}

class Cylinder extends ThreeDObject
{
    private double r, h;

    public Cylinder(double r, double h)
    {
        this.r = r;
        this.h = h;
    }

    @Override
    public double wholeSurfaceArea()
    {
        return 2 * Math.PI * r * (r + h);
    }

    @Override
    public double volume()
    {
        return Math.PI * r * r * h;
    }
}

class Cone extends ThreeDObject
{
    private double r, h;

    public Cone(double r, double h)
    {
        this.r = r;
        this.h = h;
    }

    @Override
    public double wholeSurfaceArea()
    {
        double slantHeight = Math.sqrt(r * r + h * h);
        return Math.PI * r * (r + slantHeight);
    }

    @Override
    public double volume()
    {
        return (1.0 / 3) * Math.PI * r * r * h;
    }
}

public class Q9
{
    public static void main(String[] args)
    {
        Scanner S = new Scanner(System.in);

        System.out.println("Enter dimensions for a Box (length, width, height):");
        double l = S.nextDouble();
        double b = S.nextDouble();
        double h = S.nextDouble();
        Box box = new Box(l, b, h);
        System.out.println("Box Surface Area: " + box.wholeSurfaceArea());
        System.out.println("Box Volume: " + box.volume());

        System.out.println("Enter the side of a Cube:");
        double s = S.nextDouble();
        Cube cube = new Cube(s);
        System.out.println("Cube Surface Area: " + cube.wholeSurfaceArea());
        System.out.println("Cube Volume: " + cube.volume());

        System.out.println("Enter dimensions for a Cylinder (radius, height):");
        double r = S.nextDouble();
        double cylinderHeight = S.nextDouble();
        Cylinder cylinder = new Cylinder(r, cylinderHeight);
        System.out.println("Cylinder Surface Area: " + cylinder.wholeSurfaceArea());
        System.out.println("Cylinder Volume: " + cylinder.volume());

        System.out.println("Enter dimensions for a Cone (radius, height):");
        double coneRadius = S.nextDouble();
        double coneHeight = S.nextDouble();
        Cone cone = new Cone(coneRadius, coneHeight);
        System.out.println("Cone Surface Area: " + cone.wholeSurfaceArea());
        System.out.println("Cone Volume: " + cone.volume());
    }
}
