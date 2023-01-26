import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    int[] originalValues = {7, 33, 1, 19};
    int largest = originalValues[0];
    int minimum = originalValues[0];
    for(int i=1;i<originalValues.length;i++)
    {
      if (largest < originalValues[i])
      {
        largest = originalValues[i];
      }
    }
    for(int i=1;i<originalValues.length;i++)
    {
      if (minimum > originalValues[i])
      {
        minimum = originalValues[i];
      }
    }
    int[] newArray = new int[originalValues.length-2];
    int removeLargest = largest;
    int removeMinimum = minimum;
    for(int i=0, k=0;i<originalValues.length;i++)
    {
      int element = originalValues[i];
      if(element!=removeLargest && element !=removeMinimum)
      {
        newArray[k]=originalValues[i];
        k++;
      }
    }
    int total = 0;
    for (int k = 0; k < newArray.length; k++)
    {
      total = total + newArray[k];
    }
    double average = 0;
    if (newArray.length > 0) {
      average = total / newArray.length;
    }
    System.out.println("After Removing Largest and Smallest Values, The Average of The Elements is Equal To: " + (int)average);
  }
}
