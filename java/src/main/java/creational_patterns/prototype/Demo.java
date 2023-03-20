package creational_patterns.prototype;

public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        EmployeeCache cache = new EmployeeCache();
        Employee emp1 = cache.get("will");
        Employee emp2 = cache.get("will");

        emp2.setAge(30);
        emp2.setName("will2");

        System.out.println(emp1 == emp2);
        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
    }
}
