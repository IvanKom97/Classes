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
}