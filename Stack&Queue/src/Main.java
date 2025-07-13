public class Main {
    public static void main(String[] args) {
       /* Stack myStack = new Stack(4);

        myStack.getTop();
        myStack.getHeight();

        System.out.println("\nStack:");
        myStack.printStack();*/

       /* Stack myStack = new Stack(1);

        System.out.println("Before push():");
        System.out.println("--------------");
        myStack.getTop();
        myStack.getHeight();

        System.out.println("\nStack:");
        myStack.printStack();

        myStack.push(3);
        myStack.push(4);

        System.out.println("\n\nAfter push():");
        System.out.println("-------------");
        myStack.getTop();
        myStack.getHeight();
        myStack.printStack();*/

      /*  Stack myStack = new Stack(2);
        myStack.push(1);

        // (2) Items - Returns 1 Node
        System.out.println(myStack.pop().value);
        // (1) Item - Returns 2 Node
        System.out.println(myStack.pop().value);
        // (0) Items - Returns null
        System.out.println(myStack.pop());*/


        /*                  Queue             */


     /*   Queue myQueue = new Queue(4);

        myQueue.getFirst();
        myQueue.getLast();
        myQueue.getLength();

        System.out.println("\nQueue:");
        myQueue.printQueue();*/

        /*Queue myQueue = new Queue(2);

        System.out.println("Before enqueue():");
        System.out.println("--------------");
        myQueue.getFirst();
        myQueue.getLast();
        myQueue.getLength();

        System.out.println("\nQueue:");
        myQueue.printQueue();

        myQueue.enqueue(1);

        System.out.println("\n\nAfter enqueue():");
        System.out.println("-------------");
        myQueue.getFirst();
        myQueue.getLast();
        myQueue.getLength();

        System.out.println("\nQueue:");
        myQueue.printQueue();*/

        Queue myQueue = new Queue(2);
        myQueue.enqueue(1);

        // (2) Items - Returns 2 Node
        System.out.println(myQueue.dequeue().value);
        // (1) Item - Returns 1 Node
        System.out.println(myQueue.dequeue().value);
        // (0) Items - Returns null
        System.out.println(myQueue.dequeue());

    }
}