public interface IStack<T> {

    public void push(String data);
    public T pop();
    public T top();
    public boolean isEmpty();
    public int size();

}
