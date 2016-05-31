package DataStructures.LinkedList.Singly.Implementation;

import java.util.Stack;

class LinkedList {

    private Node head;                                     // Reference to the first node (i.e. head) is never modified, otherwise, starting point of LinkedList will be lost.

    public Node getHead(){
        return head;
    }

    public void insertAtFirst(Object value) {
        Node first = new Node(value);                       // First node is also known as "the head node" but its reference is known as "head".
        first.next = head;                                  // This is good even for the case when (head == null i.e. list is empty).
        head = first;
    }

    public void insertAtIndex(Object value, int index) {
        Node node = new Node(value);
        if (index == 0) {                                   // <=0 for handling indexes less than 0.
            node.next = head;
            head = node;
            return;                                        // Instead of using if/else, we can use return statement in the "if" block.
        }
        Node temp = head;                                  // Declare a reference variable of the type, Node (temp), to parse the nodes of the list.
        for (int i = 1; i < index; i++)                    // For Inserting at position i, we need to parse-till/go-to element (i-1)
        {
            temp = temp.next;
        }
        node.next = temp.next;                             // And then adjust the links/references of the next nodes, accordingly.
        temp.next = node;
    }

    public void insertAtLast(Object value) {
        Node last = new Node(value);
        if (head == null) {
        this.head = last;
            return;                                         // Instead of using if/else, we can use return statement in the "if" block.
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = last;
    }

    public void insertAtLastByReference(Node node) {        // For Finding Merge Point of two Linked Lists
        if (head == null) {
            this.head = node;
            return;                                         // Instead of using if/else, we can use return statement in the "if" block.
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    public Object getLast() {
        if (head == null)
            return null;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return temp.data;
    }

    public Object getFirst() {
        return head.data;
    }

    public Object getIndex(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public Node getNodeAtIndex(int index) {             // For Finding Merge Point of two Linked Lists
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void printIterative()                        // For forward printing, this method is more efficient than its recursive counterpart. However, for reverse printing, extra space would be required anyways, so recursive implementation is efficient as well.
    {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();                             // Just to take the cursor to the new line.
    }

    public void printRecursive()                // CIQ
    {
        printRecursive(head);
    }
    private void printRecursive(Node temp)                // Pass reference of the head node in the calling method.
    {
        if (temp == null) {
            System.out.println();                        // Just to take the cursor to the new line.
            return;
        }
        System.out.print(temp.data + " ");
        printRecursive(temp.next);                       // Stack first grows and then shrinks for recursive methods. When stack is shrinking here, it returns nothing, since there are no lines left to be executed, so it just exits.
    }

    public void printRecursiveReverse()         // CIQ
    {
        printRecursiveReverse(head);
    }
    private void printRecursiveReverse(Node temp)        // Pass reference of the head node in the calling method.
    {
        if (temp == null)
            return;                                     // Need to write println statement after calling this method, to get the cursor to the new line.
        printRecursiveReverse(temp.next);               // Stack first grows (elements are pushed in the implicit stack) and then shrinks (elements are pushed in the implicit stack) for recursive methods. When stack is shrinking here, then every recursive call, print outs the data and then there are no lines left to be executed, so it just exits.
        System.out.print(temp.data + " ");
    }

    public void printReverseUsingStack() {
        if (head == null)
            return;
        Node temp = head;
        Stack<Node> s = new Stack<>();                  // Creating stack of reference variables of the type Node.
        while (temp != null) {
            s.push(temp);
            temp = temp.next;
        }
        while (!s.empty()) {
            System.out.print(s.peek().data + " ");      // peek() returns the top most element in the stack.
            s.pop();
        }
        System.out.println();
    }

    public int size() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count += 1;
            temp = temp.next;
        }
        return count;
    }

    public boolean contains(Object value) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.equals(value)) {
                return true;
            } else {
                temp = temp.next;
            }
        }
        return false;
    }

    public void removeFirst() {
        head = head.next;
    }

    public void removeLast() {
        Node temp = head;
        if (temp == null || temp.next == null)
        {
            head = null;
        }
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public void removeAtIndex(int index) {
        if (index <= 0) {
            head = head.next;
            return;                                         // Instead of using if/else, we can use return statement in the "if" block.
        }
        Node temp = head;
        for (int i = 1; i < index; i++)                 // Even for the removal, we need to go till (i-1)th position.
        {
            temp = temp.next;
            if (temp == null){
                return;
            }
        }
        temp.next = temp.next.next;
    }

    public void reverseIterative()             // Common Interview Question (CIQ)
    {
        Node current, previous, next;                       // Need to declare 3 reference variables of the type Node.
        current = head;
        previous = null;
        while (current != null) {
            next = current.next;
            current.next = previous;                        // This line actually reverses the links between the nodes.
            previous = current;                             // This statement needs to be before its next statement below. Otherwise, previous will also point to next, since, current would be pointing to next at that moment.
            current = next;
        }
        head = previous;
    }

    public void reverseRecursive()
    {
        reverseRecursive(head);
    }

    private void reverseRecursive(Node temp)     // CIQ    // Pass reference of the head node in the calling method.
    {
        if (temp == null || temp.next == null) {
            head = temp;                                   // When temp reaches the last node, make the head point to it.
            return;
        }
        reverseRecursive(temp.next);                       // When the implicit stacks starts shrinking, and temp points to second last node, the below lines will start executing.
        temp.next.next = temp;                             // This line actually reverses the links between the nodes.
        temp.next = null;
    }

    public void reverseUsingStack() {           // CIQ
        if (head == null)
            return;
        Node temp = head;
        Stack<Node> stack = new Stack<>();          // Creating stack of reference variables of the type Node.
        while (temp != null) {
            stack.push(temp);
            temp = temp.next;
        }
        temp = stack.peek();                        // peek() returns the top most element in the stack.
        head = temp;
        stack.pop();
        while (!stack.empty()) {
            temp.next = stack.peek();
            stack.pop();
            temp = temp.next;
        }
        temp.next = null;
    }

    public Node findMergePointOfTwoLinkedLists(Node head1, Node head2){          // CIQ

        int len1 = findLength(head1);
        int len2 = findLength(head2);

        if (len1 > len2) {
            int d = len1 - len2;                // Difference between the no. of elements in the two lists.
            for (int i=0; i < d ; i++){
                head1 = head1.next;
            }
        }
        else if (len2 > len1) {
            int d = len2 - len1;
            for (int i=0; i < d ; i++){
                head2 = head2.next;
            }
        }

        while (head1 != null && head2 != null){
            if (head1 == head2)
                return head1;
            head1 = head1.next;
            head2 = head2.next;
        }
        return null;
    }
    public int findLength(Node head){               // For finding merge point method
        int count = 0;
        while(head != null ){
            head = head.next;
            count++;
        }
        return count;
    }

}