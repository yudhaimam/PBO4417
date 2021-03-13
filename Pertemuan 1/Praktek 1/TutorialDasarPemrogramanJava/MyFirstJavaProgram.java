public class MyFirstJavaProgram {
    public static void main(String[] args) {
        // Cara print hello world di java
        System.out.println("Hello World");

        // Type Data in Java
        int a, b;
        a = 10;

        // Ternary Operator in Java
        b = (a == 1) ? 20 : 30;
        System.out.println("Value of b is : " + b);
        b = (a == 10) ? 20 : 30;
        System.out.println("Value of b is : " + b);

        // Array in Java
        String[] names = { "Lilik", "Wahyu", "Nugroho" };
        // Looping in Java
        for (String name : names) {
            System.out.print(name + ", ");
        }
        System.out.println("");

        // Decision Making with if in Java
        int ages = 21;

        if (ages < 18 && ages > 12) {
            System.out.println("I am a tenage");
        } else if (ages >= 18) {
            System.out.println("I am an adult");
        } else if (ages < 12) {
            System.out.println("I am a kid");
        } else {
            System.out.println("Ages unkown");
        }

        // Decision Making with switch in Java
        String gender = "Female";
        switch (gender) {
            case "Female":
                System.out.println("I am a Female");
                break;
            case "Male":
                System.out.println("I am a Male");
                break;
        }

    }
}