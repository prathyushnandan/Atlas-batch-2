import java.util.Scanner;
public class task007 {
    public static void main(String[] args){
        Scanner sc = new
        Scanner(System.in);
        System.out.print("enter yor email id:");
        String email = sc.nextLine();
        System.out.print("enter your password:");
        String password = sc.nextLine();
        System.out.println("\n your entered details:");
        System.out.println("Email ID:" + email );
        String hiddenPassword = new String(new char[password.length()]).replace("\0", "*");

        System.out.println("password:" + hiddenPassword);
        sc.close();
           }
}
