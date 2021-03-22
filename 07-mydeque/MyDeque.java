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
    return size;
  }
  public String toString() {
    if (size==0) {
      return "{}";
    }
    String deque = "{";
    int lo = start;
    while(lo!=end) {
      if(lo==data.length) {
        lo = 0;
      }
      deque = deque + data[lo] + ", ";
      lo++;
    }
    return deque + data[end] + "}";
  }
  public void addFirst(E element) {
    if(size==0) {
      data[start] = element;
    }
    else {
      start-=1;
      if(start<0) {
        start = data.length-1;
      }
      data[start] = element;
    }
    size++;
  }
  public void addLast(E element){ }
  // public E removeFirst()
  // public E removeLast()
  public E getFirst() {
    return data[start];
  }
  public E getLast() {
    return data[end];
  }
}
