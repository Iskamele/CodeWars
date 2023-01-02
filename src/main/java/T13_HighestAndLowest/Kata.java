package T13_HighestAndLowest;

public class Kata {
  public static String highAndLow(String numbers) {
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    for (String number : numbers.split(" ")) {
      int temp = Integer.parseInt(number);
      if (temp < min) {
        min = temp;
      }
      if (temp > max) {
        max = temp;
      }
    }
    return max + " " + min;
  }
}