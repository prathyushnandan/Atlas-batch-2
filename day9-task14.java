class OuterClass {
  int x = 10;

  class InnerClass {
    int y = 5;

    // Method to return the outer class variable x
    public int getOuterX() {
      return OuterClass.this.x; // Accessing x from the OuterClass instance
    }
  }
}

public class Main {
  public static void main(String[] args) {
    OuterClass myOuter = new OuterClass();
    OuterClass.InnerClass myInner = myOuter.new InnerClass();

    // Now call the new method from myInner to get x
    System.out.println("Value of x from InnerClass method: " + myInner.getOuterX()); // Output: 10
    System.out.println("Sum of inner y and outer x: " + (myInner.y + myOuter.x)); // Original sum: 15
  }
}