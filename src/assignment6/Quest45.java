package assignment6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

//Write a program to find the duplicate name (word) in a file.
public class Quest45 {
    public static void main(String[] args) throws Exception {
        String line, word = "";
        int count = 0, maxCount = 0;
        ArrayList<String> words = new ArrayList<String>();

        //Opens file in read mode
        String filePath = "C:/Users/Sushma/Documents/Demo.txt";
        FileReader file = new FileReader(filePath);
        BufferedReader br = new BufferedReader(file);

        while((line = br.readLine()) != null) {
            String[] string = line.toLowerCase().split("([,.\\s]+)");
            //Adding all words generated in previous step into words
            for(String s : string) {
                words.add(s);
            }
        }
        for(int i = 0; i < words.size(); i++){
            count = 1;
            for(int j = i+1; j < words.size(); j++){
                if(words.get(i).equals(words.get(j))){
                    count++;
                }
            }
            if(count > maxCount){
                maxCount = count;
                word = words.get(i);
            }
        }
        System.out.println("Duplicate word: " + word);
        br.close();
    }
}
