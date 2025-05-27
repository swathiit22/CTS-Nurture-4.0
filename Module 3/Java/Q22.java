import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteFile {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        FileWriter fw = new FileWriter("output.txt");
        fw.write(text);
        fw.close();
        System.out.println("Written to output.txt");
    }
}
