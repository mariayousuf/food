import java.util.ArrayList;
import java.util.List;

public class FastFood implements Criteria {
	
	public List<FoodItems> items (List<FoodItems> fooditems){
		
		
		List<FoodItems> fastfood = new ArrayList();
		
		for(FoodItems food : fooditems)
		{
			
			if(food.get_cat().equalsIgnoreCase("Fast Food")){
				
				fastfood.add(food);
				
				
			}
			
		}
		return fastfood;
	}
}
