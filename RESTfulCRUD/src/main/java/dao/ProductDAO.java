package dao;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import entity.Category;
import entity.Product;

/**
 * @author Yash
 *
 */

public class ProductDAO {
	
	private static final Map<Integer, Product> productMap = new HashMap<Integer, Product>();
	 
    static {
        initialize();
    }
 
    private static void initialize() {
    	Category c1 = new Category("Mobiles");
    	int c1_id = c1.getCategoryId();
    	
        Product p1 = new Product("IPhone X", "Apple Phone", 80000, 90000, 200, c1_id);
        Product p2 = new Product("Galaxy S9", "Samsung Phone", 50000, 60000, 500, c1_id);
        Product p3 = new Product("OnePlus 5", "OnePlus Phone", 20000, 30000, 1000, c1_id);
        
        //p1.setCategory("Mobiles");
        //p2.setCategory("Mobiles");
        //p3.setCategory("Mobiles");
 
        productMap.put(p1.getId(), p1);
        productMap.put(p2.getId(), p2);
        productMap.put(p3.getId(), p3);
    }
    
    public static Product getProduct(int product_id) {
    	return productMap.get(product_id);
    }
    
    public static Product addProduct(Product product) {
    	productMap.put(product.getId(), product);
    	return product;
    }
    
    public static int getProductId(Product product) {
    	for (Entry<Integer, Product> entry : productMap.entrySet()) {
            if (entry.getValue().equals(product)) {
                return entry.getKey();
            }
        }
    	return 0;
    }
    
    public static boolean deleteProduct(int product_id) {
    	if(productMap.remove(product_id) == null)
    		return false;
    	else
    		return true;
    }
    
    public static Product updateProduct(Product old_product, Product new_product) {
    	productMap.put(old_product.getId(), new_product);
    	return new_product;
    }
    
    
    
    

}
