package assignment6;

//Write a program to find the duplicate letter in a word.
public class Quest41 {
    public static void main(String[] args) {
        String word = "icecream";

        int count = 0;
        char[] letters = word.toCharArray();
        System.out.println("Duplicate Characters are:");
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j < word.length(); j++) {
                if (letters[i] == letters[j]) {
                    System.out.println(letters[j]);
                    count++;
                    break;
                }
            }
        }


    }
}
