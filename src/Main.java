import java.util.Objects;

public class Main {

    public static float allSalary(Employee[] employees) {
        float allSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            allSalary += employees[i].getSalary();
        }
        return allSalary;
    }

    public static float averageSalary(Employee[] employees) {
        float average = Main.allSalary(employees) / employees.length;
        return average;
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

    public static float maxSalary(Employee[] employees) {
        float maxSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (maxSalary < employees[i].getSalary()) {
                maxSalary = employees[i].getSalary();
            }
        }
        return maxSalary;
    }


    public static void printName(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Name is: " + employees[i].getName() + ". Second name is: " + employees[i].getSecondName());
        }
    }



    public static void main(String[] args) {
        Employee employee[] = new Employee[10];
        employee[0] = new Employee("Sergey", "Babushkin", 45000,1);
        employee[1] = new Employee("Alesha", "Petrosyan", 78000,2);
        employee[2] = new Employee("Arkasha", "Valuev", 45654.34f,3);
        employee[3] = new Employee("Kate", "Komova", 34567,5);
        employee[4] = new Employee("Nastya", "Zueva", 400000,4);
        employee[5] = new Employee("Andryha", "Gorbunov", 9000,3);
        employee[6] = new Employee("Semen", "Zorya", 20000,2);
        employee[7] = new Employee("Ivan", "Komov", 999999.99f,1);
        employee[8] = new Employee("Ted", "Borgomi", 34000,4);
        employee[9] = new Employee("John", "Alekseev", 48500,5);
        System.out.println(employee[2].toString());
    }
}
