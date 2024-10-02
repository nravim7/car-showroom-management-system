import java.util.Scanner;

public class ShowRoom implements Utility{

    String showroom_name;
    String showroom_address;
    int total_employees;
    int total_cars_in_stock = 0;
    String manager_name;


    @Override
    public void getDetails() {
        System.out.println("Showroom Name: " + this.showroom_name);
        System.out.println("Showroom Address: " + this.showroom_address);
        System.out.println("Manager Name: " + this.manager_name);
        System.out.println("Total Employees: " + this.total_employees);
        System.out.println("Total cars in stock: " + this.total_cars_in_stock);
    }

    @Override
    public void setDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("======================= *** ENTER SHOWROOM DETAILS *** =======================");
        System.out.println();
        System.out.println("SHOWROOM NAME: ");
        this.showroom_name = sc.nextLine();
        System.out.println("SHOWROOM ADDRESS: ");
        this.showroom_address = sc.nextLine();
        System.out.println("MANAGER NAME: ");
        this.manager_name = sc.nextLine();
        System.out.println("TOTAL NO OF EMPLOYEES: ");
        this.total_employees = sc.nextInt();
        System.out.println("TOTAL CARS IN STOCK: ");
        this.total_cars_in_stock = sc.nextInt();

    }
}
