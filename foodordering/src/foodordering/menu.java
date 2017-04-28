package foodordering;

public class menu implements Imenu{

	@Override
	public void menus() {
		System.out.println("1: 3 small pizza + 500ml drink" + 500);
	}

}

class menu1 implements Imenu{

	@Override
	public void menus() {
		System.out.println("2: 3 regular pizza + 1.5L drink" + 750);
		
	}
}

class menu2 implements Imenu{

	@Override
	public void menus() {
		System.out.println("3: 3 large pizza + 2.25L drink" + 1050);
		
	}
}

class menu3 implements Imenu{

	@Override
	public void menus() {
		System.out.println("4: 2 regular pizza + 1.0L drink" + 500);
		
	}
}

class menu4 implements Imenu{

	@Override
	public void menus() {
		System.out.println("5: 2 large pizza + 1.5L drink" + 850);
		
	}
}

class menu5 implements Imenu{

	@Override
	public void menus() {
		System.out.println("6: 2 regular pizza + 6 wings + 6 garlic bread + 2.25L drink" + 1150);
		
	}
}

class menu6 implements Imenu{

	@Override
	public void menus() {
		System.out.println("7: 2 large pizza + 2 regular pizza + 2.25L drink" + 1500);
		
	}
}

class menu7 implements Imenu{

	@Override
	public void menus() {
		System.out.println("8: 5 large pizza + 15 wings + 15 garlic breads + 3x2.25L drink" + 3000);
		
	}
}

class menu8 implements Imenu{

	@Override
	public void menus() {
		System.out.println("9: 3 large pizza + 2 regular pizza + 3x1.5L drink" + 1500);
		
	}
}

class menu9 implements Imenu{

	@Override
	public void menus() {
		System.out.println("10: 5 large pizza + 5 regular pizza + 2.25L drink" + 1500);
		
	}
}

