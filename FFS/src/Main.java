import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.apache.commons.pool.impl.GenericObjectPool;


public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	
		Scanner s= new Scanner(System.in);
		
	
		System.out.println("enter user name");
		String user=s.nextLine();
		if(user.equalsIgnoreCase("user"))
		{
			Item obj1=ListOfFood.getFoodName("Burger");
			Item  obj2=ListOfFood.getFoodName("Pizza");
			Item  obj3=ListOfFood.getFoodName("Fries");
			Item  obj4=ListOfFood.getFoodName("Sandwich");
			Item 	 obj5=ListOfFood.getFoodName("Bar.B.Q");
			System.out.println(obj1.name());
			System.out.println(obj2.name());
			System.out.println(obj3.name());
			System.out.println(obj4.name());
			System.out.println(obj5.name());
			
			
	/*		Scanner b= new Scanner(System.in);
			System.out.println("Enter Time");
			int thread=b.nextInt();
			int timemi =b.nextInt();
			int sleep=b.nextInt();*/

			GenericObjectPool pool = new GenericObjectPool();
			pool.setFactory(new MealFactory());

			Thread.currentThread().sleep(1000);

			for (int i = 0; i <5; i++) {
				pool.addObject();

			}
			pool.setMinEvictableIdleTimeMillis(1000);
			pool.setTimeBetweenEvictionRunsMillis(600);
			System.out.println("Number of deal in system: " + pool.getNumIdle());
			Thread.currentThread().sleep(1500);

			Meal deal = (Meal) pool.borrowObject();


			deal.setName(obj1.name());
			deal.doWork();

		
			deal.setName(obj3.name());
			deal.doWork();

			

			deal.setName(obj5.name());
			deal.doWork();
			
			
			System.out.println("Deal :" + deal);
			pool.returnObject(deal);
			System.out.println("Number of deal in system: " + pool.getNumIdle());
		

		}
		
		
		else if(user.equalsIgnoreCase("admin")){
			 List<FoodItems> foods = new ArrayList<FoodItems>();
				foods.add(new FoodItems("burger" , "fast food" , "180"));
				foods.add(new FoodItems("McNuggets" , "fast food" , "200"));
				foods.add(new FoodItems("tikka" , "bbq" , "210"));
				foods.add(new FoodItems("Pasta" , "fast food" , "100"));
				foods.add(new FoodItems("Role" , "bbq" , "120"));
				foods.add(new FoodItems("Sandwich" , "fast food" , "150"));
				
				
				Criteria bbq = new BarBQ();
				Criteria fastfood = new FastFood ();
				
				System.out.println("BBQ");
				printFoods(bbq.items(foods));
				System.out.println("Fast Food");
				printFoods(fastfood.items(foods));
		}
		
	
	

	
}
		
		public static void printFoods(List<FoodItems> items) {
			
			for(FoodItems foods : items){
				System.out.println("food item : " + foods.get_name() + " , Category : " + foods.get_cat() + " , Price : " + foods.get_price() + "]");
			}
		
		
		
		
	
		
		
		

	}

}
	
	
	
	
	
	

