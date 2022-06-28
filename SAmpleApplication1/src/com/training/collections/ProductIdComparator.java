package com.training.collections;

import java.util.Comparator;

public class ProductIdComparator implements Comparator<ProductComporable> {

	public int compare(ProductComporable o1, ProductComporable o2) {

//		if (o1.productId == o2.productId) {
//			return 0;
//		} else if (o1.productId > o2.productId) {
//			return 1;
//		} else {
//			return -1;
//		}
		return o1.productId-o2.productId;
	}
}
