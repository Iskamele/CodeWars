package Kyu7.T03_ShortestWord;

public class ShortestWord {
    public static int findShort(String s) {
        String[] words = s.split(" ");
        int shortest = s.length();
        for (String word : words){
            if (shortest > word.length()){
                shortest = word.length();
            }
        }
        return shortest;
    }
}