package com.first.ten10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Demo {

	public static void main(String[] args) throws ParseException {
		//����� 
		Random r=new Random();
		for (int i = 0; i < 2; i++) {
			System.out.println("�������"+r.nextInt(2));  //2(������2)
		}
		
		
		
		Date date=new Date();
		System.out.println("date:       "+date);
		//format
		SimpleDateFormat ms=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//����ת�ַ���
		String dateStr=ms.format(date);
		System.out.println("dateStr:   "+dateStr);
		//�ַ���ת����
		//Date dateDemo=ms.parse("2018-01-05");
		Date dateDemo=ms.parse("2018-01-05 14:15:15");
		System.out.println("���ڣ�  "+dateDemo);
		
		
		
		
	}

}
