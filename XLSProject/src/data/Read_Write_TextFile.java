package data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Read_Write_TextFile {

	public static void main(String[] args) throws IOException {

		File f = new File("/Users/Deth/Desktop/Selenium/testing/temp.txt");
		f.createNewFile(); //creates new text file
		
		FileWriter w = new FileWriter("/Users/Deth/Desktop/Selenium/testing/temp.txt");
		BufferedWriter out = new BufferedWriter(w);
		out.write("Hello, we are writing in a file");
		out.newLine();
		out.write("This is line 1"); // out.write is used to write into the text file
		out.newLine();
		out.write("This is line 2");
		out.newLine();
		out.write("This is line 3");
		out.flush();
		
		
		FileReader r = new FileReader("/Users/Deth/Desktop/Selenium/testing/temp.txt");
		BufferedReader rd = new BufferedReader(r);
		
		String i;
		int x = 0;
		while((i = rd.readLine())!= null) {
			
			System.out.println(i);
			x++;
			
		}
	
		System.out.println(x);
	}

}
