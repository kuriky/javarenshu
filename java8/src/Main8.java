public class Main8 {
	public static void main(String[]args){
		Sword s = new Sword();
		s.name ="炎の剣";
		s.damage = 10;
		
		Hero h=new Hero();
		h.name="ミナト";
		h.hp=100;
		h.sword = s;
		System.out.println("現在の武器は"+ h.sword.name);
		
		Tue t = new Tue();
		t.name="祈りの杖";
		t.damage = 3;

		Cleric c=new Cleric();
		c.name="クレサン";
		c.tue = t;
		System.out.println("現在の武器は"+ c.tue.name);

		Matango m1 = new Matango();
		m1.hp = 50;
		m1.suffix = 'A';

		Matango m2 = new Matango();
		m2.hp = 48;
		m2.suffix = '8';

		//冒険の始まり
		c.selfAid();
		h.slip();
		m1.run();
		m2.run();
		h.run();
		c.run();
	}
}