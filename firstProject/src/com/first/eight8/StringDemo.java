package com.first.eight8;

import java.util.Arrays;

import com.first.five5.Arr;
/**
 * String֪ʶ��
 * @author Administrator
 *
 */
public class StringDemo {

	public static void main(String[] args) {
		String str="Z��";
		System.out.println(str);
		       str="��"+"xixi";
		System.out.println(str);
		
		
		/**
		 * ������
		 */
		String aa="aa";
		String bb="aa";
		//�Աȶ����Ƿ����
		System.out.println(aa.equals(bb));
		//�Աȵ�ַ���Ƚϱ�����
        System.out.println(aa==bb);
        
        
        Arr a=new Arr();
        Arr b=new Arr();
        
        Arr c=a;
        
        System.out.println("ab��equals   "+a.equals(b));
        System.out.println("ac��equals   "+a.equals(c));
        System.out.println(a==b);
        System.out.println(a==c);
        
        System.out.println("***************************************"); 
       
        
        //             012345678
        String ttDemo="sfsdfdggg";
        System.out.println("���ȣ�"+ttDemo.length());
        String aaDemo="sdfsf";
        //���
        System.out.println(ttDemo+aaDemo);
        //�ж��ַ����Ƿ��У���û�о���-1
        System.out.println(ttDemo.indexOf("g"));
        //��ĳĳ�ַ��ָ�
        String[] sssss=ttDemo.split("d");
        //�����ӡ     java.util
        System.out.println(Arrays.toString(sssss));
        //�ض�
        System.out.println(ttDemo.substring(1, 3));
        System.out.println(ttDemo.substring(5));
        //API   
        jier(999);
	}
	
	
	public static void  jier(int ddd){
		System.out.println(ddd);
	}

}
