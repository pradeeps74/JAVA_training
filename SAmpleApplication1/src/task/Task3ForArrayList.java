package task;

import java.util.ArrayList;

import com.training.second.Doctor;

public class Task3ForArrayList {
	public static void main(String[] args) {
		ArrayList <Doctor>ar1=new ArrayList<Doctor>();
		Doctor d =new Doctor(7707,"ortho Doctor","trichy");
		ar1.add(d);
		for (Object o : ar1) {
			System.out.println(o);
		}

	}
}
