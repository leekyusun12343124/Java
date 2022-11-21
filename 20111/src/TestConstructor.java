class Constructor {
	
	int number1, number2;
	double value;
	String stream;
	
	Constructor(){
		
	}
	
	Constructor(int a, int b){
		number1 = a;
		number2 = b;
	}
	
    Constructor(double a){
		value = a;
	}
    
    Constructor(String s){
		stream = s;
	}
    
    Constructor(int a, int b, double c, String d){
		number1 = a;
		number2 = b;
		value = c;
		stream = d;
	}
    
    void showPrint() {
    	System.out.println("number1 = "+number1+ ", number2 = "+number2+", value = "+value+",stream ="+stream);
    }
    
}
public class TestConstructor {

	public static void main(String[] args) {
		System.out.println("obj1 인스턴스");
		Constructor obj1=new Constructor();
		obj1.showPrint();
		
		System.out.println("obj2 인스턴스");
		Constructor obj2=new Constructor(33,44);
		obj1.showPrint();

		System.out.println("obj3 인스턴스");
		Constructor obj3=new Constructor(33,3);
		obj1.showPrint();

		System.out.println("obj4 인스턴스");
		Constructor obj4=new Constructor("생성자 오버로딩");
		obj1.showPrint();

		System.out.println("obj5 인스턴스");
		Constructor obj5=new Constructor(10, 20, 30.3,"생성자 오버로딩 연습");
		obj1.showPrint();


	}

}
