package com.training.collections;

import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer, String> map=new HashMap<Integer, String>();
map.put(77, "Pradeep");
map.put(777, "travel");
map.put(null, "travel");
map.put(null, "travel"); 
map.put(777, "peace");
map.put(777, null);
map.put(577, "silent");
System.out.println("Iterating Hash Map...");
for (Map.Entry<Integer,String> m: map.entrySet()) {
	System.out.println(m.getKey()+" "+m.getValue());
}
	}

}
