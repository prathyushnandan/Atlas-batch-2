public class task37 {
    public static void main(String[] args) {
        Hr obj = new Hr();
        obj.setValues();
        obj.showValues();
    }
}
class Employee {
    private int pwd;
    protected int salary;
    public int empid;
    
    public void setPwd(int p) {
        pwd = p;
    }
    public int getPwd() {
        return pwd;
    }
}
class Hr extends Employee {
    public void setValues() {
        setPwd(1254);
        
        super.salary = 40000;
        super.empid = 10002;
    }
    public void showValues() {
        System.out.println("Password: " + getPwd());
        System.out.println("Salary: " + salary);
        System.out.println("Employee ID: " + empid);
    }
}