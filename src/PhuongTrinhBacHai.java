import java.util.Scanner;

public class PhuongTrinhBacHai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = sc.nextDouble();
        System.out.println("Enter b: ");
        double b = sc.nextDouble();
        System.out.println("Enter c: ");
        double c = sc.nextDouble();
        QuadraticEquation quadraticEquation = new  QuadraticEquation(a,b,c);
        System.out.println(quadraticEquation.getRoot1());
    }
    public static class QuadraticEquation {
        double a, b, c;
        public QuadraticEquation() {}
        public QuadraticEquation(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        public double getA() {
            return a;
        }
        public double getB() {
            return b;
        }
        public double getC() {
            return c;
        }
        public double getDiscrminant() {
            double delta= Math.pow(b, 2) - 4 * a * c;
            return delta;
        }
        public String getRoot1() {
            if(this.getDiscrminant()>0){
                double r=  (-b+Math.pow((Math.pow(b,2)-4*a*c),0.5))/2*a;
                return "Phương trình có nghiệm thứ nhất là: "+r;
            }else if(this.getDiscrminant()==0){
                double r = (-b)/2*a;
                return "Phương trình có nghiệm kép: "+r;
            }else {
                return "Phương trình vô nghiệm";
            }
        }
        public String getRoot2() {
            if(this.getDiscrminant()>0){
                double r=  (-b-Math.pow((Math.pow(b,2)-4*a*c),0.5))/2*a;
                return "Phương trình có nghiệm thứ nhất là: "+r;
            }else if(this.getDiscrminant()==0){
                double r = (-b)/2*a;
                return "Phương trình có nghiệm kép: "+r;
            }else {
                return "Phương trình vô nghiệm";
            }
        }
    }
}
