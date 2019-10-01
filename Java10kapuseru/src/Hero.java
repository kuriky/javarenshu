
public class Hero {
	private int hp;
	String name;
	static int money;

	public String getName(){
		return this.name;
	}

	void sleeo(){
		this.hp = 100;
		System.out.println(this.name + "は、眠ってしまった");
	}
	public void attack(Matango m){
	}


	private void die(){
		System.out.println(this.name + "は、死んでしまった。");
		System.out.println("GAMEOVER");
	}

}
