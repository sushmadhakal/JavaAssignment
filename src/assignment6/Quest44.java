package assignment6;

import java.io.*;
import java.util.Scanner;
//Write a program to store the name and address of 10 students in file and search address by given name.

public class Quest44 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void addRecords() throws IOException {
        String filePath = "C:/Users/Sushma/Documents/Student.txt";
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(filePath)));

        String name;
        String address;
        boolean addMore = false;
        do
        {
            System.out.print("\nEnter name and address: ");
            name = br.readLine();
            address = br.readLine();
            // Print to File
            pw.println(name+" "+address);

            System.out.print("Do you want to add more records ? (y/n) : ");
            String s = br.readLine();
            addMore = s.equalsIgnoreCase("y");
        } while(addMore);
        pw.close();
    }
    public static void main(String[] args) {
        String name;
        String address;
        Scanner input = new Scanner(System.in);

        try {
            addRecords();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
