package com.kh.JavaAPIEx;

public class StringPre {

	public static void main(String[] args) {
		
		//substring메서드 사용해서 Today 추출
		String q1 = "Today is a beautiful day.";
		String a1 = q1.substring(0, 5);
		System.out.println(a1);
		
		//toUpperCase메서드 사용해서 모두 대문자로 변환
		String q2 = "Programming is fun and challenging";
		String a2 = q2.toUpperCase();
		System.out.println(a2);
		
		//toLowerCase메서드 사용해서 모두 대문자로 변환
		String q3 = "Learning new things is exciting";
		String a3 = q3.toLowerCase();
		System.out.println(a3);
		
		//split활용해서 문자열을 " "로 구분하기
		String q4 = "A good medicine tastes bitter";
		String[] a4 = q4.split(" ");//String자료형 담는 배열
		for(String i : a4) {
			System.out.println(i);
		}
		
		//replace 활용해서 more 을 less로 대체
		String q5 = "The more, the better";
		String a5 = q5.replace("more", "less");
		System.out.println(a5);
		
		//charAt 사용해서 6번째 글자 가져오기
		String q6 = "Walls have ears";
		char a6 = q6.charAt(6);
		System.out.println(a6);
		
		//substring 사용해서 his부터 끝까지 추출
		String q7 = "Every dog has his day";
		String a7 = q7.substring(14);
		System.out.println(a7);
	}

}
