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
		System.out.println(producer+"자동차가 주행중");
		// TODO Auto-generated method stub

	}

	@Override
	public void stop() {
		System.out.println(producer+"자동차가 멈춘다");
		// TODO Auto-generated method stub

	}

	@Override
	public void turnLeft() {
		System.out.println(producer+"자동차가 좌회전중");
		// TODO Auto-generated method stub

	}

	@Override
	public void turnRight() {
		System.out.println(producer+"자동차가 우회전중");
		// TODO Auto-generated method stub

	}

}
