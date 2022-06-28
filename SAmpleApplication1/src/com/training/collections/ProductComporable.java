package com.training.collections;

public class ProductComporable implements Comparable<ProductComporable>{
	int productId;
	String productName;
	float productPrice;
	int result;

	public ProductComporable() {
		productId = 7;
		productName = "pen";
		productPrice = 77007.7f;

	}

	public ProductComporable(int productId, float productPrice) {

		this.productId = productId;
		this.productPrice = productPrice;
		this.productName = "pencil";

	}

	public ProductComporable(int productId, String productName, float productPrice) {

		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;

	}

	@Override
	public int compareTo(ProductComporable obj) {
//		if (productId == obj.productId)
//			result = 0;
//		else
//			result = (productId > obj.productId) ? 1 : -1;
//		return result;
		return this.productId-obj.productId;
	}

	@Override
	public String toString() {
		return "ProductComporable productId=" + productId + ", productName=" + productName + ", productPrice="
				+ productPrice ; 
	}
	public int getProductId() {
		return productId;
	}

	public float getProductPrice() {
		return productPrice;
	}

	public String getProductName() {
		return productName;
	}


}
