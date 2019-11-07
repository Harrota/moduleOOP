import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class IOstreaming {

    public static String readFile() throws IOException {
        try (BufferedReader br = new BufferedReader(
                new FileReader("input.txt"))) {

            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            String everything = sb.toString();
            System.out.println("\nFile was read: \n" + everything);
            return everything;

        }

    }

    public static boolean writeFile(String text) throws IOException {
        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            byte[] buffer = text.getBytes();

            fos.write(buffer, 0, buffer.length);
        } catch (IOException ex) {
            System.out.println("output.txt not found");
        }
        System.out.println("\nFile was written with: \n" + text);
        return true;
    }
}
