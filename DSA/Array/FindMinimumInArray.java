
public class FindMinimumInArray {

  public static int findMinimum(int[] arr) {
    int min = arr[0];;

    for(int i=0; i< arr.length; i++) {
      if(arr[i] < min){
        min = arr[i];
      }
    }

    return min;        
  }
  
   public static void main(String args[]) {

    int[] arr = { 9, 2, 3, 6};

    System.out.print("Array : ");
    for(int i = 0; i < arr.length; i++)
      System.out.print(arr[i] + " ");
    System.out.println();

    int min = findMinimum(arr);
    System.out.println("Minimum in the Array: " + min);

  }
}
//Complexity is O(n)