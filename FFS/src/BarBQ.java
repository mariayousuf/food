import java.util.ArrayList;
import java.util.List;

public class BarBQ implements Criteria {
	
	
public List<FoodItems> items (List<FoodItems> fooditems){
		
		
		List<FoodItems> bbq= new ArrayList();
		
		for(FoodItems food:fooditems){
			
			if(food.get_cat().equalsIgnoreCase("BBQ")){
				
				bbq.add(food);
				
				
				
				
			}
			
		}
		return bbq;
	}
}
	
	


