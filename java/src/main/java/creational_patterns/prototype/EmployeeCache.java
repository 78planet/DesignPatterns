package creational_patterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class EmployeeCache {
    private Map<String, Employee> cache = new HashMap<>();

    public EmployeeCache() {
        Employee emp = new Employee("will", 23);
        cache.put("will", emp);
    }

    public Employee get(String key) {
        return (Employee)cache.get(key).clone();
    }
}
