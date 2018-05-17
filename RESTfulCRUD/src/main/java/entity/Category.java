package entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Category{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int category_id;
	
	//private String name;
	//private String description;
	//private int buy_price;
	//private int sell_price;
	//private int quantity;	
	private String category;
	
	public Category (String category) {
		//this.name = name;
		//this.description = description;
		//this.buy_price = buy_price;
		//this.sell_price = sell_price;
		//this.quantity = quantity;
		this.category = category;
	}
	
	public Category (int category_id) {
		this.category_id = category_id;
	}
	
	public int getCategoryId() {
		return category_id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category_name) {
		this.category = category_name;
	}
	
	

}
