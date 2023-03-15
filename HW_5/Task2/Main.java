package HW_5.Task2;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> employees = Arrays.asList(
                "Иван Иванов",
                "Светлана Петрова",
                "Кристина Белова",
                "Анна Мусина",
                "Анна Крутова",
                "Иван Юрин",
                "Петр Лыков",
                "Павел Чернов",
                "Петр Чернышов",
                "Мария Федорова",
                "Марина Светлова",
                "Мария Савина"
        );

        Map<String, Integer> nameCounts = new HashMap<>();

        for (String employee : employees) {
            String name = employee.split(" ")[0]; 
            nameCounts.put(name, nameCounts.getOrDefault(name, 0) + 1); 
        }

        List<Map.Entry<String, Integer>> sortedNames = new ArrayList<>(nameCounts.entrySet());
        sortedNames.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        for (Map.Entry<String, Integer> entry : sortedNames) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue() + " раз(а)");
            }
        }
    }
}
