import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.println("Enter names (type 'exit' to stop):");
        while (!(name = sc.nextLine()).equalsIgnoreCase("exit")) {
            students.add(name);
        }
        System.out.println("Students: " + students);
    }
}
