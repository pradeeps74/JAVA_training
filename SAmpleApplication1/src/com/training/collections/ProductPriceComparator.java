package com.training.collections;

import java.util.Comparator;

public class ProductPriceComparator implements Comparator<ProductComporable> {
	public int compare(ProductComporable o1,ProductComporable o2) {
//		if(o1.productPrice==o2.productPrice)
//			return 0;
//		else if(o1.productPrice>o2.productPrice)
//		return 1;
//		else return -1;
		return (int) (o1.productPrice-o2.productPrice);
	}

}
