package com.first.nine9;

public class Println {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Model mo=new Model();
         mo.foot="�к�";
         mo.setId("ddd");
         
         System.out.println(mo.foot);
         //toStringʵ��֮��Ͳ����ӡ��ַ
         System.out.println("mo����"+mo);
         
         
         mo.setId("jier");
         //�����ķ���ֵ
         String id=mo.getId();
         System.out.println(id);
         
         
         //����ӵ�и��ණ��(�����ͷ���)
         Man man=new Man();
         man.getId();
         //��̬������ָ������
         
         Model moDemo=new Man();
         System.out.println("moDemo:"+moDemo);
         System.out.println(moDemo.getId());
	}

}
