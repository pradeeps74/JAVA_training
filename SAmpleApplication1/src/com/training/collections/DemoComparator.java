package com.training.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DemoComparator {
	public static void main(String[] args) {
		ArrayList<ProductComporable> list = new ArrayList<ProductComporable>();
		list.add(new ProductComporable(555, 660000.6f));
		list.add(new ProductComporable(99, "Dell", 4599.9f));
		list.add(new ProductComporable(11, "Mobile", 17599.9f));
		list.add(new ProductComporable(6, 68.6f));
		Collections.sort(list, new ProductIdComparator());
		System.out.println("Sorting elements basis on ID");
		for (ProductComporable p : list) {
			System.out.println(p);
			// System.out.println(p1.productId);
		}
		Collections.sort(list, new ProductPriceComparator());
		System.out.println("Sorting elements basis on Price");
		for (ProductComporable p : list) {
			System.out.println(p);
		}
		Comparator<ProductComporable> comporatorProductName = Comparator.comparing(ProductComporable::getProductName);
		Collections.sort(list, comporatorProductName);
		System.out.println("Sorting based on comporatorProductName");
		for (ProductComporable p : list) {
			System.out.println(p);

		}
		Comparator<ProductComporable> comporatorProductId = Comparator.comparing(ProductComporable::getProductId);
		Collections.sort(list, comporatorProductId);
		System.out.println("Sorting based on comporatorProductId");
		for (ProductComporable p : list) {
			System.out.println(p);
		}
		Comparator<ProductComporable> comporatorProductPrice = Comparator.comparing(ProductComporable::getProductPrice);
		Collections.sort(list, comporatorProductPrice);
		System.out.println("Sorting based on comporatorProductName");
		for (ProductComporable p : list) {
			System.out.println(p);
		}
		Collections.sort(list, new Comparator<ProductComporable>() {
			public int compare(ProductComporable obj, ProductComporable obj2) {
				return obj.getProductId() - obj2.getProductId();
			}
		});
		Comparator<ProductComporable> byName = (ProductComporable o1, ProductComporable o2) -> o1.getProductName()
				.compareTo(o2.getProductName());
		list.sort(byName);
	}

}
