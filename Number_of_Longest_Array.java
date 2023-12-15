public class Number_of_Longest_Array {

  public static void main(String args[]) {
    Object[] jaggedArray = {
      2,
      4,
      10,
      new Object[] { 12, 4, new Object[] { 100, 99 }, 4 },
      new Object[] { 3, 2, 99 },
      0,
    };
    int maxNumber = findmynumber(jaggedArray);
    System.out.println("Maximum Number:" + maxNumber);
  }

  private static int findmynumber(Object[] Array) {
    int maxNumber = Integer.MIN_VALUE;
    for (Object element : Array) {
      if (element instanceof Integer) {
        int number = (int) element;
        maxNumber = Math.max(maxNumber, number);
      } else if (element instanceof Object[]) {
        int maxInSubArray = findmynumber((Object[]) element);
        maxNumber = Math.max(maxNumber, maxInSubArray);
      }
    }
    return maxNumber;
  }
}
