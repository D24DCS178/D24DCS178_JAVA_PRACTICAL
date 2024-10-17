/*Design a Custom Stack using ArrayList class, which
 implements following functionalities of stack. My Stack
-list ArrayList<Object>: A list to store elements.
+isEmpty: boolean: Returns true if this stack is empty.
+getSize(): int: Returns number of elements in this stack.
+peek(): Object: Returns top element in this stack without
removing it.
+pop(): Object: Returns and Removes the top elements in
this stack.
+push(o: object): Adds new element to the top of this
stack.

 */

import java.util.ArrayList;
    
public class P8_38 {
    private ArrayList<Object> stackList;

    public P8_38() {
        this.stackList = new ArrayList<>();
    }

    public boolean isEmpty() {
        return stackList.isEmpty();
    }

    public int getSize() {
        return stackList.size();
    }

    public Object peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stackList.get(stackList.size() - 1);
    }

    public Object pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stackList.remove(stackList.size() - 1);
    }

    public void push(Object object) {
        stackList.add(object);
    }

    public static void main(String[] args) {
        P8_38 stack = new P8_38();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Size: " + stack.getSize());
        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Is empty? " + stack.isEmpty());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Is empty? " + stack.isEmpty());
    }
}
