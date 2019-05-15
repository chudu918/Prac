import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        EmployeeFullTime eft = new EmployeeFullTime();
        EmployeePartTime ept = new EmployeePartTime();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert Base Salary");
        float baseSalary = scanner.nextFloat();
        System.out.println("Full Time Salary: " + eft.getSalary());
        System.out.println("Parttime Salary: " + ept.getSalary());


    }
}
