package DataStructure.LinkedList;

public class Operations {

    public static LinkedList addDataAtStart() {
        LinkedList linkedList = new LinkedList();
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);
        linkedList.print();
        return linkedList;
    }

    public static void addDataAtEnd() {
        LinkedList linkedList = new LinkedList();
        linkedList.append(56);
        linkedList.append(30);
        linkedList.append(70);
        linkedList.print();
    }

    public static void insertInBetween() {
        LinkedList linkedList = new LinkedList();
        Node secondNode = linkedList.push(70);
        Node firstNode = linkedList.push(56);
        Node newNode = new Node(30);
        System.out.println("Before:");
        linkedList.print();
        linkedList.insertInBetween(firstNode, newNode);
        System.out.println("\nAfter:");
        linkedList.print();

    }

    public static void deleteFirstNode() {
        System.out.println("Before:");
        LinkedList linkedList = addDataAtStart();
        linkedList.pop();
        System.out.println("\nAfter:");
        linkedList.print();
    }

    public static void deleteLastNode() {
        System.out.println("Before:");
        LinkedList linkedList = addDataAtStart();
        linkedList.popLast();
        System.out.println("\nAfter:");
        linkedList.print();
    }

    public static void findNodeBasedOnValue() {
        LinkedList linkedList = addDataAtStart();
        linkedList.searchNode(30);
    }

    public static LinkedList insertAfterSearchNode() {
        System.out.println("Before");
        LinkedList linkedList = addDataAtStart();
        Node newNode = new Node(40);
        linkedList.searchNodeAt(30, newNode);
        System.out.println("\nAfter Insertion");
        linkedList.print();
        return linkedList;
    }

    public static void deleteAfterNodeAfterSearchNode() {
        LinkedList linkedList = insertAfterSearchNode();
        System.out.println("\nAfter Delete");
        linkedList.deleteANode(40);
        linkedList.print();
    }

    public static void sortList() {
        System.out.println("Before sorting the list");
        LinkedList linkedList = insertAfterSearchNode();
        linkedList.sort();
        System.out.println("\nAfter sorting the list");
        linkedList.print();
    }
}
