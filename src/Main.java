import java.util.Scanner;

interface Utility {

    public void getDetails();
    public void setDetails();
}

public class Main {

    static void main_menu() {
        System.out.println();
        System.out.println("======================= *** WELCOME TO SHOWROOM MANAGEMENT SYSTEM *** =======================");
        System.out.println();
        System.out.println("=============================== *** ENTER YOUR CHOICE *** ===============================");
        System.out.println();
        System.out.println("1].ADD SHOWROOMS \t\t\t 2].ADD EMPLOYEES \t\t\t 3].ADD CARS");
        System.out.println();
        System.out.println("4].GET SHOWROOMS \t\t\t 5].GET EMPLOYEES \t\t\t 6].GET CARS");
        System.out.println();
        System.out.println("=============================== *** ENTER 0 TO EXIT *** ===============================");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShowRoom showRoom[] = new ShowRoom[5];
        Employees employees[] = new Employees[5];
        Cars cars[] = new Cars[5];

        int showroom_counter = 0;
        int employees_counter = 0;
        int cars_counter = 0;

        int choice = 100;
        while (choice != 0) {
            main_menu();
            choice = sc.nextInt();

            while (choice!=9 && choice!=0) {
                switch (choice) {
                    case 1 -> {
                        showRoom[showroom_counter] = new ShowRoom();
                        showRoom[showroom_counter].setDetails();
                        showroom_counter++;
                        System.out.println();
                        System.out.println("1].ADD NEW SHOWROOM");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                    }
                    case 2 -> {
                        employees[employees_counter] = new Employees();
                        employees[employees_counter].setDetails();
                        employees_counter++;
                        System.out.println();
                        System.out.println("2].ADD NEW SHOWROOM");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                    }
                    case 3 -> {
                        cars[cars_counter] = new Cars();
                        cars[cars_counter].setDetails();
                        cars_counter++;
                        System.out.println();
                        System.out.println("3].ADD NEW SHOWROOM");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                    }
                    case 4 -> {
                        for (int i = 0; i < showroom_counter; i++) {
                            showRoom[i].getDetails();
                            System.out.println();
                            System.out.println("=".repeat(30));
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                    }
                    case 5 -> {
                        for (int i = 0; i < employees_counter; i++) {
                            employees[i].getDetails();
                            System.out.println();
                            System.out.println("=".repeat(30));
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                    }
                    case 6 -> {
                        for (int i = 0; i < cars_counter; i++) {
                            cars[i].getDetails();
                            System.out.println();
                            System.out.println("=".repeat(30));
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                    }
                    default -> {
                        System.out.println("ENTER VALID CHOICE: ");
                    }

                }
            }
        }
    }
}
