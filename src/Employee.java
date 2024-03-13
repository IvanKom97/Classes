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

    public String toString() {
        return "Name is: " + this.name + ". Second name is: " + this.secondName + ". Salary is: " + this.salary + ". Departament is: " + this.departament + ". Id: " + this.id;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Employee employee = (Employee) object;
        return Float.compare(salary, employee.salary) == 0 && Objects.equals(name, employee.name) && Objects.equals(secondName, employee.secondName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(salary, name, secondName);
    }

    public static void printList(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toString());
        }
    }

    public static float allSalary(Employee[] employees) {
        float allSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            allSalary += employees[i].getSalary();
        }
        return allSalary;
    }

    public static float maxSalary(Employee[] employees) {
        float maxSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (maxSalary < employees[i].getSalary()) {
                maxSalary = employees[i].getSalary();
            }
        }
        return maxSalary;
    }

    public static float minSalary(Employee[] employees) {
        float min = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (min > employees[i].getSalary()) {
                min = employees[i].getSalary();
            }
        }
        return min;
    }

    public static float averageSalary(Employee[] employees) {
        float average = Employee.allSalary(employees) / employees.length;
        return average;
    }

    public static void printName(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Name is: " + employees[i].getName() + ". Second name is: " + employees[i].getSecondName());
        }
    }
}
