import java.util.Scanner;

public class AgeValidity {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age;
        age = sc.nextInt();

        boolean drivingUnderAge;

        int legalAge = 18;

        drivingUnderAge = legalAge == age;

        System.out.println(drivingUnderAge);
    }
}
