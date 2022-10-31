public class Main {
    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++){
            Employee employee = new Employee(i % 5 + 1, Math.random() * 300000, "Иванов" + i);
            employees[i - 1] = employee;
        }
        System.out.println(getAllInfo());
    }

    public static String getAllInfo(){
        StringBuilder stringBuilder = new StringBuilder();

        for (Employee employee : employees) {
            stringBuilder.append(employee.toString()).append("\n");
        }
        return stringBuilder.toString();
    }
}