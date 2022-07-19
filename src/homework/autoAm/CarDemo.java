package homework.autoAm;

import java.util.Scanner;

public class CarDemo {
    private static Scanner scanner = new Scanner(System.in);
    private static CarStorage carStorage = new CarStorage();

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("please input 0 for exit");
            System.out.println("please input 1 for add car");
            System.out.println("please input 2 for print all car");


            int command = Integer.parseInt(scanner.nextLine());

            switch (command) {

                case 0:
                    run = false;

                    break;
                case 1:
                    addCar();
                    break;
                case 2:
                    carStorage.printAllCar();
                default:
                    System.out.println("invalid command");
            }
        }
    }

    public static void addCar() {
        if (carStorage.getSize() != 0) {
            carStorage.printAllCar();
            System.out.println("please choose car index");
            int carIndex = Integer.parseInt(scanner.nextLine());
            Car car = carStorage.getCarByIndex(carIndex);
            System.out.println("please input car brand");
            String brand = scanner.nextLine();
            System.out.println("please input car model");
            String model = scanner.nextLine();
            System.out.println("please input car price");
            double price = scanner.nextByte();
            System.out.println("please input car type");
            String type = scanner.nextLine();
            System.out.println("please input car transmission type");
            String transmissionType = scanner.nextLine();
            System.out.println("please input seller name");
            String sellerName = scanner.nextLine();
            System.out.println("please input seller phone");
            String sellerPhone = scanner.nextLine();
            int age = Integer.parseInt(scanner.nextLine());
//           Car car = new Car(brand, model, price, type, transmissionType);
        }
    }
}
