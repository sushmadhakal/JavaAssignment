package assignment6;
//Write a Program to display names in short form. E.g. Ram Kishore Singh  -> R. k. Singh
public class Quest39 {
    public static void main(String[] args) {

        String name = "Ram Kishor Singh";
        System.out.println("The full name is: " + name);

        int len = name.length();
        name = name.trim();
        String str1 = "";
        for (int i = 0; i < len; i++) {
            char ch = name.charAt(i);
            if (ch != ' ') {
                str1 = str1 + ch;

            } else {
                System.out.print(Character.toUpperCase(str1.charAt(0)) + ". ");
                str1 = "";
            }
        }
        String str2 = "";
        for (int j = 0; j < str1.length(); j++) {
            if (j == 0)
                str2 = str2 + Character.toUpperCase(str1.charAt(0));
            else
                str2 = str2 + Character.toLowerCase(str1.charAt(j));
        }
        System.out.print(str2);
    }
}
