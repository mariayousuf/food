
public class FoodItems {
	
	String item_name;
	String category;
	String price;
	
	
	public FoodItems (String name, String cat, String Price)
	{
		this.item_name=name;
		this.category=cat;
		this.price=Price;
		
		
	}
	public String get_name(){
		
		return item_name;
	}
	
	public String get_cat()
	{
		
		return category;
		
	}
	public String get_price()
	{
		
		return price;
		
	}

}
