class Tv{
	boolean onOff;
	Tv(){
		
	}
	void print() {
		System.out.println("TV 전원은 "+onOff + "있습니다");
	}
}
class Diswash{
	boolean onOff;
	Diswash(){
		
	}
	void print() {
		System.out.println("식기세척기 전원은 "+onOff + "있습니다");
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
