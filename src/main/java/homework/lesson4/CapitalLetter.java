package homework.lesson4;

public class CapitalLetter {
    public static void main(String[] args) {
        String letter = "Difficulties mastered are opportunities won.";
      char[] chars = letter.toCharArray();
        for (int i = 0; i < chars.length ; i++) {
            if (i == 0 || chars[i - 1] == ' '){
                chars[i] = Character.toUpperCase(chars[i]);
            }
        }
        System.out.println(chars);
    }
}
