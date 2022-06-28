package generics;

public class DemoGenerics {
	public static < E > void printArray(E[] arr) {
		for (E element : arr) {
			System.out.printf("%s",element);
		}
	}
public static void main(String[] args) {
	Integer [] iarr= {10,20,7,30,77,88};
	Double[] darr= {1.1,2.2,3.3,4.4,5.5};
	Character[] carr = {'p','e','a','c','e'};
	System.out.println("Displaying int array");
	printArray(iarr);
	System.out.println("Displaying Double array");
	printArray(darr);
	System.out.println("Displaying Char array");
	printArray(carr);
	Test <String> tobj1= new Test("Deepan");
	System.out.println(tobj1.getObject());
	Test <Integer> tobj2 = new Test(7878);
	System.out.println(tobj2.getObject());
	
	Test <Long> tobj3 = new Test(9791280195l);
	System.out.println(tobj3.getObject());
	
}
}
class Test <T> //generic class
{
	int id;String name;
	T obj1;//an object type T is declared
	Test(T obj1){
		this.obj1=obj1;
	}
	public T getObject() {
		return this.obj1;
	}
}
