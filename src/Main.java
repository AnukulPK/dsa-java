public class Main {
    public static void printItems(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + " " + j);
            }
        }


    }

    public static void main(String[] args) {


        LinkedListCustom myLinkedList = new LinkedListCustom(1);

        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);

//        myLinkedList.remove(2);
        myLinkedList.printList();
        myLinkedList.reverse();
        myLinkedList.printList();



    }
}
