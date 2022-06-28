package com.training.collections;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class DemoProperties {
public static void main(String[] args) {
	Properties p= System.getProperties();
	Set s = p.entrySet();
	Iterator iter = s.iterator();
	while(iter.hasNext()) {
		@SuppressWarnings("rawtypes")
		Map.Entry e =(Map.Entry)iter.next();
		System.out.println(e.getKey()+"  "+e.getValue());
	}
	
}
}
