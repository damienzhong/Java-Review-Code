/*
if�������ָ�ʽ��
	if(��ϵ���ʽ1) {
		     �����1;
	}else  if (��ϵ���ʽ2) {
		     �����2;
	}
    ��
	else {
		     �����n+1;
	}
	
	ִ�����̣�
		�����жϹ�ϵ���ʽ1��������true����false
		�����true��ִ�������1
		�����false�ͼ����жϹ�ϵ���ʽ2��������true����false
		�����true��ִ�������2
		�����false�ͼ����жϹ�ϵ���ʽ����������true����false
		��
		���û���κι�ϵ���ʽΪtrue����ִ�������n+1��
*/
import java.util.Scanner;

public class IfDemo4{
	public static void main(String[] args){
		//���󣺼���¼��һ���ɼ����жϲ�����ɼ��ĵȼ���
		/*
			90-100 ����
			80-90  ��
			70-80  ��
			60-70  ����
			0-60   ������
		*/
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		
		//¼������
		System.out.println("���������Ŀ��Գɼ���");
		int score = sc.nextInt();
		if(score>100 || score<0){
			System.out.println("������ĳɼ�����");
		}else if(score>=90 && score<=100){
			System.out.println("����");
		}else if(score>=80 && score<=90){
			System.out.println("��");
		}else if(score>=70 && score<=80){
			System.out.println("��");
		}else if(score>=60 && score<=70){
			System.out.println("����");
		}else if(score>=0 && score<=60){
			System.out.println("������");
		}
	}
}