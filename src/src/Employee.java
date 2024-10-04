package src;

public class Employee extends Person {

    private String position;
    private double salary;

    @Override
    public String toString() {
        return super.toString() +"\n"+ "Employee{" +
                "position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Employee(String namn, String adress, String personnummer) {
        super(namn, adress, personnummer);
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public double salaryRaise(double salary) {

        return salary * 1.1;
    }
}
