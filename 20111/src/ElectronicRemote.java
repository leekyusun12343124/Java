class Tv{
	boolean onOff;
	Tv(){
		
	}
	void print() {
		System.out.println("TV ������ "+onOff + "�ֽ��ϴ�");
	}
}
class Diswash{
	boolean onOff;
	Diswash(){
		
	}
	void print() {
		System.out.println("�ı⼼ô�� ������ "+onOff + "�ֽ��ϴ�");
	}
}
public class ElectronicRemote {
	
	public static void main(String[] args) {
		Tv myTv1 = new Tv();
		Diswash mydis1 = new Diswash();
		
		myTv1.onOff=true;
		mydis1.onOff=false;
		myTv1.print();
		mydis1.print();
		
	}

}
