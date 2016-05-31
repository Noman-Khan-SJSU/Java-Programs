package DataStructures.Stack;

import java.util.*;

class StackBasics {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();
        stack.push("one");
        printStack(stack);
        stack.push("two");
        printStack(stack);
        stack.push("three");
        printStack(stack);

        stack.pop();
        printStack(stack);
        stack.pop();
        printStack(stack);
        stack.pop();
        printStack(stack);

    }

    public static void printStack(Stack<String> s)
    {
        if(s.isEmpty())
            System.out.println("Stack is Empty");
        else
            System.out.printf("%s TOP\n", s);
    }
}

// Pushing and popping of elements in a Stack.

