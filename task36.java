public class Task036 {

    // Method to handle int and float
    void add(int x, float y) {
        // Format for "x = 100 y = 80.8"
        System.out.println("x = " + x + " y = " + String.format("%.1f", y));
    }

    // Method to handle float and int
    void add(float x, int y) {
        // Format for "x = 10.5 y = 60"
        System.out.println("x = " + String.format("%.1f", x) + " y = " + y);
    }

    public static void main(String[] args) {
        Task036 obj = new Task036();

        // Call the float, int version first to match the desired output order
        obj.add(10.50f, 60);

        // Call the int, float version second
        obj.add(100, 80.8f);
    }
}