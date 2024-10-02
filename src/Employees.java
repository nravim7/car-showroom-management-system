import java.util.Scanner;
import java.util.UUID;

public class Employees extends ShowRoom implements Utility{
    String emp_id;
    String emp_name;
    int emp_age;
    String emp_department;

    @Override
    public void getDetails() {
        System.out.println("ID: " + this.emp_id);
        System.out.println("Name: " + this.emp_name);
        System.out.println("Age: " + this.emp_age);
        System.out.println("Department: " + this.emp_department);
        System.out.println("Showroom Name: " + this.showroom_name);
    }

    @Override
    public void setDetails() {
        Scanner sc = new Scanner(System.in);
        UUID uuid = UUID.randomUUID();
        this.emp_id = uuid.toString();
        System.out.println("======================= *** ENTER EMPLOYEE DETAILS *** =======================");
        System.out.println();
        System.out.print("EMPLOYEE NAME: ");
        this.emp_name = sc.nextLine();
        System.out.print(("EMPLOYEE AGE: "));
        this.emp_age = sc.nextInt();
        sc.nextLine();
        System.out.print("EMPLOYEE DEPARTMENT: ");
        this.emp_department = sc.nextLine();
        System.out.print("SHOWROOM NAME: ");
        this.showroom_name = sc.nextLine();
        total_employees++;
    }
}
