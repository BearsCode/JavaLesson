/*Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. минимум 5 NoteBook notebook1 = new NoteBook NoteBook notebook2 = new NoteBook NoteBook notebook3 = new NoteBook NoteBook notebook4 = new NoteBook NoteBook notebook5 = new NoteBook */
package Final_Project.Task3;
import java.util.*;

public class NoteBookFilter {
    public static void main(String[] args) {

        NoteBook notebook1 = new NoteBook("HP", "black", "Windows 10", 8, 256);
        NoteBook notebook2 = new NoteBook("Lenovo", "silver", "Ubuntu 20.04", 16, 512);
        NoteBook notebook3 = new NoteBook("Acer", "white", "Windows 7", 4, 128);
        NoteBook notebook4 = new NoteBook("Asus", "red", "Windows 10", 32, 1000);
        NoteBook notebook5 = new NoteBook("Dell", "gray", "macOS", 8, 512);
        
        ArrayList<NoteBookFilter> noteBooks = new ArrayList<>();
        noteBooks.add(notebook1);
        noteBooks.add(notebook2);
        noteBooks.add(notebook3);
        noteBooks.add(notebook4);
        noteBooks.add(notebook5);
        
        Map<Integer, String> criteria = new HashMap<>();
        criteria.put(1, "ОЗУ");
        criteria.put(2, "Объем ЖД");
        criteria.put(3, "Операционная система");
        criteria.put(4, "Цвет");
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите критерий фильтрации:");
        for (Map.Entry<Integer, String> entry : criteria.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        int filterCriteria = scanner.nextInt();
        
        String filterParameter = "";
        if (filterCriteria == 1) {
            System.out.println("Введите количество ОЗУ:");
            int ram = scanner.nextInt();
            filterParameter = String.valueOf(ram);
        } else if (filterCriteria == 2) {
            System.out.println("Введите объем ЖД в гигабайтах:");
            int hdd = scanner.nextInt();
            filterParameter = String.valueOf(hdd);
        } else if (filterCriteria == 3) {
            System.out.println("Введите название операционной системы:");
            String os = scanner.next();
            filterParameter = os;
        } else if (filterCriteria == 4) {
            System.out.println("Введите цвет ноутбука:");
            String color = scanner.next();
            filterParameter = color;
        } else {
            System.out.println("Выбран неверный критерий");
            return;
        }
        
        ArrayList<NoteBook> filteredNoteBooks = new ArrayList<>();
        for (NoteBook notebook : noteBooks) {
            if (filterCriteria == 1 && notebook.getRam() == Integer.parseInt(filterParameter)) {
                filteredNoteBooks.add(notebook);
            } else if (filterCriteria == 2 && notebook.getHdd() == Integer.parseInt(filterParameter)) {
                filteredNoteBooks.add(notebook);
            } else if (filterCriteria == 3 && notebook.getOs().equals(filterParameter)) {
                filteredNoteBooks.add(notebook);
            } else if (filterCriteria == 4 && notebook.getColor().equals(filterParameter)) {
                filteredNoteBooks.add(notebook);
            }
        }
        
        System.out.println("Подходящие ноутбуки:");
        for (NoteBook notebook : filteredNoteBooks) {
            System.out.println(notebook.toString());
        }
    }
}