import java.util.Scanner;

public class Main {
    public static String check(int age, boolean hasLicense, double bloodAlcoholLevel) {
        if (age < 18 || age > 65 || age < 0) {
            return "Not allowed";
        } else if (hasLicense && bloodAlcoholLevel < 0.08) {
            return "Allowed";
        } else {
            return "Invalid";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.print("have a driver's license (true/false): ");
        boolean hasLicense = scanner.nextBoolean();

        System.out.print("Enter blood alcohol level: ");
        double bloodAlcoholLevel = scanner.nextDouble();

        String result = check(age, hasLicense, bloodAlcoholLevel);
        System.out.println(result);
    }
}