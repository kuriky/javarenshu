import java.util.Random;
public class Cleric {

	static final int MAX_HP =  50;
	static final int MAX_MP = 10;
	private String name;
	private int hp;
	private int mp;

	public Cleric(String name, int hp,int mp, Object Tue){
		this.name = name;
		this.hp = hp;
		this.mp = mp;
		Tue = Tue;
	}

		public Cleric(String name, int hp, Object Tue){
			this(name, hp, Cleric.MAX_MP, Tue);
		}
		public Cleric(String name, Object tue){
			this(name, Cleric.MAX_HP, tue);
		}


	public void selfAid(){
		System.out.println(this.name + "はセルフエイドを唱えた");
		this.hp = Cleric.MAX_HP;
		this.mp -= 5;
		System.out.println("HPが最大まで回復した");
	}

	public int pray(int sec){
		System.out.println(this.name + "は" + sec + "秒間天に祈った");
		//論理上の回復量を用いて決定する
		int recover = new Random().nextInt(3) + sec;

		//実際の回復量を計算する
		int recoverActual = Math.min(Cleric.MAX_MP - this.mp, recover);

		this.mp += recoverActual;
		System.out.println("MPが" + recoverActual + "回復した");
		return recoverActual;
	}

	public void run() {
		System.out.println(this.name+"は、逃げ出した!");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは"+this.hp+"でした。");
	}
}