/*
	��*�������һ����������
		*
		**
		***
		****
		*****
*/
public class ForForTest2{
	public static void main(String[] args){
		//5��5��
		for(int i = 0;i<5;i++){
			for(int j = 0;j<5;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		/*
			��1��1��
			��2��2��
			��3��3��
			��4��4��
			��5��5��
			*/
		for(int i = 0;i<5;i++){
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}