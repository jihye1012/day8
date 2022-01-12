package test.overriding;

public class Bomb extends Weapon {
	public void fire() {
		super.fire();
		System.out.println("½´¿ì¿õ");
	}
}
