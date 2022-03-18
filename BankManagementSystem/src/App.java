import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        while (true) {
            Scanner sc = new Scanner(System.in);

            System.out.println("What do you want to do?:"
                    + "\n1. Register"
                    + "\n2. Get Cards");
            int selected = sc.nextInt();

            if (selected == 1) {
                Utils.registerToBank();
            } else if (selected == 2) {
                sc.nextLine();
                System.out.println("Do you registered on our bank?:");
                String answer = sc.nextLine();
                if (answer.equalsIgnoreCase("yeah")) {
                    sc.nextLine();
                    System.out.println("Which card do you want to get?:");
                    String card_type = sc.nextLine();
                    System.out.println("Your card ordered!!!");
                } else if (answer.equalsIgnoreCase("nope")) {
                    Utils.registerToBank();
                    System.out.println("Which card do you want to get?:");
                    String card_type = sc.nextLine();
                    System.out.println("Your card ordered!!!");
                } else {
                    System.out.println("I didn't understand it!!!!");
                }
            } else if (selected == 3) {
                System.out.println("You just quited the app!!!");
                break;
            } else {
                System.out.println("There are no option like this!!!");
            }
        }
    }
}
