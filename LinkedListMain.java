package DataStructure.LinkedList;

import java.util.Scanner;

public class LinkedListMain {

    public static void main(String[] args) {
        System.out.println("Welcome to linkedList DataStructure Program");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to Add the data at the start");
        System.out.println("Enter 2 to Add the data at the end");
        System.out.println("Enter 3 to Insert data In-Between");
        System.out.println("Enter 4 to Delete data of first node");
        switch (scanner.nextInt()) {
            case 1:
                Operations.addDataAtStart();
                break;
            case 2:
                Operations.addDataAtEnd();
                break;
            case 3:
                Operations.insertInBetween();
                break;
            case 4:
                Operations.deleteFirstNode();
                break;
        }

    }
}


