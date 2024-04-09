package ioStream.serializationAndDeserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationAndDeserialization {

	public static void main(String[] args) {

		Employee obj = new Employee(101, "yuv", "gurgaon", 1234);
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try {
			fos = new FileOutputStream(
					"/Users/91628/Desktop/JAVAcoding/JavaGithub/JAVA_Concepts/JAVA/src/ioStream/serializationAndDeserialization/object.ser");
			oos = new ObjectOutputStream(fos);

			oos.writeObject(obj);

			fis = new FileInputStream(
					"/Users/91628/Desktop/JAVAcoding/JavaGithub/JAVA_Concepts/JAVA/src/ioStream/serializationAndDeserialization/object.ser");
			ois = new ObjectInputStream(fis);
			Object obj2 = ois.readObject();
			Employee empObj = (Employee) obj2;
			System.out.println(empObj);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
				oos.close();
				fis.close();
				ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

}
