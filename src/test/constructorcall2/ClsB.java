package test.constructorcall2;

public class ClsB extends ClsA{
	public ClsB() {
		System.out.println("ClsB() �⺻ ������ ����");
	}
	public ClsB(int n) {
		super(10);
		System.out.println("ClsB(int n) �⺻ ������ ����");
	}

}
