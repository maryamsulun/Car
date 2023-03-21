import java.util.Scanner;

class RectangleArea {

    public static void main(String[]args)
    {
        double length;
        double width;
        double area;

        length = getLength();
        width = getWidth();
        area = getArea(length, width);
        displayData(length, width, area);
    }

    public static double getLength()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter length. ");
        double length = keyboard.nextDouble();
        System.out.println("The length is " + length);
        return length;
    }
    public static double getWidth()
    {
        Scanner keyboard = new Scanner(System.in);
        double width;
        System.out.println("Enter width. ");
        width = keyboard.nextDouble();
        System.out.println("The width is " + width);
        return width;
    }

    public static double getArea(double length, double width)
    {
        double area = length * width;
        System.out.println("The area is: " + area);
        return area;
    }

    public static void displayData(double length, double width, double area)
    {
        System.out.println(" The length is: \t" + length);
        System.out.println(" The width is: \t" + width);
        System.out.println(" The area is: \t" + area);
    }

}