
public class Hero02 {
	String name;
	int hp;
	static int money;

	static void setRandomMoney(){
		Hero02.money = (int)(Math.random() * 1000);
	}
}
