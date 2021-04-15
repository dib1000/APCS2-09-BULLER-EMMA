import java.util.*;
public class Frontier {
  private ArrayDeque frontier;

  public Frontier() {
    frontier = new ArrayDeque(1000);
  }

  public Frontier(int size) {
    frontier = new ArrayDeque(size);
  }

  public int size() {
    return frontier.size();
  }

  @SuppressWarnings("unchecked")
  public void add(int[] location) {
    frontier.addLast(location);
  }

  @SuppressWarnings("unchecked")
  public int[] remove() {
    return (int[]) frontier.removeFirst();
  }
}
