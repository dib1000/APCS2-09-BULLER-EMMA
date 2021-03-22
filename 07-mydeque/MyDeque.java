public class MyDeque<E>{
  private E[] data;
  private int size, start, end;

  public MyDeque() {
    @SuppressWarnings("unchecked")
    E[] d = (E[]) new Object[10];
    data = d;
    size = 0;
    start = 5;
    end = 5;
  }
  public MyDeque(int initialCapacity) {
    if(initialCapacity<0) {
      initialCapacity = 0;
    }
    @SuppressWarnings("unchecked")
    E[] d = (E[]) new Object[initialCapacity];
    int median = initialCapacity/2;
    data = d;
    size = 0;
    start = median;
    end = median;
  }
  public int size() {
    return data.length;
  }
  public String toString() {
    return "";
  }
  public void addFirst(E element){ }
  public void addLast(E element){ }
  // public E removeFirst()
  // public E removeLast()
  // public E getFirst()
  // public E getLast()
}
