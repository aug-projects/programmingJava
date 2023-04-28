import java.util.Scanner;

public class Book {

    public static void main(String[] args) {

        int[] id = new int[100];
        String[] name = new String[100];
        int[] price = new int[100];
        int[] quantity = new int[100];

        id[0] = 1;
        name[0] = "test";
        price[0] = 1;
        quantity[0] = 22;

        Scanner input = new Scanner(System.in);
        int menu;

        do {
            System.out.println("\n--- Welcome to system ---");
            System.out.println("1- Show all Products");
            System.out.println("2- Add Product");
            System.out.println("3- Delete Product");
            System.out.println("4- Edit Product");
            System.out.println("5- Calculate Product");
            System.out.println("6- Exit");
            System.out.print("Enter Your choice: ");
            menu = input.nextInt();

            switch (menu) {
                case 1:
                    showProducts(id, name, price, quantity);
                    break;
                case 2:
                    addProduct(id, name, price, quantity);
                    break;
                case 3:
                    deleteProduct(id, name, price, quantity);
                    break;
                case 4:
                    editProduct(id, name, price, quantity);
                    break;
                case 5:
                    // Implement calculation logic
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid count");
                    break;
            }

        } while (true);

    }

    public static void showProducts(int[] id, String[] name, int[] price, int[] quantity) {

        for (int i = 0; i < name.length; ++i) {
            if (name[i] == null)
                break;
            System.out.println("===============");
            System.out.println("id: " + id[i]);
            System.out.println("name: " + name[i]);
            System.out.println("price: " + price[i]);
            System.out.println("quantity: " + quantity[i]);
            System.out.println("===============");
        }
    }

    public static void addProduct(int[] id, String[] name, int[] price, int[] quantity) {

        Scanner input = new Scanner(System.in);

        for (int i = 0; i <= name.length; i++) {
            System.out.println("id: ");
            id[i] = input.nextInt();

            System.out.println("name: ");
            name[i] = input.next();

            System.out.println("price: ");
            price[i] = input.nextInt();

            System.out.println("quantity: ");
            quantity[i] = input.nextInt();

            System.out.println("Do you want to add more (y or n)?");

            String response = input.next();
            if ("n".equalsIgnoreCase(response)) {
                break;
            }

        }
    }

    public static void deleteProduct(int[] id, String[] name, int[] price, int[] quantity) {

        System.out.print("Enter Product Name to Delete: ");
        Scanner input = new Scanner(System.in);
        String inputDelete = input.next();

        for (int i = 0; i < name.length; ++i) {

            if (name[i] != null && name[i].equals(inputDelete)) {
                id[i] = 0;
                name[i] = null;
                price[i] = 0;
                quantity[i] = 0;
                System.out.println("Delete successfully...");
            } else {
                System.out.println("Product not found");
            }
            break;
        }
    }

    public static void editProduct(int[] id, String[] name, int[] price, int[] quantity) {

    System.out.print("Enter Product Name to Edit: ");
    Scanner input = new Scanner(System.in);
    String inputEdit = input.next();

        for (int i = 0; i < name.length; ++i) {

            if (name[i] != null && name[i].equals(inputEdit)) {

                System.out.println("id: ");
                id[i] = input.nextInt();

                System.out.println("name: ");
                name[i] = input.next();

                System.out.println("price: ");
                price[i] = input.nextInt();

                System.out.println("quantity: ");
                quantity[i] = input.nextInt();

                System.out.println("Edit successfully...");
            } else {
                System.out.println("Product not found");
            }
            break;
        }
    }


    public static void calculateProduct(int[] id, String[] name, int[] price, int[] quantity) {
        // Implement calculation logic here, if required
    }
}