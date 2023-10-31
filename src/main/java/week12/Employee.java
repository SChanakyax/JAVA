package week12;

public class Employee {

    public void calculateSalary(double salary) {
        System.out.println("Employee Salary : ");
    }
}


class FullTimeEmployee extends Employee {
    @Override
    public void calculateSalary(double salary) {
        System.out.println("Full time salary : " + salary);
    }
}

class PartTimeEmployee extends Employee {
    @Override
    public void calculateSalary(double salary) {
        super.calculateSalary(salary);
        System.out.println("Part time salary " + salary);
    }
}

class Run {
    public static void main(String[] args) {
        FullTimeEmployee fe = new FullTimeEmployee();
        fe.calculateSalary(12000.34);

        PartTimeEmployee pe = new PartTimeEmployee();
        pe.calculateSalary(456.34);
    }
}