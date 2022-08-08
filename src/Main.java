import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Triangle t = new Triangle();
        System.out.print("Enter a: ");
        t.a = s.nextDouble();
        System.out.print("Enter b: ");
        t.b = s.nextDouble();
        System.out.print("Enter c: ");
        t.c = s.nextDouble();
        t.area();
    }
}

