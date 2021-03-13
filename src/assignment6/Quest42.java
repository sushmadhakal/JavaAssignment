package assignment6;

//Write a program to find the duplicate word from a long string.
public class Quest42 {
    public static void main(String[] args) {
        String string = "big black cat is sitting on a black rug and drinking a big bowl of milk";

        String[] words = string.split(" ");

        System.out.println("Duplicate words in a given string : ");

        for(int i = 0; i < words.length; i++) {
            int count = 1;
            for(int j = i+1; j < words.length; j++) {
                if(words[i].equals(words[j])) {
                    count++;

                    words[j] = "0";
                }
            }
            if(count > 1 && !words[i].equals("0"))
                System.out.println(words[i]);
        }
    }

}
