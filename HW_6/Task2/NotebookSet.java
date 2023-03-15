//Создать множество ноутбуков.

package Final_Project.Task2;
import java.util.HashSet;
import java.util.Set;

public class NotebookSet {
    public static void main(String[] args) {

        Set<String> notebookSet = new HashSet<>();

        notebookSet.add("Apple MacBook Pro");
        notebookSet.add("Dell XPS 13");
        notebookSet.add("Lenovo ThinkPad X1 Carbon");
        notebookSet.add("Asus ZenBook UX425");

        System.out.println("В множестве " + notebookSet.size() + " ноутбуков: ");
        for (String notebook : notebookSet) {
            System.out.println("- " + notebook);
        }

        String searchNotebook = "Apple MacBook Pro";
        if (notebookSet.contains(searchNotebook)) {
            System.out.println(searchNotebook + " есть в множестве");
        } else {
            System.out.println(searchNotebook + " нет в множестве");
        }

        notebookSet.remove("Asus ZenBook UX425");

        System.out.println("Обновленное содержимое множества: ");
        for (String notebook : notebookSet) {
            System.out.println("- " + notebook);
        }
    }
}
