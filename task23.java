public class Task023 {
   public static void main(String[] args){

	Student sobj1 = new Student(); 
	Student sobj2 = new Student();
	Student sobj3 = new Student();
    Student[] arr;
    arr = new Student[5];
    arr[0] = new Student(1, "srikar");
    arr[1] = new Student(2, "hari");
    arr[2] = new Student(3, "ramesh");
    arr[3] = new Student(4, "prakash");
    arr[4] = new Student(5, "mohit");
       for (int i = 0; i < arr.length; i++)
           System.out.println("Element at " + i + " : { "
                              + arr[i].roll_no + " "
                              + arr[i].name+" }");
   }
}
class Student {
   public int roll_no;
   public String name;
    Student(int Roll_no, String Name){
       this.roll_no = Roll_no;
       this.name = Name;
   }
 	Student(){
		roll_no =0;
		name = “ ”;
}
}