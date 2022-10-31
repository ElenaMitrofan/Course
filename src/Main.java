import java.util.Arrays;
import java.util.Comparator;

import static java.lang.Double.min;

public class Main {
    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++){
            Employee employee = new Employee(i % 5 + 1, Math.random() * 300000, "Иванов" + i);
            employees[i - 1] = employee;
        }
        System.out.println(getAllInfo());
        System.out.println(getEmployeeWithMinSalary());
    }

    public static String getAllInfo(){
        StringBuilder stringBuilder = new StringBuilder();

        for (Employee employee : employees) {
            stringBuilder.append(employee.toString()).append("\n");
        }
        return stringBuilder.toString();
    }

    public static Employee getEmployeeWithMinSalary(){
        double minSalary = Double.MAX_VALUE;
        Employee minEmployee = null;
        for (int i = 0; i < employees.length; i++){
            Employee employee = employees[i];
            double minSalaryNew = min(minSalary, employee.getSalary());
            if (minSalaryNew != minSalary){
                minEmployee = employee;
                minSalary = minSalaryNew;
            }

        }
        return minEmployee;}
}