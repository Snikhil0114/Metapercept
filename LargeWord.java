public class LargeWord {

  private static String findLongestword(String input) {
    String[] words = input.split("\\s+");
    String LongestWord = "";
    int maxLength = 0;
    for (String word : words) {
      word = word.replaceAll("[^a-zA-Z]", "");

      if (word.length() > maxLength) {
        maxLength = word.length();
        LongestWord = word;
      }
    }
    return LongestWord;
  }

  public static void main(String args[]) {
    String InputString = "dummy text of the printing and typesetting industry.";
    String LongestWord = findLongestword(InputString);
    System.out.println("Longest word:" + LongestWord);
  }
}
