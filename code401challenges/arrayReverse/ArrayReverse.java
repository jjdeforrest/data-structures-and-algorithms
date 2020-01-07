public class ArrayReverse {
  public static void main(String[] args){

    int[] arrayOne = new int[] {1,2,3,4,5,6};
    reverseArray(arrayOne);
    for(int i = 0; i < arrayOne.length; i++) {
      System.out.println(arrayOne[i]);
    }
  }
  public static int[] reverseArray( int[] array ) {
    if (array.length > 1) {
      for (int i = 0; i < array.length / 2; i++) {
        int previousValue = array[array.length - i -1];
        array[array.length -i -1]=array[i];
        array[i]=previousValue;
      }
    }
    return array;

  }
}


