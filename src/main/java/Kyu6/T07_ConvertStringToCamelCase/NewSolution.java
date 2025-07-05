package Kyu6.T07_ConvertStringToCamelCase;

class NewSolution {

    static String toCamelCase(String s) {
        if (s.isEmpty()) {
            return s;
        }

        String[] split = s.toLowerCase().split("[^a-z]");
        StringBuilder sb = new StringBuilder(s.charAt(0) + split[0].substring(1));
        for (int i = 1; i < split.length; i++) {
            sb.append(split[i].substring(0, 1).toUpperCase())
                .append(split[i].substring(1).toLowerCase());
        }
        return sb.toString();
    }
}
