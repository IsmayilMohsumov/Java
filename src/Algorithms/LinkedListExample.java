package Algorithms;

public class LinkedListExample {

    int data;
    LinkedListExample next;

    LinkedListExample() {
        this.data = -1;
        this.next = null;
    }

    LinkedListExample(int data) {
        this.data = data;
        this.next = null;
    }

    LinkedListExample(int data, LinkedListExample node) {
        this.data = data;
        this.next = node;
    }

    @Override
    public String toString() {
        return "LinkedListExample{" + "data=" + data + ", next=" + next + '}';
    }

    public static void main(String[] args) {
        LinkedListExample obj = new LinkedListExample(20);
        obj.next = new LinkedListExample(10);
        obj.next.next = new LinkedListExample(30);

        
        System.out.println("Başlangıç: "+obj.data);
		
	obj = addFirst(obj, 50);
		
	System.out.println("Başlangıç: "+obj.data);
        System.out.println(obj);
        System.out.println(obj.next);
        System.out.println(obj.next.next);
    }

    static LinkedListExample addFirst(LinkedListExample b, int value) {
        LinkedListExample c = new LinkedListExample(value, b);
        return c;
    }

    static LinkedListExample addMiddle(LinkedListExample b, int index, int value) {
        LinkedListExample c = b;

        for (int i = 1; i < index; i++) {
            c = c.next;
        }

        LinkedListExample add = new LinkedListExample(value, c.next);
        c.next = add;

        return b;
    }

}
