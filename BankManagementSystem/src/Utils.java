import java.util.Scanner;

public class Utils {
    public static void registerToBank() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many people do you want to register?:");
        int count = sc.nextInt();
        int y = 0;
        while (y < count) {
            y++;
            sc.nextLine();
            System.out.println("Enter your name:");
            String name = sc.nextLine();

            sc.nextLine();
            System.out.println("Enter your surname:");
            String surname = sc.nextLine();

            sc.nextLine();
            System.out.println("Enter your email:");
            String email = sc.nextLine();

            int i = 0;
            while (i < count) {
                i++;
                Account.names[i] = name;
                Account.surnames[i] = surname;
                Account.emails[i] = email;
            }
        }
    }
}
