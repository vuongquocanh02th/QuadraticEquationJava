import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter c: ");
        double c = sc.nextDouble();
        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        double delta = equation.getDiscriminant();
        if(delta < 0) {
            System.out.println("The equation has no real roots");
        } else if (delta == 0) {
            double root = equation.getRoot1();
            System.out.println("The equation has one root "+root);
        }else{
            double r1 = equation.getRoot1();
            double r2 = equation.getRoot2();
            System.out.println("The equation has two roots "+r1+" and "+r2);
        }
    }
}