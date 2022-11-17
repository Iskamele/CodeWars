package T10_DetectPangram;

import java.util.stream.Collectors;

public class PangramChecker {
    public boolean check(String sentence) {
        // doesn't work
        // return (sentence.toLowerCase().matches(".*(a.*b.*c|a.*c.*b|b.*a.*c|b.*c.*a|c.*a.*b|c.*b.*a).*"));

        return sentence.toLowerCase().replaceAll("[^a-z]", "")
                .chars().distinct()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining())
                .length() == 26;


    }
}
