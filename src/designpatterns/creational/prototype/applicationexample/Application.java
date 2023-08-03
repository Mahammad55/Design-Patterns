package designpatterns.creational.prototype.applicationexample;

public class Application {
    public static void main(String[] args) {
        Employee employee = new Employee(1L, "Mahammad", "Ilyazov");
        Employee employee1= (Employee) employee.clone();
        Employee employee2= (Employee) employee.clone();

        System.out.println(employee);
        System.out.println(employee1);
        System.out.println(employee2);
    }
}
