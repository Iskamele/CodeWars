package Kyu6.T06_WhoLikesIt;

class NewSolution {

    public static String whoLikesIt(String... names) {
        return switch (names.length) {
            case 0 -> "no one likes this";
            case 1 -> "%s likes this".formatted(names[0]);
            case 2 -> "%s and %s like this".formatted((Object[]) names);
            case 3 -> "%s, %s and %s like this".formatted((Object[]) names);
            default -> "%s, %s and %d others like this".formatted(names[0], names[1], names.length - 2);
        };
    }
}
