public class Task024{
   public static void main (String[] args){
       Student[] myStudents = new Student[]{
         new Student("Dharma"),new Student("sanvi"),
         new Student("Rupa"),new Student("Ajay")
       };
       for(Student m:myStudents){   
           System.out.println(m);
       }
   }
}
class Student{
   public String name;
    Student(String name){
       this.name = name;
   }
    
//   @Override
   public String toString(){
       return name;
   }
}