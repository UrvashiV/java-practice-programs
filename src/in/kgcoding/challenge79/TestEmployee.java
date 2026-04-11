package in.kgcoding.challenge79;

public class TestEmployee {
    static void main() {
        Employee emp=new Employee("Rohan",30,25000);
        System.out.println(emp.getEmployeeDetails());
        emp.setName("Golu");
        System.out.println(emp.getEmployeeDetails());
    }
}
