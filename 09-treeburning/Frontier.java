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
}
