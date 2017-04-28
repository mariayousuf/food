import org.apache.commons.pool.BasePoolableObjectFactory;
public class EmployeeFactory extends BasePoolableObjectFactory{

	
	
	public Object makeObject(){
	
		return new Employee();
	}
	
	public boolean validateObject(Object obj)
	{
		
		if(obj instanceof Employee)
		{
			
			if(((Employee)obj).getName()==null)
			
				
				return true;
			
		}
		return false;
	}
	
	
	public void passivateObject(Object obj) throws Exception
	
	{
		
		if(obj instanceof Employee)
		{
			((Employee)obj).setName(null);
			
			
		}

		else
		{
			throw new Exception("unknown object");
			
		}
		
	}
}
