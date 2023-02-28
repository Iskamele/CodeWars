package Kyu6.T04_DetectPangram;

public class PangramCheckerCharLoop {
    public boolean check(String sentence) {
        for (char c = 'a'; c <= 'z'; c++)
            if (!sentence.toLowerCase().contains("" + c))
                return false;
        return true;
    }
}
