public class task012 {
    public static void main(String[] args) {
        System.out.println("Countdown from 10 to 1 (Skipping 7 and 5):");
        for (int i =10; i >= 1; i--) {
            if (i !=7 && i != 5) {
                System.out.println(i);
            }
        }
    }
}