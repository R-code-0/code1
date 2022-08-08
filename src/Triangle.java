public class Triangle {
    double a, b, c;

    public void area() {
        double d = (a + b + c) / 2;
        System.out.println(Math.sqrt((d * (d - a) * (d - b) * (d - c))));
    }
}
