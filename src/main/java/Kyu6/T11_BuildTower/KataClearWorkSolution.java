package Kyu6.T11_BuildTower;

public class KataClearWorkSolution {
    public static String[] TowerBuilder(int n) {
        String[] t = new String[n];
        String e;

        for (int i = 0; i < n; i++)
            t[i] = (e = " ".repeat(n - i - 1)) + "*".repeat(i + i + 1) + e;

        return t;
    }
}
