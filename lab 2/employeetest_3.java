import java.util.Scanner;

class employee {
    String name;
    String l_name;
    double month_salary;

    employee(String name, String l_name, double month_salary) {
        setName(name);
        setLName(l_name);
        setSalary(month_salary);
    }

    void setName(String name) {
        this.name = name;
    }
    void setLName(String l_name) {
        this.l_name = l_name;
    }

    void setSalary(double month_salary) {
        if (month_salary >0) {
            this.month_salary = month_salary;
        }    
        else{
            this.month_salary = 0;
        }
    }
    
    double salary(double month_salary) {
        return 12*month_salary;
    }
}

public class employeetest_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //employee1
        System.out.println("The 1st Employee");
        System.out.println("Enter the first name: ");
        String name1 = sc.nextLine();

        System.out.println("Enter the last name: ");
        String lname1 = sc.nextLine();

        System.out.println("Enter the monthly salary");
        double m_salary1 = sc.nextDouble();

        employee e1 = new employee(name1, lname1, m_salary1);
        double salary_1 = e1.salary(m_salary1);

        sc.nextLine(); // -> to clear buffer for input of name2 and lname2

        //employee2
        System.out.println("The 2nd Employee");
        System.out.println("Enter the first name: ");
        String name2 = sc.nextLine();

        System.out.println("Enter the last name: ");
        String lname2 = sc.nextLine();

        System.out.println("Enter the monthly salary");
        double m_salary2 = sc.nextDouble();

        employee e2 = new employee(name2, lname2, m_salary2);
        double salary_2 = e2.salary(m_salary2);

        System.out.printf("The yearly salary of employee 1 %s is %f\n",name1, salary_1);
        System.out.printf("The yearly salary of employee 2 %s is %f", name2, salary_2);

        sc.close();
    }
}
