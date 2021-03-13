public class matematikaDemo {
    public static void main(String[] args) {
        matematika calculator = new matematika();
        calculator.pertambahan(20, 20);
        calculator.pengurangan(10, 5);
        calculator.perkalian(10, 20);
        calculator.pembagian(20, 2);
    }
}

class matematika {
    matematika() {

    }

    public void pertambahan(int num1, int num2) {
        int hasil = num1 + num2;
        System.out.println("Pertambahan: " + num1 + " + " + num2 + " = " + hasil);
    }

    public void pengurangan(int num1, int num2) {
        int hasil = num1 - num2;
        System.out.println("Pengurangan: " + num1 + " - " + num2 + " = " + hasil);
    }

    public void perkalian(int num1, int num2) {
        int hasil = num1 * num2;
        System.out.println("Perkalian: " + num1 + " x " + num2 + " = " + hasil);
    }

    public void pembagian(int num1, int num2) {
        int hasil = num1 / num2;
        System.out.println("Pembagian: " + num1 + " / " + num2 + " = " + hasil);
    }
}
