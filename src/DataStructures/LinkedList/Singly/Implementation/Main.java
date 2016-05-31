package DataStructures.LinkedList.Singly.Implementation;

class Main
{
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        list.insertAtFirst(2);
        list.insertAtFirst(1);
        list.insertAtLast(9);
        list.insertAtLast(10);
        list.printIterative();
        list.insertAtIndex(4,1);
        list.printIterative();
        list.reverseIterative();
        list.printIterative();
        list.removeFirst();
        list.printIterative();
        list.removeLast();
        list.printIterative();
        list.removeAtIndex(1);
        list.printRecursive();
        list.printRecursiveReverse(); System.out.println();
        list.printRecursive();
        list.reverseRecursive();
        list.printIterative();
        list.insertAtLast(10);
        list.printIterative();
        System.out.println(list.getLast());
        System.out.println(list.getFirst());
        System.out.println(list.getIndex(1));
        System.out.println(list.size());
        System.out.println(list.contains(11));
        System.out.println(list.contains(10));
        list.printIterative();
        list.reverseUsingStack();
        list.printIterative();
        list.printReverseUsingStack();
        list.insertAtLast(12);
        list.insertAtLast(11);
        list.printIterative();


        LinkedList list2 = new LinkedList();
        list2.insertAtLast(1);
        list2.insertAtLast(2);
        list2.insertAtLast(3);
        list2.insertAtLastByReference(list.getNodeAtIndex(2));          // Methods in this line were created to test findMergePoint method below.
        list2.printIterative();

        System.out.println((list.findMergePointOfTwoLinkedLists(list.getHead(),list2.getHead())) == null ? -1: list.findMergePointOfTwoLinkedLists(list.getHead(),list2.getHead()).data);

    }

}