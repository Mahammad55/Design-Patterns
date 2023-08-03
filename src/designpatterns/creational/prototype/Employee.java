package designpatterns.creational.prototype;

public class Employee implements Prototype{
    private Long id;
    private String name;
    private String surname;

    public Employee(Long id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public Prototype clone() {
        return new Employee(this.id,this.name,this.surname);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
