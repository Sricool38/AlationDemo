package Alation.com.Pages.Context;

public class ProductDetailsPageContext {

	public static String productDesc;
	public static String productPaperPrice;
	public static String productKindlePrice;
	public static String productUsedPrice;

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		ProductDetailsPageContext.productDesc = productDesc;
	}

	public String getProductPaperPrice() {
		return productPaperPrice;
	}

	public void setProductPaperPrice(String productPaperPrice) {
		ProductDetailsPageContext.productPaperPrice = productPaperPrice;
	}

	public String getProductKindlePrice() {
		return productKindlePrice;
	}

	public void setProductKindlePrice(String productKindlePrice) {
		ProductDetailsPageContext.productKindlePrice = productKindlePrice;
	}

	public String getProductUsedPrice() {
		return productUsedPrice;
	}

	public void setProductUsedPrice(String productUsedPrice) {
		ProductDetailsPageContext.productUsedPrice = productUsedPrice;
	}

}
