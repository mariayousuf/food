import java.lang.reflect.Array;

public class ListOfFood {
	
	public static final String[] list = {"Burger","Fries","Broast","Bar.B.Q"};
	
	public static Item getFoodName(String name)
	{
		for(int i=0; i<list.length; i++)
		{
			if(list[i].equalsIgnoreCase(name))
			{
				return new Food_Available(name);
			}
			
			
		}
		return new Food_Not_Available();
		
	}

}
