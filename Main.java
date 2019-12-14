import java.util.*;


class Main {
  public static void main(String[] args) {
    int number = 5;
    int count = 4;
    int[] newArray = multiplesOf(number, count);
    System.out.println(Arrays.toString(newArray));
    int[] arrays = {1,2,3,4,5,6};
    int[] newArray2 = reverseArray(arrays);
    System.out.println(Arrays.toString(newArray2));
  }
  public static int[] multiplesOf(int number, int count){
    int[] newArray = new int[count];
    int x = 1;
    for (int i = 0; i < count; i++){
      newArray[i] = number * x;
      x++;
    }
    return newArray;
  }

  public static int[] reverseArray(int[] arrays){
    int[] newArray = new int[arrays.length];
    int x = 0;
    for (int i = arrays.length - 1; i >= 0; i--){
      newArray[x] = arrays[i];
      x++;
    }
    return newArray;
  }


}