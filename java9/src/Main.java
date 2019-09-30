
public class Main {
	public static void main(String[]args){
		Hero02 h1 = new Hero02();
		Hero02 h2 = new Hero02();
		Hero02.money = 100;
		System.out.println(Hero02.money);
		System.out.println(h1.money);
		h1.money = 300;
		System.out.println(h2.money);
	}

}
