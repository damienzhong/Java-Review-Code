/*
	����
		A����ʵ�����ļ���
		B������
			a������ͬ�������ŵ���ͬ�İ���
			b��������з������
			
	������
		ѧ�������ӡ�ɾ�����޸ġ���ѯ
		��ʦ�����ӡ�ɾ�����޸ġ���ѯ
		��������
		
		����1�����չ��ܷ�
			com.damien.add
				AddStudent
				AddTeacher
			com.damien.del
				DelStudent
				DelTeacher
			com.damien.update
				UpdateStudent
				UpdateTeacher
			com.damien.find
				FindStudent
				FindTeacher
		����2������ģ���
			com.damien.student
				AddStudent
				DelStudent
				UpdateStudent
				FindStudent
			com.damien.teacher
				AddTeacher
				DelTeacher
				UpdateTeacher
				FindTeacher
		
	���Ķ��壺
		package ����;
		�༶����.�ֿ�����
	ע�����
		package�������ǳ���ĵ�һ����ִ�еĴ��롣
		package�����һ��Java�ļ���ֻ����һ����
		���û��package��Ĭ�ϱ�ʾ�ް���
	��������ı�������У�
		�ֶ�ʽ��
			a:javac���뵱ǰ���ļ�
			b:�ֶ���������Ӧ���ļ���
			c:��a�����class�ļ��ŵ�b����������ļ�����
			d:ͨ��java��������
				��Ҫ�������Ƶ�ִ�С�
				java com.damien.PackageDemo
		�Զ�ʽ��
			javac�����ʱ�����-d����
				java -d . PackageDemo.java
			ͨ��java�������У����ֶ�ʽһ����
*/
package com.damien;

public class PackageDemo{
	public static void main(String[] args){
		System.out.println("�����ӵ��Ա���װ�꣺DM�������� ��װ����������ӭ��ҽ���ѡ��");
	}
}