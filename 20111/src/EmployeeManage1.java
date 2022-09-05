class Employee1{
	String name;
	int id;
	String publicNO;
	long salary;
	String bank;
	String bankNo;
	
	Employee1(){
		
	}
	void showPrint() {
		System.out.println("사 원 명:"+name);
		System.out.println("사원 ID:"+id);
		System.out.println("주민번호:"+publicNO);
		System.out.println("월급 여액:"+salary+"만원");
		System.out.println("은 행 명:"+bank+"은행");
		System.out.println("계좌번호:"+bankNo);
		System.out.println("=====================");
	}
	long countSalary() {
		return 30000 -(id * 4);
	}
}
public class EmployeeManage1 {

	public static void main(String[] args) {
	Employee1 mem1 = new Employee1();
	Employee1 mem2 = new Employee1();	
	Employee1 mem3 = new Employee1();
	
	mem1.name = "김사원";
	mem1.id = 1004;
	mem1.publicNO ="000101-2123456";
	mem1.salary = mem1.countSalary();
	mem1.bank = "인천";
	mem1.bankNo = "010-001-236987";
	
	mem2.name = "이사원";
	mem2.id = 3417;
	mem2.publicNO ="040817-2156987";
	mem2.salary = mem1.countSalary();
	mem2.bank = "정보";
	mem2.bankNo = "789654-01-001";
	
	mem3.name = "한점표";
	mem3.id = 4012;
	mem3.publicNO ="050311-2456789";
	mem3.salary = mem1.countSalary();
	mem3.bank = "과학";
	mem3.bankNo = "2563-114-258-3214";
	
	mem1 .showPrint();
	mem2 .showPrint();
	mem3 .showPrint();
	}

}
