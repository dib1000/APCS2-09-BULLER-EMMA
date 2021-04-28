public class MyHeap {
  public static void pushDown(int[]data, int size, int index) {
    int current = index;
    while((2*current + 1)<size &&
         ((data[current]<data[2*current + 1]) ||
         ((2*current + 2)<size &&
         data[current]<data[2*current + 2]))) {

          if((2*current + 2)>=size) {
            int swap = data[current];
            data[current] = data[current * 2 + 1];
            data[current * 2 + 1] = swap;
            current = current * 2 + 1;
          }
          else if (data[current*2 + 1]>=data[current * 2 + 2]) {
            int swap = data[current];
            data[current] = data[current * 2 + 1];
            data[current * 2 + 1] = swap;
            current = current * 2 + 1;
          }
          else {
            int swap = data[current];
            data[current] = data[current * 2 + 2];
            data[current * 2 + 2] = swap;
            current = current * 2 + 2;
          }
       }
    }

    public static void buildHeap(int[]data) {
      for(int i = data.length-1; i>=0; i--) {
        pushDown(data , data.length , i);
      }
    }

    public static void remove(int[] data, int size) {
      int storage = data[0];
      data[0] = data[size-1];
      data[size-1] = storage;
      pushDown(data,size-1,0);
    }
}
