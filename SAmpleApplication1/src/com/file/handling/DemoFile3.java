package com.file.handling;
import java.io.*;
public class DemoFile3 {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("/home/vastpro/Pictures/index.jpeg");
			FileOutputStream fos = new FileOutputStream("/home/vastpro/Downloads/index_new.jpeg");
			int i;
			while((i=fis.read())!=-1) {
				fos.write(i);}
			fis.close();
			fos.close();}
		catch(FileNotFoundException fe) {
			fe.printStackTrace();
		}
		catch(IOException ie) {
			ie.printStackTrace();
		}
	}
}
