public class Task032 extends Calculation {
   public void multiplication(int x, int y) {
      z = x * y;
      System.out.println("The product of the given numbers:"+z);
   }
	
   public static void main(String args[]) {
      int a = 20, b = 10;
      Task032 demo = new Task032();
      demo.addition(a, b);
      demo.Subtraction(a, b);
      demo.multiplication(a, b);
      demo.division(a, b);
   }
}
public class Calculation extends clock{
   int z;
	
   public void addition(int x, int y) {
      z = x + y;
      System.out.println("The sum of the given numbers:"+z);
   }
	
   public void Subtraction(int x, int y) {
      z = x - y;
      System.out.println("The difference between the given numbers:"+z);
   }
}
public class clock {
     int z;
      
      public void division(int x, int y) {
          z = x / y;
          System.out.println("The division of the given numbers:"+z);
      }

}