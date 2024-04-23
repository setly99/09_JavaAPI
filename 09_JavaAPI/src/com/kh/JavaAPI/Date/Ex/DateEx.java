package com.kh.JavaAPI.Date.Ex;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/*

Date : 특정 날짜의 시간을 나타내는 클래스
Calendar : 날짜와 시간을 조작하는데 사용되는 추상클래스
GregorianCalendar : 그레고리력을 사용해서 날짜와 시간을 계산
SimpleDateFormat : 날짜와 시간을 형식으로 보여주고 그것을 출력

LocalDate
KST = Korean Standard Time
한국 일반적인 시간


*/
public class DateEx {
	
	public static void main(String[] args) {
		//1.Date
		Date today = new Date();
		System.out.println(today);
		//2.Calendar
		Calendar cld = Calendar.getInstance();
			//연 월 일
		int yr = cld.get(Calendar.YEAR);
		int mo = cld.get(Calendar.MONTH);//0월부터 가져옴
		int dy = cld.get(Calendar.DAY_OF_MONTH);
		System.out.println("현재 날짜 : " + yr + "/" + (mo+1) + "/" + dy);
		
		/*
		 그레고리안 달력은 1년 1월 1일 무조건 월요일로 정의돼있음
		 2024, 4, 23 : 자동으로 2024년 5월 23일로 변경됨
		 2024.5.23 - 목요일
		 
		 * */
		//3.
		GregorianCalendar grgrn1 = new GregorianCalendar();
		GregorianCalendar grgrn2 = new GregorianCalendar(2024, 4, 23);
		int date2 = grgrn2.get(Calendar.DAY_OF_WEEK);
		System.out.println("날짜 : " + date2);
		
		//4.
		/*
		 y M(달) d H(0~23시 ) h(am pm) m(분) s
		 요일 : E 국제표준화기구 약속 
		 */
		SimpleDateFormat smpdate = new SimpleDateFormat("yyyy-MM-dd");
		String dateStr = smpdate.format(new Date());
		System.out.println("날짜형식 지정해서 표기하기 :" + dateStr);
		
	}

}
