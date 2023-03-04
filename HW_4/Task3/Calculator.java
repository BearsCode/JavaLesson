// В калькулятор добавьте возможность отменить последнюю операцию.
package HW_4.Task3;
import java.util.*;

public class Calculator {
    private Deque<Integer> stack;
    private Deque<Integer> history;

    public Calculator() {
        stack = new ArrayDeque<>();
        history = new ArrayDeque<>();
    }

    public void enter(int num) {
        stack.push(num);
    }

    public int add() {
        int num1 = stack.pop();
        int num2 = stack.pop();
        int result = num1 + num2;
        history.push(result);
        stack.push(result);
        return result;
    }

    public int multiply() {
        int num1 = stack.pop();
        int num2 = stack.pop();
        int result = num1 * num2;
        history.push(result);
        stack.push(result);
        return result;
    }

    public int undo() {
        if (!history.isEmpty()) {
            int lastResult = history.pop();
            stack.pop();
            stack.push(lastResult);
            return lastResult;
        } else {
            throw new NoSuchElementException("Нет истории операций для отмены");
        }
    }

    public void cascadeUndo(int n) {
        if (n <= history.size()) {
            for (int i = 0; i < n; i++) {
                undo();
            }
        } else {
            throw new NoSuchElementException("Недостаточно операций для отмены");
        }
    }
}
