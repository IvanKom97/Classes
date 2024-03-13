public class Main {
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
        Employee.printList(employee);
        System.out.println("all cost is: " + Employee.allSalary(employee));
        System.out.println("Max salary is: " + Employee.maxSalary(employee));
        System.out.println("minimal salary is: " + Employee.minSalary(employee));
        System.out.println("average salary is: " + Employee.averageSalary(employee));
        System.out.println();
        Employee.printName(employee);
    }
}
