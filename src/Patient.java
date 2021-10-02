import java.util.Scanner;

public class Patient {
    String patientName;
    double height;
    double weight;

    double computeBMI() {
        double a = weight / (height * height);
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Patient obj = new Patient();
        obj.patientName = sc.nextLine();
        obj.height = sc.nextDouble();
        obj.weight = sc.nextDouble();
        System.out.println();

        double bmi = obj.computeBMI();
        System.out.println(bmi);
    }
}