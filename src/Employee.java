public class Employee {
    private final int id;
    private int department;
    private double salary;

    private String FIO;

    public Employee(int department, double salary, String fio) {
        this.id = SequenceManager.getNextSequence();
        this.department = department;
        this.salary = salary;
        this.FIO = fio;
    }

    public int getId() {
        return id;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString(){
        return FIO + " " + department +" "+ salary;

    }

}
