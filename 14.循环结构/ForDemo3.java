/*
	��Ŀ�����1-10֮������֮��
		0+1+2+3+4+5+6+7+8+9+10
	������
		0+1=1
			1+2=3
				3+3=6
					6+4=10
						10+5=15
							����������
		
*/
public class ForDemo3{
	public static void main(String[] args){
		System.out.println(0+1+2+3+4+5+6+7+8+9+10);
		
		int sum = 0;
		
		for(int x=1;x <= 10;x++){
			//sum = sum + x;
			sum += x;
		}
		
	}
}