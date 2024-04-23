package com.kh.JavaAPI.Date.Ex;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePre {

	public static void main(String[] args) {

		//SimpleDateFormat 활용해서 날짜 만들기
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//1.yyyy-MM-dd
		String dstr = sdf.format(new Date());
		System.out.println("날짜 : " + dstr);
		
		//2.HH:mm:ss
		SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");
		String dstr2 = sdf2.format(new Date());
		System.out.println("날짜 : " + dstr2);
		
		//3.yyyy-MM-dd-HH:mm:ss
		System.out.println(dstr + " " + dstr2);
		
		//4. 날짜 E 사용해서 요일나타내기
		SimpleDateFormat sdf4 = new SimpleDateFormat("E");
		String dstr4 = sdf4.format(new Date());
		System.out.println("요일 : " + dstr4);
	}

}
