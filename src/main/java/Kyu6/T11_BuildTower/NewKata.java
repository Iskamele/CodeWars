package Kyu6.T11_BuildTower;

public class NewKata {

    public static String[] towerBuilder(int nFloors) {
        if (nFloors == 0) {
            return new String[0];
        }

        StringBuilder buffer = new StringBuilder();
        buffer.append("*".repeat(Math.max(0, (nFloors - 1) * 2 + 1)));
        String[] towerBuilder = new String[nFloors];
        towerBuilder[towerBuilder.length - 1] = buffer.toString();

        for (int i = 0; i < nFloors - 1; i++) {
            String space = " ".repeat(i + 1);
            StringBuilder builder = new StringBuilder(buffer);
            towerBuilder[nFloors - 2 - i] = builder
                .replace(0, i + 1, space)
                .replace(builder.length() - 1 - i, builder.length(), space)
                .toString();
        }

        return towerBuilder;
    }
}
