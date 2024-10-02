import java.util.Scanner;

public class Cars extends ShowRoom implements Utility{

    String car_name;
    String car_color;
    String car_fuel_type;
    int car_price;
    String car_type;
    String car_transmission;

    @Override
    public void getDetails() {
        System.out.println("NAME: "+ this.car_name);
        System.out.println("COLOR: "+ this.car_color);
        System.out.println("FUEL TYPE: "+ this.car_fuel_type);
        System.out.println("PRICE: "+ this.car_price);
        System.out.println("CAR TYPE: "+ this.car_type);
        System.out.println("TRANSMISSION: "+ this.car_transmission);
    }

    @Override
    public void setDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("======================= *** ENTER CAR DETAILS *** =======================");
        System.out.println();
        System.out.print("CAR NAME: ");
        car_name = sc.nextLine();
        System.out.print(("CAR COLOR: "));
        car_color = sc.nextLine();
        System.out.print("CAR FUEL TYPE(PETROL/DIESEL): ");
        car_fuel_type = sc.nextLine();
        System.out.print("CAR PRICE: ");
        car_price = sc.nextInt();
        sc.nextLine();
        System.out.print("CAR TYPE(SEDAN/SUV/HATCHBACK): ");
        car_type = sc.nextLine();
        System.out.print("TRANSMISSION TYPE(AUTOMATIC/MANUAL): ");
        car_transmission = sc.nextLine();
        total_cars_in_stock++;
    }
}
