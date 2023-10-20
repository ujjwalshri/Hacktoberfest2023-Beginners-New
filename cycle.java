
public class CycleSort {

  public static void main(String[] args) {
    int[] arr = new int[] {6, 5, 4, 3, 2, 1};
    cycleSort(arr);
    System.out.println(Arrays.toString(arr));
  }

  public static void cycleSort(int[] arr) {
    int i = 0;
    while (i < arr.length) {
      int current = arr[i];
      int j = i;
      while (current != arr[j]) {
        arr[j] = arr[current];
        current = arr[j];
        j = (j + 1) % arr.length;
      }
      arr[i] = current;
      i++;
    }
  }
}
