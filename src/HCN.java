import java.awt.*;
import java.util.Scanner;

public class HCN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width: ");
        double width = sc.nextDouble();
        System.out.println("Enter the height: ");
        double height = sc.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Your Rectangle \n"+ rectangle.display());
        System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rectangle.getArea());
    }
    public static class Rectangle {
    double width, height;
    public Rectangle(){

    }
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return this.width*this.height;
    }
    public double getPerimeter() {
        return 2*(this.width+this.height);
    }
        public String display() {
            return "Rectangle{" + "width=" + width + ", height=" + height + "}";
        }

    }
}
