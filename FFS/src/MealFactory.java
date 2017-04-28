import org.apache.commons.pool.BasePoolableObjectFactory;
public class MealFactory extends BasePoolableObjectFactory{

	
	
	public Object makeObject(){
	
		return new Meal();
	}
	
	public boolean validateObject(Object obj)
	{
		
		if(obj instanceof Meal)
		{
			
			if(((Meal)obj).getName()==null)
			
				
				return true;
			
		}
		return false;
	}
	
	
/*	public void passivateObject(Object obj) throws Exception
	
	{
		
		if(obj instanceof Meal)
		{
			((Meal)obj).setName(null);
			
			
		}

		else
		{
			throw new Exception("unknown object");
			
		}
		
	}*/
}
