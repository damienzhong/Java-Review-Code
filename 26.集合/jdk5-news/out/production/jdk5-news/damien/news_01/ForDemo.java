// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ForDemo.java

package damien.news_01;

import java.io.PrintStream;
import java.util.*;

public class ForDemo
{

	public ForDemo()
	{
	}

	public static void main(String args[])
	{
		String arr[] = {
			"������", "��", "�Ա�", "��װ��", ":DM��������"
		};
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i]);

		System.out.println();
		System.out.println("----------------------");
		String args1[] = arr;
		int j = args1.length;
		for (int k = 0; k < j; k++)
		{
			String s = args1[k];
			System.out.print(s);
		}

		System.out.println();
		System.out.println("----------------------");
		ArrayList array = new ArrayList();
		array.add("������");
		array.add("��");
		array.add("�Ա�");
		array.add("��װ��");
		array.add(":DM��������");
		String s;
		for (Iterator iterator = array.iterator(); iterator.hasNext(); System.out.print(s))
			s = (String)iterator.next();

		System.out.println();
		System.out.println("----------------------");
		List list = null;
		String s;
		for (Iterator iterator1 = list.iterator(); iterator1.hasNext(); System.out.println(s))
			s = (String)iterator1.next();

	}
}
