import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int response;
        prompt();
        do {
            request();
            response = input.nextInt();
            switch (response) {
                case 1:
                    System.out.println("Images");
                    break;
                case 2:
                    System.out.println("Containers");
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Choice Not Available");
                    break;
            }
        } while (response != 3);

    }

    public static void prompt() {
        System.out.println("Welcome to Docker-Client");
    }

    public static void request() {
        System.out.print("\n1. List Images\n2. List Containers\n3. EXIT\n\nDocker-Client>");

    }
}
