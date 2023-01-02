package T13_HighestAndLowest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KataTestStream {
  @Test
  public void test1() {
    assertEquals("42 -9", KataStream.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
  }
  @Test
  public void test2() {
    assertEquals("3 1", KataStream.highAndLow("1 2 3"));
  }
}