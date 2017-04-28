package foodordering;

public class main_method {

	public static void main(String[] args) {
		orderlist o = new orderlist();
		o.menuslist();
		FactoryMethod fm = new FactoryMethod();
		fm.menuselection();
	}

}

 class orderlist{
	public void menuslist()
	{
		System.out.println("1: 3 small pizza + 500ml drink = Rs." + 500);
		System.out.println("2: 3 regular pizza + 1.5L drink = Rs." + 750);
		System.out.println("3: 3 large pizza + 2.25L drink = Rs." + 1050);
		System.out.println("4: 2 regular pizza + 1.0L drink = Rs." + 500);
		System.out.println("5: 2 large pizza + 1.5L drink = Rs." + 850);
		System.out.println("6: 2 regular pizza + 6 wings + 6 garlic bread + 2.25L drink = Rs." + 1150);
		System.out.println("7: 2 large pizza + 2 regular pizza + 2.25L drink = Rs." + 1500);
		System.out.println("8: 5 large pizza + 15 wings + 15 garlic breads + 3x2.25L drink = Rs." + 3000);
		System.out.println("9: 3 large pizza + 2 regular pizza + 3x1.5L drink = Rs." + 1500);
		System.out.println("10: 5 large pizza + 5 regular pizza + 2.25L drink = Rs." + 1500);
	}
	
}
