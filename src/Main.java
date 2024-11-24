import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FoodManager foodManager = new FoodManager();
        boolean exit = false;
        while (!exit){
            System.out.println();
            System.out.println("1 - Add food");
            System.out.println("2 - ShowAllFood");
            System.out.println("3 - RemoveFoodById");
            System.out.println("4 - Exit");
            System.out.println("Enter command: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    System.out.println("Enter id: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter price: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Enter type: ");
                    String type = scanner.nextLine();
                    Food food = new Food(id, name, price, type);
                    foodManager.addFood(food);
                    System.out.println("Added successfully!");
                    break;
                case 2:
                    foodManager.showAllFoods();
                    break;
                case 4:
                    System.out.println("Enter ID: ");
                    int removeId = scanner.nextInt();
                    foodManager.removeFoodById(removeId);
                    break;
                case 5:
                    exit = true;
                    System.out.println("Exited program!");
                    break;
            }
        }

    }
}