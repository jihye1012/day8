package test.constructorcall2;

public class ClsB extends ClsA{
	public ClsB() {
		System.out.println("ClsB() 기본 생성자 실행");
	}
	public ClsB(int n) {
		super(10);
		System.out.println("ClsB(int n) 기본 생성자 실행");
	}

}
