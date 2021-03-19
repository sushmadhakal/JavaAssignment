package assignment6;

import java.io.*;
import java.util.Scanner;
//Write a program to store the name and address of 10 students in file and search address by given name.

public class Quest44 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String filePath = "C:/Users/Sushma/Documents/Student.txt";
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(filePath)));

        String []name = new String[10];
        String []address = new String[10];
        String s;

        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {

            System.out.println("Enter student " + (i+1) + " details:");
            System.out.println("Enter name and address: ");
            name[i] = br.readLine();
            address[i] = br.readLine();
        }

        for (int i = 0; i < 10; i++) {
            pw.println(name[i]+" "+address[i]);
        }
    }
}

