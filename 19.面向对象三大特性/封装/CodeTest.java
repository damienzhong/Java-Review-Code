class Code{
	static {
		System.out.println("Code ��̬�����");
	}
	
	{
		System.out.println("Code ��������");
	}
	
	public Code(){
		System.out.println("Code ���췽��");
	}
}

public class CodeTest{
	static {
		System.out.println("code test ��̬�����");
	}
	
	public static void main(String[] args){
		System.out.println("main����");
		
		Code c1 = new Code();
		Code c2 = new Code();
	}
}