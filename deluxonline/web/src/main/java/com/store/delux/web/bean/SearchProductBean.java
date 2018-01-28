package com.store.delux.web.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.store.delux.commons.Constants;
import com.store.delux.service.dto.ProductDTO;
import com.store.delux.service.dto.PurchasedProductDTO;
import com.store.delux.service.service.SearchProductService;
import com.store.delux.service.service.impl.SearchProductServiceImpl;

@ManagedBean(name = "productBean")
@ViewScoped
public class SearchProductBean extends BaseBean {
	
	private static final long serialVersionUID = 1L;
	
	private List<ProductDTO> productList;
	private boolean show;
	
	private HeadBean headBean;
	private SearchProductService productService; 
	
	public SearchProductBean() throws Exception{
		productList = new ArrayList<ProductDTO>();
		headBean = new HeadBean();
		productService = new SearchProductServiceImpl();
		
		show = false;
		
		this.getProducts();
	}
	
	public String getProducts() throws Exception{
	
		
		productList = productService.getProductsByCategory(Constants.CATEGORY_LAPTOP_TYPE);
		
		
		
		/*ProductDTO prod = new ProductDTO();
		
		prod.setProdCode("HP2113-0986");
		prod.setProdName("HP Ultrabook 2113");
		prod.setProdDesc("LaptopHP / Disco duro 150 gb / memoria 2 gb / pantalla 14");
		prod.setPriceBuy(new BigDecimal(2435.34));
		prod.setProdImg("lap_01");
		productList.add(prod);
		
		prod = new ProductDTO();
		prod.setProdCode("HP2113-0986");
		prod.setProdName("HP Ultrabook 2113");
		prod.setProdDesc("LaptopHP / Disco duro 150 gb / memoria 2 gb / pantalla 14");
		prod.setPriceBuy(new BigDecimal(2435.34));
		prod.setProdImg("lap_02");
		productList.add(prod);
		
		prod = new ProductDTO();
		prod.setProdCode("HP2113-0986");
		prod.setProdName("HP Ultrabook 2113");
		prod.setProdDesc("LaptopHP / Disco duro 150 gb / memoria 2 gb / pantalla 14");
		prod.setPriceBuy(new BigDecimal(2435.34));
		prod.setProdImg("lap_03");
		productList.add(prod);
		
		prod = new ProductDTO();
		prod.setProdCode("HP2113-0986");
		prod.setProdName("HP Ultrabook 2113");
		prod.setProdDesc("LaptopHP / Disco duro 150 gb / memoria 2 gb / pantalla 14");
		prod.setPriceBuy(new BigDecimal(2435.34));
		prod.setProdImg("lap_04");
		productList.add(prod);
		
		prod = new ProductDTO();
		prod.setProdCode("HP2113-0986");
		prod.setProdName("HP Ultrabook 2113");
		prod.setProdDesc("LaptopHP / Disco duro 150 gb / memoria 2 gb / pantalla 14");
		prod.setPriceBuy(new BigDecimal(2435.34));
		prod.setProdImg("lap_05");
		productList.add(prod);
		
		prod = new ProductDTO();
		prod.setProdCode("HP2113-0986");
		prod.setProdName("HP Ultrabook 2113");
		prod.setProdDesc("LaptopHP / Disco duro 150 gb / memoria 2 gb / pantalla 14");
		prod.setPriceBuy(new BigDecimal(2435.34));
		prod.setProdImg("lap_06");
		productList.add(prod);
		
		prod = new ProductDTO();
		prod.setProdCode("HP2113-0986");
		prod.setProdName("HP Ultrabook 2113");
		prod.setProdDesc("LaptopHP / Disco duro 150 gb / memoria 2 gb / pantalla 14");
		prod.setPriceBuy(new BigDecimal(2435.34));
		prod.setProdImg("lap_07");
		productList.add(prod);
		
		prod = new ProductDTO();
		prod.setProdCode("HP2113-0986");
		prod.setProdName("HP Ultrabook 2113");
		prod.setProdDesc("LaptopHP / Disco duro 150 gb / memoria 2 gb / pantalla 14");
		prod.setPriceBuy(new BigDecimal(2435.34));
		prod.setProdImg("lap_08");
		productList.add(prod);*/
		
		return null;
	}
	
	public String addPurchases(){
		PurchasedProductDTO pchProduct = new PurchasedProductDTO();
		
		pchProduct.setProdCode("CDTEST");
		pchProduct.setProdName("PNAME TEST");
		pchProduct.setQty(4);
		pchProduct.setPrice(new BigDecimal(2350.00));
		
		headBean.getPurchases().getProductsList().add(pchProduct);
		
		return null;
	}

	public HeadBean getHeadBean() {
		return headBean;
	}

	public void setHeadBean(HeadBean headBean) {
		this.headBean = headBean;
	}

	public List<ProductDTO> getProductList() {
		return productList;
	}

	public void setProductList(List<ProductDTO> productList) {
		this.productList = productList;
	}

	public boolean isShow() {
		return show;
	}

	public void setShow(boolean show) {
		this.show = show;
	}

}
