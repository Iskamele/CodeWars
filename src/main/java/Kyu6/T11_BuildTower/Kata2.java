package Kyu6.T11_BuildTower;

public class Kata2
{
  public static String[] towerBuilder(int nFloors)  {
    String[] tower = new String[nFloors];
    int width = nFloors * 2 - 1;
    for (int i = 0; i < nFloors; i++) {
      int asterisks = i * 2 + 1;
      int spaces = (width - asterisks) / 2;
      StringBuilder sb = new StringBuilder();
      for (int j = 0; j < spaces; j++) {
        sb.append(" ");
      }
       for (int j = 0; j < asterisks; j++) {
        sb.append("*");
      }
      for (int j = 0; j < spaces; j++) {
        sb.append(" ");
      }
      tower[i] = sb.toString();
    }
    return tower;
  }
}