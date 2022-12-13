public class Main {
    public static void printItems(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + " " + j);
            }
        }


    }

    public static void main(String[] args) {


//        LinkedListCustom myLinkedList = new LinkedListCustom(1);
//
//        myLinkedList.append(2);
//        myLinkedList.append(3);
//        myLinkedList.append(4);

//        myLinkedList.remove(2);
//        myLinkedList.printList();
//        myLinkedList.reverse();
//        myLinkedList.printList();

//        DoublyLinkedListCustom myDLL = new DoublyLinkedListCustom(0);

//        myDLL.getHead();
//        myDLL.getTail();
//        myDLL.getLength();
//        myDLL.append(1);
//        myDLL.append(2);
//        myDLL.append(23);
//        myDLL.append(7);
//        System.out.println(myDLL.removeLast().value);
//        System.out.println(myDLL.removeLast().value);
//        System.out.println(myDLL.removeLast());
//        myDLL.prepend(1);

//        System.out.println(myDLL.removeFirst().value);
//        System.out.println(myDLL.removeFirst().value);
//        System.out.println(myDLL.removeFirst());

//        System.out.println(myDLL.get(1).value);
//        System.out.println(myDLL.get(2).value+"\n");
//        myDLL.set(1,4);
//        myDLL.insert(1,2);
//        myDLL.remove(1);
//        myDLL.printList();
        
//        Stack myStack = new Stack(7);
//        myStack.getTop();
//        myStack.getHeight();
//        myStack.push(23);
//        myStack.push(3);
//        myStack.push(11);
//        myStack.pop();
//        myStack.printStack();
        Queue myQueue = new Queue(7);
        myQueue.getFirst();
        myQueue.getLast();
        myQueue.getLength();
        myQueue.printQueue();
        
        



    }
}
