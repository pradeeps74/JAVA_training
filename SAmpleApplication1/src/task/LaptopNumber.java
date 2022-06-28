package task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
//import java.util.Map.Entry;

import com.training.collections.ProductComporable;
import com.training.second.Student;

public class LaptopNumber {
	public static void main(String[] args) {
		HashMap<Integer, Student>map=new HashMap<Integer, Student>();
		int laptopNumber=7875;
		map.put(laptopNumber, new Student("Kalyani", "Metturdam,salem", 8056789004l, 2310, "diploma nursing", "nursing", 85, "salem"));
		map.put(laptopNumber,new Student("Durai", "Mettur,dam,salem", 8956789204l, 1310, "10th", "welding", 75, "mettur"));
		map.put(laptopNumber,new Student("Selvarajan", "mel Mettur,,salem", 98056789001l, 3315, "10th", "railway department", 65, "Bangalore"));
		
		 for (@SuppressWarnings("rawtypes") Map.Entry entry : map.entrySet()) {
	            System.out.println("Key = " + entry.getKey() +
	                             ", Value = " + entry.getValue());
	    }
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("Kalyani", "Metturdam,salem", 8056789004l, 2310, "diploma nursing", "nursing", 85,
				"salem"));
		list.add(new Student("Durai", "Mettur,dam,salem", 8956789204l, 1310, "master", "welding", 75, "mettur"));
		list.add(new Student("Selvarajan", "mel Mettur,,salem", 98056789001l, 3315, "train", "railway department", 65,
				"Bangalore"));
		System.out.println("sort by rollnumber");
		Collections.sort(list, new Comparator<Student>() {
			public int compare(Student o1, Student o2) {

				return o1.getRollNumber() - o2.getRollNumber();
			}
		});
		for (Student s : list) {
			System.out.println(s);

		}
		System.out.println("sort by course");
		Collections.sort(list, new Comparator<Student>() {
			public int compare(Student o1, Student o2) {

				return o1.getCourse().compareTo(o2.getCourse());
			}
		});
		for (Student s : list) {
			System.out.println(s);

		}
		System.out.println("sort by marks");
		Collections.sort(list, new Comparator<Student>() {
			public int compare(Student o1, Student o2) {

				return (int) (o1.getMarks() - o2.getMarks());
			}
		});
		for (Student s : list) {
			System.out.println(s);

		}

	}
}
