public class Calculator {
    public static int add (int a, int b)
    {
        return a + b;

    }
    public static int substract(int a , int b) {
        return a - b;

    }
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static int divide(int a, int b){
        return a / b;
    }
    public static void main(String[] args) {
        System.out.println("main started");
        int a = 10;
        int b = 2;

        int sum = add(a,b);
        int diff = substract(a,b);
        int prod = multiply(a, b);
        int quot = divide( a, b);
        System.out.println("sum of 2 numbers is: " + sum);
        System.out.println("diff of 2 numbers is: " + diff);
        System.out.println("product of 2 numbers is: " + prod);
        System.out.println("division of 2 numbers is: " + quot);
        System.out.println("main ended");
        
        

    }
}