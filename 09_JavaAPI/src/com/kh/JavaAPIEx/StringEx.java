package com.kh.JavaAPIEx;
/*
 
 String : 문자열을 나타내는 클래스
 문자열을 생성하고 조작하는데 사용
 
 String str = new String(); - String에서 이 방식은 더이상 사용하지 않음
 String str = "";
 
 문자를 자르고 변경할 때 사용하는 메서드
 substring = 내가 시작하고싶은 숫자부터 끝내고 싶은 숫자값을 지정해서 변경할 수 있음
 substring(시작숫자,끝숫자)
 substring(시작숫자)-시작숫자부터 끝나는숫자까지 모두 변경
 
 toUpperCase() : 원하는 문자열을 모두 대문자로 변환
 toLowerCase() : 원하는 문자열을 모두 소문자로 변환
 trim() : 원하는 문자열의 공백 (앞뒤만) 모두 제거해서 리턴
 split() : 문자열을 특정 구분자를 기준으로 분할하여 문자열 배열로 반환
 replace() : 문자열에서 특정 문자열을 새로운 문자열로 대체
 charAt() : 문자열에서 주어진 인덱스에 해당하는 문자를 반환
 
 */
public class StringEx {

	public static void main(String[] args) {
		
		//가비지 컬렉션
		//코딩에서 사용하고 사용되지 않는 것을 자동으로 없애는 것
		String phone = "010";
		phone += "1234-5678";
		System.out.println("phone");
		
		String str1 = "Hello World!";
		//1.substring()
		String sbstr = str1.substring(6);
		System.out.println(sbstr);
		String sbstr1 = str1.substring(6, 8);//6~7index
		System.out.println(sbstr1);
		//2.toUpperCase()
		String cap = str1.toUpperCase();
		System.out.println(cap);
		
		//3.toLowerCase()
		String small = str1.toLowerCase();
		System.out.println(small);
		
		//4.trim()
		String blnk = "     Hello     World!     ";
		String noBlnk = blnk.trim();
		System.out.println(noBlnk);
		
		//split splice replace match charAt
		
		//5. split 문자열을 특정 구분자를 기준으로 분할해서 문자열 배열로 반환
		String fruits = "apple,banana,grape";
		String[] farr = fruits.split(",");
		for(String f : farr) {
			System.out.println(f);
		}
		//6. replace 특정 문자열을 새로운 문자열로 대체
		String hw = "Hello, World!";
		String sw = hw.replace("Hello","Hi");
		System.out.println(sw);
		//7. charAt 문자열에서 주어진 인덱스에 해당하는 문자 하나를 반환
		String hw2 = "Hi, world!";
		char ch = hw2.charAt(8);
		System.out.println(ch);

	}

}
