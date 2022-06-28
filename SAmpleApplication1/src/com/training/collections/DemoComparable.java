package com.training.collections;

import java.util.ArrayList;
import java.util.Collections;

public class DemoComparable {
	public static void main(String[] args) {
		ArrayList<ProductComporable> list = new ArrayList<ProductComporable>();
//		ProductComporable  obj1 = new ProductComporable();
//		list.add(obj1);
		list.add(new ProductComporable(88, 98.8f));
		list.add(new ProductComporable(03, 44.4f));
		list.add(new ProductComporable(777, "Chicken Biriyani", 250.7f));
		list.add(new ProductComporable(07, 46.4f));
		Collections.sort(list);
		for (ProductComporable p : list) {
			System.out.println(p.productId);
			System.out.println(p);
		}

	}

}
