package Kyu6.T04_DetectPangram;

public class PangramCheckerCleverSolution {
    public boolean check(String sentence) {
        return sentence.chars().map(Character::toLowerCase).filter(Character::isAlphabetic).distinct().count() == 26;
    }
}
