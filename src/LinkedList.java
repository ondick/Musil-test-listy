public class LinkedList {
    private MyNode head;
    private MyNode tail;
    private Zvire zvire;

    public void addFirst(Zvire zvire) {
        MyNode newNode = new MyNode(zvire);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }

        else{
            head.setPrevious(newNode);
            newNode.setNext(head);
            head = newNode;
        }
    }

    public void printAll() {
        if (head == null) {
            return;
        }
        MyNode current = head;
        int index = 1;
        while(current != null) {
            System.out.println(index + ". " + current.getZvire());
            index++;
            current = current.getNext();
        }

    }

    public void removeFirst() {
        if (head == null) {
            return;
        }
        MyNode current = head;
        head = current.getNext();
        current.setPrevious(null);
    }

    public void starsiPeti() {
        if (head == null) {
            return;
        }
        int index = 1;
        MyNode current = head;
        while (current != null) {
            if(current.getZvire().getVek() >= 5) {
                System.out.println(index+". "+current.getZvire());
                index++;
            }
            current = current.getNext();
        }
    }

    public void nejstarsi(){
        int nejstarsi = 0;
        int index = 1;
        if (head == null) {
            return;
        }
        MyNode current = head;
        while(current != null) {
            if(current.getZvire().getVek() >= nejstarsi) {
                nejstarsi = current.getZvire().getVek();
            }
            current = current.getNext();
        }
        current = head;
        while (current != null) {
            if(current.getZvire().getVek() == nejstarsi) {
                System.out.println(index+". "+current.getZvire());
                index++;
            }
            current = current.getNext();
        }
    }
}
