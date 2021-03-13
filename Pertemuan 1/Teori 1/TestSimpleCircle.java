public class TestSimpleCircle {
    public static void main(String[] args) {
        SimpleCircle circle1 = new SimpleCircle();
        System.out.println("Area dari radius lingkaran" + circle1.radius + " Adalah " + circle1.getArea());
        SimpleCircle circle2 = new SimpleCircle(25);
        System.out.println("Area dari radius lingkaran" + circle2.radius + " Adalah " + circle2.getArea());
    }

}

class SimpleCircle {
    double radius = 1;

    SimpleCircle() {

    }

    SimpleCircle(int newRad) {
        this.radius = newRad;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}