
public class Meal  {
	
	
	private static int base=0;
  protected String name;
	private int DealId;
	
	
	public Meal()
	{
		
		this.DealId=base++;
		
		
	}

	public int getId()
	{
		return this.DealId;
		
		
	}
	
	
	public String getName()
	{
		
		return this.name;
	}

	
	
	public void setName(String name)
	{
		this.name=name;
		
	}

	public void doWork()
	{
		System.out.println("The deal of  " + name + " is Prepared");
		
	}
	public String toString()
	{
		return("Id :" + this.DealId + ", Name " +this.name);
		
	}
	
	
	
}
