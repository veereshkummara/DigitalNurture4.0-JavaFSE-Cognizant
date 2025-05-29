import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> studentMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of entries: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // consume newline

            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            studentMap.put(id, name);
        }

        System.out.print("Enter ID to search: ");
        int searchId = scanner.nextInt();
        System.out.println("Student name: " + studentMap.get(searchId));
    }
}
