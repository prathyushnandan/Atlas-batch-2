import java.util.Scanner;
public class task010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        
        if ((num1 > num2) && (num1 > num3)) {
            System.out.println("num1  is the greater");

        }
        else if ((num2 > num1) && (num2 > num3)) {
            System.out.println("num2 is the greater");
        }
         else if ((num3 > num1) && (num3 > num2)) {
            System.out.println("num3  is the greater");
    }
    else {
        System.out.println(" All numbers are equal");

    }
    scanner.close();
}
}
