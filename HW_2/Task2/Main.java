package Task2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        String filename = "input.txt"; 
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");
                String surname = fields[0].substring(fields[0].indexOf(":") + 2, fields[0].lastIndexOf("\""));
                String mark = fields[1].substring(fields[1].indexOf(":") + 2, fields[1].lastIndexOf("\""));
                String subject = fields[2].substring(fields[2].indexOf(":") + 2, fields[2].lastIndexOf("\""));
                StringBuilder sb = new StringBuilder();
                sb.append("Студент ").append(surname).append(" получил ").append(mark)
                        .append(" по предмету ").append(subject).append(".");
                System.out.println(sb.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
