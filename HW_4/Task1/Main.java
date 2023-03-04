package HW_4.Task1;
import java.util.LinkedList;

public class Main{
    public static void main(String[] args) {
        LinkedList<String> javaalist = new LinkedList<> ();
        javaalist.add("1");
        javaalist.add("2");
        javaalist.add("3");
        javaalist.add("4");
        javaalist.add("5");
        javaalist.add("6");
        LinkedList reversedList = reverseLinkedList(javaalist);
        reverseLinkedList(javaalist);
        System.out.println("Reversed list: " + reversedList);

    }
    
    public static LinkedList reverseLinkedList(LinkedList list) {
        LinkedList reversedList = new LinkedList();

        for(int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        return reversedList;
    }
}
