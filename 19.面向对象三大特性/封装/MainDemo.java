/**
	 main�����ĸ�ʽ���⣺
		public static void main(String[] args){}
		
		public:�����ģ�����Ȩ�������ġ�����main�����Ǳ�jvm���ã�����Ȩ��Ҫ����
		static:��̬�ģ�����Ҫ��������ͨ�������Ϳ���ʹ�á�����jvm����
		void:�����ķ���ֵ�Ƿ��ظ������ߵģ���main�����Ǳ�jvm���ã��������ݸ�jvmû������
		main:��һ�������ķ�����ڣ����кܶ����Զ�����main������Ϊ��ڵ�
		String[] args:����һ���ַ������顣
					��ʲô�ã���ô��ֵ��
					�������������Ϊ�˽��ռ���¼������ݡ�����Ϊjdk5֮ǰû��Scanner��
					��ʽ��
						java ���� hello world java
*/
public class MainDemo{
	public static void main(String[] args){
		//System.out.println(args);//[Ljava.lang.String;@6d06d69c
		//System.out.println(args.length);//0
		//System.out.println(args[0]);// java.lang.ArrayIndexOutOfBoundsException: 0
		
		//�������ݺ���������
		System.out.println(args);
		System.out.println(args.length);
		System.out.println(args[0]);
		
		for(int x=0;x<args.length;x++){
			System.out.println(args[x]);
		}
	}
}