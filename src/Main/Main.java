package Main;

import DoublyLinkedList.DoublyLinkedList;
import LinkedLIstWithTail.LinkedListWithTail;

public class Main {

    public static void main(String[] args) {

        //SINGLY GENERIC LINKED LIST WITH TAIL TESTING

        LinkedListWithTail <Integer> myList = new LinkedListWithTail<>();

        myList.pushBack(1);
        myList.pushBack(2);
        myList.pushBack(3);
        myList.pushBack(4);

        myList.printLinkedListWithTail();

        System.out.println(myList.topFront());

        myList.popFront();

        myList.printLinkedListWithTail();


        //DOUBLY LINKED LIST TESTING
        /*
        DoublyLinkedList myList = new DoublyLinkedList();

        myList.pushBack(1.2,3.6);
        myList.pushBack(3.4,4.5);
        myList.pushBack(9.6,12.3);
        myList.pushBack(23.5,15.2);

        myList.printDoublyLinkedList();

        double [] returnArray = myList.topFront();
        System.out.print(returnArray[0] + " " + returnArray[1]);

        myList.popFront();

        System.out.println();
        System.out.println();

        myList.printDoublyLinkedList();

        //Test for the insert method

        DoublyLinkedList myList2 = new DoublyLinkedList();

        myList2.pushBack(3,23);
        myList2.pushBack(9,23);

        myList2.printDoublyLinkedList();

        myList2.insert(1,32);
        myList2.printDoublyLinkedList();

        myList2.insert(7,45);
        myList2.printDoublyLinkedList();

        myList2.insert(11,334);
        myList2.printDoublyLinkedList();

        DoublyLinkedList myList3 = new DoublyLinkedList();

        myList3.insert(23,11);
        myList3.printDoublyLinkedList();
*/

    }
}
