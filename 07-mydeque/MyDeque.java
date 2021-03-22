import java.util.*;

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
    while(lo!=end+1) {
      if(lo==data.length) {
        lo = 0;
      }
      if(lo==end) {
        deque = deque + data[lo];
      }
      else {
        deque = deque + data[lo] + ", ";
      }
      lo++;
    }
    return deque + "}";
  }
  public void addFirst(E element) {
    if(element==null) {
      throw new NullPointerException("Can't add null elements to deque");
    }
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
  public void addLast(E element) {
    if(element==null) {
      throw new NullPointerException("Can't add null elements to deque");
    }
    if(size==0) {
      data[end] = element;
    }
    else {
      end++;
      if(end==data.length) {
        end = 0;
      }
      data[end] = element;
    }
    size++;
  }
  public E removeFirst() {
    if(size==0) {
      throw new NoSuchElementException("There are no elements to remove from the deque");
    }
    E element = data[start];
    data[start] = null;
    start+=1;
    if(start>data.length-1) {
      start = 0;
    }
    size--;
    return element;
  }
  public E removeLast() {
    if(size==0) {
      throw new NoSuchElementException("There are no elements to remove from the deque");
    }
    E element = data[end];
    data[end] = null;
    end-=1;
    if(end<0) {
      end = data.length-1;
    }
    size--;
    return element;
  }
  public E getFirst() {
    if(size==0) {
      throw new NoSuchElementException("There are no elements to get from the deque");
    }
    return data[start];
  }
  public E getLast() {
    if(size==0) {
      throw new NoSuchElementException("There are no elements to get from the deque");
    }
    return data[end];
  }
}
