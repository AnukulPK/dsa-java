public class Main {
    public static void printItems(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + " " + j);
            }
        }


    }

    public static void main(String[] args) {

//        Cookie cookieOne = new Cookie("green");
//        Cookie cookieTwo = new Cookie("blue");
//
//        cookieOne.setColor("yellow");
//
//        System.out.println(cookieOne.getColor());
//        System.out.println(cookieTwo.getColor());

        LinkedListCustom myLinkedList = new LinkedListCustom(11);
//        myLinkedList.getHead();
//        myLinkedList.getTail();
//        myLinkedList.getLength();
//        myLinkedList.printList();
//        myLinkedList.append(8);
        myLinkedList.append(3);
        myLinkedList.append(23);
        myLinkedList.append(7);
        myLinkedList.set(1,4);

//        myLinkedList.printList();
//        System.out.println(myLinkedList.removeFirst().value);
//        System.out.println(myLinkedList.removeFirst().value);
//        System.out.println(myLinkedList.removeFirst().value);
//        System.out.println(myLinkedList.removeFirst());
//        System.out.println(myLinkedList.get(2).value);

        myLinkedList.printList();

    }
}
