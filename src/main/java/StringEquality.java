import java.util.Scanner;
public class StringEquality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String name;
        name = sc.nextLine();
        String M = "Moe";
        if (M.equals(name)){
            System.out.println("You are the king of rock");
        }else {
            System.out.println("You are not the king of rock");
        }
    }

}
