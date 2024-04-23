package com.kh.JavaAPIEx;

import java.util.StringTokenizer;

/*
StringTokenizer
Token : 동전 최소 단위 정보를 가진 물리적 가상적 물체



*/
public class StringTokenizerEx {
	
	public static void main(String[] args) {
		//기본으로 띄어쓰기 기준으로 구분		
		StringTokenizer token = new StringTokenizer("자바 는 즐 거워");
		//hasMoreTokens만약에 토큰글자 안에 글자가 조금이라도 들어있다면 true
		while(token.hasMoreTokens()) {
			//nextToken

			System.out.println(token.nextToken());
		}
		
		//구분자를 넣은 토크나이저를 볼 것
		StringTokenizer token2 = new StringTokenizer("오렌지,사과,포도", ",");
		
		while(token2.hasMoreTokens()) {
			
			System.out.println(token2.nextToken());
		}
		
		
		
	}
}
