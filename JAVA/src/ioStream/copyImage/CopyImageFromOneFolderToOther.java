package ioStream.copyImage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyImageFromOneFolderToOther {
	
	public static void main(String[] args) {
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {
			System.out.println("opening input and output stream");
			 fis= new FileInputStream("/Users/y/Desktop/rdr2ep2.jpg");
			 fos=new FileOutputStream("/Users/y/Desktop/test.jpg");
			
			int data;
			System.out.println("writing data");
			while((data=fis.read())!=-1)
			{
				fos.write(data);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				System.out.println("closing fis and fos");
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
