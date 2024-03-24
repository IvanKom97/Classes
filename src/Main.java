import java.util.Objects;

public class Main {
    public static void ifSalaryBiggestThan(float valume, Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (valume < employees[i].getSalary()) {
                System.out.println("Зарплата у " + employees[i].getName() + " больше, чем " + valume + ". Заработная плата равна: " + employees[i].getSalary());
            }
        }
    }

    public static void ifSalaryLessThan(float valume, Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (valume > employees[i].getSalary()) {
                System.out.println("Зарплата у " + employees[i].getName() + " меньше, чем " + valume + ". Заработная плата равна: " + employees[i].getSalary());
            }
            }
    }
    public static void printPeopleOfDep(int dep, Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (dep == employees[i].getDepartament()) {
                System.out.println(employees[i].toString());
                //Или расписать строку, если без департамента, "имя: " + employee[i].getName и тд
            }
        }
    }
    public static void increaseSalaryInDepartament(float percent, Employee[] employees, int departament) {
        float newSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (departament == employees[i].getDepartament()) {
                newSalary = employees[i].getSalary() + (employees[i].getSalary() / 100 * percent);
                employees[i].setSalary(newSalary);
            }
        }
    }
    public static void averageInDepartament(int departament, Employee[] employees) {
        float average = 0;
        int length = 0;
        for (int i = 0; i < employees.length; i++) {
            if (departament == employees[i].getDepartament()) {
                average += employees[i].getSalary();
                length += employees[i].getOne();
            }
            if (departament == employees[i].getDepartament()) {
                average = average / length;
            }
        }
        System.out.println("Средняя зп в департаменте " + departament + " равна: " + average);
    }
    public static void sumOfSalaryInDepartament(int departament, Employee[] employees) {
        float sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (departament == employees[i].getDepartament()) {
                sum += employees[i].getSalary();
            }
        }
        System.out.println("Общая зп в департаменте: " + departament + " равна: " + sum);
    }
    public static void highSalaryInDepartament(int departament, Employee[] employees) {
        float highestSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (departament == employees[i].getDepartament() && highestSalary < employees[i].getSalary()) {
                highestSalary = employees[i].getSalary();
                System.out.println("Самая высокая зп в департаменте: " + departament + " у " + employees[i].getName() + ". Зп: " + employees[i].getSalary());
            }
        }
    }

    public static void theSmallestSalaryInDepartament(int departament, Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
           float lowSalary = employees[0].getSalary();
            if (employees[i].getDepartament() == departament && lowSalary > employees[i].getSalary()) {
                lowSalary = employees[i].getSalary();
                System.out.println("В департаменте " + employees[i].getDepartament() + " самая маленькая зарплата: " + lowSalary + ". Работник: " + employees[i].getName());
            }
            }

    }
    public static void increaseSalary(float percent, Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            float newSalary = employees[i].getSalary() + (employees[i].getSalary() / 100 * percent);
            employees[i].setSalary(newSalary);
        }
    }

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
        Main.theSmallestSalaryInDepartament(2, employee);
        Main.highSalaryInDepartament(4, employee);
        Main.sumOfSalaryInDepartament(4, employee);
        Main.averageInDepartament(2,employee);
        Main.increaseSalaryInDepartament(100, employee, 4);
        Main.printPeopleOfDep(2, employee);
Main.ifSalaryLessThan(50000, employee);
Main.ifSalaryBiggestThan(30000, employee);
        }
        }


