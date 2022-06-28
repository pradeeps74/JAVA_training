package generics;

public class DemoVarArgs {
	//var args ==> variable length arguments
	static void displayDAta(int id , String name  , String... Certification) {
		System.out.print(id+"    "+name);
		for (String s:Certification) {
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str ="Pradeep";
displayDAta(1,"Kalyani");
displayDAta(7, str,"Java");
displayDAta(8, str,"Cyber security","JAVA","SQL","Selenium","Manual testing");
	}

}
