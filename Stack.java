public class Stack implements IStack {

    public Node top;
    public int size;

    @Override
    public void push(String data) {
        size++;
        if (isEmpty()) {
            top = new Node(data);
        } else {
            Node temp = top;
            top = new Node(data);
            top.setNext(temp);
        }
    }

    @Override
    public Node pop() {
        if (isEmpty()) {
            throw new StackIsEmptyException("Stack is empty");
        } else {
            Node temp = top;
            top = top.getNext();
            size--;
            return temp;
        }
    }

    @Override
    public Node top() {
        if (isEmpty()) {
            throw new StackIsEmptyException("Stack is empty");
        } else {
            return top;
        }
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public String toString() {
        String str = "";
        while (top != null) {
            str+=top.getData();
            if (top.getNext() != null) {
                str+=" ";
            }
            top=top.getNext();
        }


        return str;
    }

    @Override
    public int size() {
        return size;
    }
}
