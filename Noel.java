class Triangle {
    public static double area;

    public static void calculateArea(double base, double height) {
        area = 0.5 * base * height;
    }
}
class Noel {
    public static void main(String[] args) {
        double base = 10.0;
        double height = 5.0;

        Triangle.calculateArea(base, height);

        System.out.println("The area of the triangle is: " + Triangle.area);
    }
}