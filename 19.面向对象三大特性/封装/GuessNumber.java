/*
	������С��Ϸ��������1-100֮�䣩
	
	������
		A���������һ��������������µģ�
		B������¼�����ݡ�����µģ�
		C������µĺͱ��µĽ��бȽ�
			a������
			b��С��
			c��������
		D��������βµĻ��ᣬ���оͽ���
			
*/
import java.util.Scanner;
public class GuessNumber{
	public static void main(String[] args){
		//�������һ��������������µģ�
		int number = (int)(Math.random()*100)+1;
		
		//������βµĻ��ᣬ���оͽ���
		while(true){
			//����¼�����ݡ�����µģ�
			Scanner sc = new Scanner(System.in);
			System.out.println("��������Ҫ�µ����ݣ�1-100����");
			int guessNumber = sc.nextInt();
			
			//����µĺͱ��µĽ��бȽ�
			if(guessNumber > number){
				System.out.println("��µ�����"+guessNumber+"����");
			}else if(guessNumber < number){
				System.out.println("��µ�����"+guessNumber+"С��");
			}else{
				System.out.println("��ϲ�㣬�����ˣ��������ؼң�����");
				break;
			}
		}
	}
}
