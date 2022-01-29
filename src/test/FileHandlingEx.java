package test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandlingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String str1 = "Order confirmation 1233434";
		FileOutputStream file1;
		
		try {
			
			file1 = new FileOutputStream("results.txt");//first write
			file1.write(str1.getBytes());                  //second write the try and catch
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
	}

}
