/**
 * 
 */
package test.overriding;

/**
 * @author yjh05
 *
 */
public class Lexus extends Car {
	private String producer = "Lexus";

	@Override
	public void drive() {
		System.out.println(producer+"�ڵ����� ������");
		// TODO Auto-generated method stub

	}

	@Override
	public void stop() {
		System.out.println(producer+"�ڵ����� �����");
		// TODO Auto-generated method stub

	}

	@Override
	public void turnLeft() {
		System.out.println(producer+"�ڵ����� ��ȸ����");
		// TODO Auto-generated method stub

	}

	@Override
	public void turnRight() {
		System.out.println(producer+"�ڵ����� ��ȸ����");
		// TODO Auto-generated method stub

	}

}
