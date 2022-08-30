import java.util.Scanner;

public class ChkOddEven {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int num = 0;
        System.out.println("Enter a number:");
        num = sc.nextInt();

        if(num == 2){
            System.out.println("Even");
        }
        if(num == 4){
            System.out.println("Even");
        }
        if(num == 6){
            System.out.println("Even");
        }
        if(num == 8){
            System.out.println("Even");
        }
        if(num == 10){
            System.out.println("Even");
        }
        if(num == 1){
            System.out.println("Even");
        }
        if(num == 3){
            System.out.println("Even");
        }
        if(num == 5){
            System.out.println("Even");
        }
        if(num == 7){
            System.out.println("The num is odd " + num);
        }
        if(num == 9){
            System.out.println("Even");
        }
    }
}

