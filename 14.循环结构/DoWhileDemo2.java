/*
	ѭ����������
		do..whileѭ�����ٻ�ִ��һ��ѭ����
		��for��whileѭ���������ж������Ƿ������Ȼ������Ƿ�ִ��ѭ����
		
	��ô������һ��ʹ������ѭ���أ�
		���ȿ���for����ο���while,�����do..while
*/
public class DoWhileDemo2{
	public static void main(String[] args){
		int x = 3;
		while(x<3){
			System.out.println("DM�����������·������Ӵ~");
			x++;
		}
		System.out.println("------------------------------");
		int y = 3;
		do{
			System.out.println("DM�����������·������Ӵ~");
			y++;
		}while(y<3);
	}
}