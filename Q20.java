public class Q20 {
    public static void main(String[] args) {
  try {
      int[] array = {-1, 2, 3};
      int res = array[-2] / 0; 
  } catch (NegativeArraySizeException e) {
      System.out.println("NegativeArraySizeException caught: " + e.getMessage());
  } catch (ArithmeticException e) {
      System.out.println("ArithmeticException caught: " + e.getMessage());
  }
}
}
