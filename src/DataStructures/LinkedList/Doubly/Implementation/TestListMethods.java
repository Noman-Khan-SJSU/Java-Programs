package DataStructures.LinkedList.Doubly.Implementation;

class TestListMethods
{
    public static void main(String[] args)
    {
        List list = new List();
        list.insertAtFirst(2);
        list.insertAtLast(3);
        list.insertAtLast(4);
        list.insertAtLast(5);
        list.insertAtFirst(1);
        list.printIterative();
        list.printIterativeReverse();
        list.printIterative();
    }
}
