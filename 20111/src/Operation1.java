class Square1{
	int width;
	int length;
	int heigth;
	int area;
	int volume;
	
	Square1(){
		
	}
	
	void showPrint() {
		area = width * length;
		volume = width * length * heigth ;
		System.out.println("사각형 면적:"+area+"cm2");
		System.out.println("사각형 부피:"+volume+"cm3");
		
	}
    void countArea() {
		
	}

    void countVolume() {
	
    }

}

public class Operation1 {

	public static void main(String[] args) {
	Square1 squ1 = new Square1();
	Square1 squ2 = new Square1();
	Square1 squ3 = new Square1();
	
	squ1.width = 40;
	squ1.length = 40;
	squ1.heigth = 40;
	
	squ2.width = 105;
	squ2.length = 77;
	squ2.heigth = 12;
	
	squ3.width = 92;
	squ3.length = 92;
	squ3.heigth = 48;
	
	squ1 .showPrint();
	squ2 .showPrint();
	squ3 .showPrint();
	}

}
