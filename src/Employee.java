import java.util.Objects;

public class Employee {

    private static int chet = 1;
    private float salary;
    private int id;
    private String name;
    private int departament;
    private String secondName;

    public Employee(String name, String secondName, float salary, int departament) {
        this.id = chet++;
        this.name = name;
        this.secondName = secondName;
        this.salary = salary;
        this.departament = departament;
    }

    public int getId() {
        return this.id;
    }

    public float getSalary() {
        return this.salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getDepartament() {
        return this.departament;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Employee employee = (Employee) object;
        return Float.compare(salary, employee.salary) == 0 && id == employee.id && departament == employee.departament && Objects.equals(name, employee.name) && Objects.equals(secondName, employee.secondName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(salary, id, name, departament, secondName);
    }
    public String toString() {
        return "Name is: " + this.name + ". Second name is: " + this.secondName + ". Salary is: " + this.salary + ". Departament is: " + this.departament + ". Id is: " + this.id;
    }
}