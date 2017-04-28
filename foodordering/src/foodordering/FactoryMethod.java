package foodordering;

public class FactoryMethod {
	
	public void menuselection()
	{
		java.util.Scanner scan=new java.util.Scanner(System.in);
        String a=scan.next();
        scan.close();
        Imenu i;
        if(a.equals("1"))
        {
        	i = new menu();
        	i.menus();
        	
        }
        else if(a.equals("2"))
        {
        	i = new menu1();
        	i.menus();
        }
        else if(a.equals("3"))
        {
        	i = new menu2();
        	i.menus();
        }
        else if(a.equals("4"))
        {
        	i = new menu3();
        	i.menus();
        }
        else if(a.equals("5"))
        {
        	i = new menu4();
        	i.menus();
        }
        else if(a.equals("6"))
        {
        	i = new menu5();
        	i.menus();
        }
        else if(a.equals("7"))
        {
        	i = new menu6();
        	i.menus();
        }
        else if(a.equals("8"))
        {
        	i = new menu7();
        	i.menus();
        }
        else if(a.equals("9"))
        {
        	i = new menu8();
        	i.menus();
        }
        else if(a.equals("10"))
        {
        	i = new menu9();
        	i.menus();
        }
        
        
	}
}
	
		
	