package week11;

enum eType {FULLTIME, PARTTIME, CONTRACT}

public class Employee {

    String name;
    String empId;
    eType type;

    double salary;

    public Employee() {

    }

    public Employee(String name, String empId, eType type) {
        this.name = name;
        this.empId = empId;
        this.type = type;
    }

    double calSalary(float basic) {
        return salary = basic;
    }

    void calSalary(float basic, float allowance) {
        salary = basic + allowance;
    }

    double calSalary(float basic, int OThours, float otRate) {
        return salary = basic + (otRate * OThours);
    }

    void calSalary(int noOfDays, double dailyRate) {
        salary = noOfDays * dailyRate;
    }

    void printInfo() {
        System.out.println(this.name + " " + this.empId + " " + this.salary);
    }
}

class Calculate {
    public static void main(String[] args) {
        Employee e1 = new Employee("saman", "E1234", eType.FULLTIME);
        Employee e2 = new Employee("Kueam", "E2234", eType.CONTRACT);
        Employee e3 = new Employee("RRK", "E3345", eType.PARTTIME);


        e1.calSalary(12, 1000.5);
        e1.printInfo();

        e2.calSalary(12000f, 10000.3f);
        e2.printInfo();

        e3.calSalary(10, 1050.456);
        e3.printInfo();

    }
}