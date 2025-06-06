

public class task20 {
    public static void main(String[] args) {
        char [] Name = {'n','a','n','d','a','n'};
        System.out.println("Name:" + new String(Name));
        int n = Name.length;
        System.out.println("there are " + n + " letters in my name");
        System.out.println("Letters:");
        for(int i =0; i < n; i++) {
            System.out.print(Name[i] + "");
        }
    }
}