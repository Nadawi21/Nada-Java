package src;

public class Ovningar2 {
    public static void main (String [] args){
        Employee employee1 = new Employee("Nada","Fina Svenséns", "999-999");

        employee1.setPosition("chef");
        employee1.setSalary(39500);

        employee1.salaryRaise(employee1.getSalary());

        System.out.println(employee1);
    }
}
