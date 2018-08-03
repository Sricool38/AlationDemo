package Alation.com.Pages.Context;

public class SearchPageContext {
	public static String productDesc;
	public static String productPaperPrice;
	public static String productKindlePrice;
	public static String productUsedPrice;

	public  String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		SearchPageContext.productDesc = productDesc;
	}

	public String getProductPaperPrice() {
		return productPaperPrice;
	}

	public void setProductPaperPrice(String productPaperPrice) {
		SearchPageContext.productPaperPrice = productPaperPrice;
	}

	public String getProductKindlePrice() {
		return productKindlePrice;
	}

	public void setProductKindlePrice(String productKindlePrice) {
		SearchPageContext.productKindlePrice = productKindlePrice;
	}

	public String getProductUsedPrice() {
		return productUsedPrice;
	}

	public void setProductUsedPrice(String productUsedPrice) {
		SearchPageContext.productUsedPrice = productUsedPrice;
	}

}
