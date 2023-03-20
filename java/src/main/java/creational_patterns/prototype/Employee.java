package creational_patterns.prototype;

public class Employee implements Cloneable {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Employee(Employee employee) {
        if (employee != null) {
            this.name = employee.name;
            this.age = employee.age;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
    }

    @Override
    protected Object clone() {
        return new Employee(this);
    }
}
