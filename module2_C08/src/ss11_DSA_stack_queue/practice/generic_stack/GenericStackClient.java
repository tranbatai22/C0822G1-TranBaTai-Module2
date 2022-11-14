package ss11_DSA_stack_queue.practice.generic_stack;

public class GenericStackClient {
    private static void stackOfIStrings() {
        MyGenericStack<String> stack = new MyGenericStack();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("kích thước sau khi đẩy vào: " + stack.size());
        while (!stack.isEmpty()) {
            System.out.printf(" %s", ((MyGenericStack<String>) stack).pop());
        }
        System.out.println("\nkích thước sau khi xoá : " + stack.size());
    }

    private static void stackOfIntegers() {
        MyGenericStack<Integer> stack = new MyGenericStack();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("kích thước sau khi đẩy vào: " + stack.size());
        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }
        System.out.println("\nkích thước sau khi xoá : " + stack.size());

    }

    public static void main(String[] args) {
        System.out.println("Stack of integers");
        stackOfIntegers();
        System.out.println("\nStack of Strings");
        stackOfIStrings();
    }
}
