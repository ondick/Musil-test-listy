import org.w3c.dom.Node;

public class MyNode {
    private MyNode  next;
    private MyNode previous;
    private Zvire zvire;

    public MyNode(Zvire zvire) {
        this.zvire = zvire;
        this.next = null;
        this.previous = null;
    }

    public MyNode getNext() {
        return next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }

    public MyNode getPrevious() {
        return previous;
    }

    public void setPrevious(MyNode previous) {
        this.previous = previous;
    }

    public Zvire getZvire() {
        return zvire;
    }

    public void setZvire(Zvire zvire) {
        this.zvire = zvire;
    }
}
