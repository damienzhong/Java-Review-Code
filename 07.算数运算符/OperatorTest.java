/*
	++,--����ϰ��
	
	��һ�⣺
	int a = 10;
	int b = 10;
	int c = 10;

	a = b++;
	c = --a;
	b = ++a;
	a = c--;
	��ֱ�����a,b,c��ֵ
	
	�ڶ��⣺
	int x = 4;
	int y = (x++)+(++x)+(x*10);
	��ֱ�����x,y��ֵ
*/
public class OperatorTest{
	public static void main(String[] args){
		int a = 10;
		int b = 10;
		int c = 10;
		
		a = b++;
		c = --a;
		b = ++a;
		a = c--;
		
		System.out.println("a:" + a);//9
		System.out.println("b:" + b);//10
		System.out.println("c:" + c);//8
		System.out.println("=========================");
		
		int x = 4;
		int y = (x++)+(++x)+(x*10);
				 //4	+ 6    +  60
		
		System.out.println("x:" + x);
		System.out.println("y:" + y);
	}
}