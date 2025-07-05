package Kyu6.T04_DetectPangram;

public class NewPangramChecker {

    public boolean check(String sentence) {
//        return sentence.toLowerCase()
//            .replaceAll("[[^a-z]]", "")
//            .chars()
//            .sorted()
//            .distinct()
//            .mapToObj(c -> String.valueOf((char) c))
//            .collect(Collectors.joining()).length() == 26;

        return sentence.toLowerCase()
            .chars()
            .filter(Character::isAlphabetic)
            .distinct()
            .count() == 26;
    }
}
