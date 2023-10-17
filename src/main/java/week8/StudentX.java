package week8;

public class StudentX {
    String name;
    String regNo;
    int grade;
    String subject;

    StudentX() {
        System.out.println("The Student Profile :: ");
        name = "Saman  Kaldera";
        regNo = "IT1234456";
    }

    StudentX(String name, String regNo) {
        this.name = name;
        this.regNo = regNo;
    }

    static void print() {
        System.out.println("Static methods donot need any objects. Class can directly call static methods !");
    }

    public float calGrade(int s1, int s2, int s3, int s4) {
        ///total
        int total = s1 + s2 + s3 + s4;

        //average
        float ave = total / 4f;

        System.out.println(ave);
        return ave;
    }

    public void printInfo(float ave) {
        System.out.println("Student " + this.name + "Student regNo : " + this.regNo);
        //status
        System.out.println("Grade of the Student is : ");
        if (ave < 45) {
            System.out.print("F");
        } else if (ave <= 45 && ave < 55) {
            System.out.print("S");
        } else if (ave <= 55 && ave < 65) {
            System.out.print("C");
        } else if (ave <= 65 && ave < 75) {
            System.out.print("B");
        } else if (ave <= 75 && ave <= 100) {
            System.out.print("A");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegNo() {
        return regNo;
    }

    private void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

}
