/**
 * 
 */
package controller;

/**
 * @author Yash
 *
 */
public class ApiResponse {
	
	private String status;
	private String reason;
	
	private int id;
	private String name;
	private String category_name;
	private String description;
	private int buy_price;
	private int sell_price;
	private int quantity;
	
	
	public ApiResponse(String status, String reason) {
		this.status = status;
		this.reason = reason;
	}
	
	public ApiResponse(int id) {
		this.id = id;
	}
	
	public ApiResponse(int id, String name, String category_name, String description, int buy_price, int sell_price, int quantity) {
		this.id = id;
		this.name = name;
		this.category_name = category_name;
		this.description = description;
		this.buy_price = buy_price;
		this.sell_price = sell_price;
		this.quantity = quantity;
	}
 
    public String getStatus() {
        return status;
    }
 
    public String getReason() {
        return reason;
    }

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCategory_name() {
		return category_name;
	}

	public String getDescription() {
		return description;
	}

	public int getBuy_price() {
		return buy_price;
	}

	public int getSell_price() {
		return sell_price;
	}

	public int getQuantity() {
		return quantity;
	}
    
    

}
