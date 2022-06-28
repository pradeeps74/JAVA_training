package task;
import com.training.second.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Task4FileHandling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter file name");
		String filename = sc.next();
		try {
			FileInputStream fis = new FileInputStream(filename);
			FileOutputStream fos = new FileOutputStream("Doctor1.txt");
			int f;
			while ((f = fis.read()) != -1) {
				fos.write(f);
			}
			fis.close();
			fos.close();
			System.out.println("File copied successfully");

		}catch(IOException ie) {
			System.out.println(ie);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		sc.close();
	}

}
