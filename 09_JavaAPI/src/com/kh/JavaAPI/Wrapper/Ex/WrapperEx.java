package com.kh.JavaAPI.Wrapper.Ex;
/*
Wrapper : 감싸다
기본데이터 타입 : primitive types
기본 자료형 타입을 객체로 감싸서 사용할 수 있는 클래스
기본으로 제공해주는 int, double, float, char, short, long, boolean, byte
ArrayList 부를 때 사용 많이함

Byte
Short
Integer
Long
Float
Double
Character
Boolean

 
 
 
*/
public class WrapperEx {
	
	public static void main(String[] args) {
		//Byte
		Byte bBnum = 10;
		
		byte bnum = bBnum.byteValue();
		System.out.println("바이트 값 : " + bBnum);
		System.out.println("기본바이트 값 : " + bnum);
		
		//Short
		Short sSnum = 20;
		short snum = sSnum.shortValue();
		System.out.println("쇼트값 : " + sSnum);
		System.out.println("기본쇼트값 : " + snum);
		
		//Integer
		Integer iInum = 30;
		//Integer - int 변경
		int inum = iInum.intValue();
		System.out.println("iInum : " + iInum);
		System.out.println("inum : " + inum);
		
		//Long
		Long lLnum  = 40L;
		//Long - long 변경
		long lnum = lLnum.longValue();
		System.out.println("lLnum : " + lLnum);
		System.out.println("lnum : " + lnum);
		
		//Float
		Float fFnum = 50.5f;
		//Float - float 변경
		float fnum = fFnum.floatValue();
		System.out.println("fFnum : " + fFnum);
		System.out.println("fnum : " + fnum);
		
		//Double
		Double dDnum = 60.6;
		//Double - double 변경
		double dnum = dDnum.doubleValue();
		System.out.println("dDnum : " + dDnum);
		System.out.println("dnum : " + dnum);
		
		//Chararcter
		Character cCha = 'A';
		//Character - char
		char ccha =cCha.charValue();
		System.out.println("cCha : " + cCha);
		System.out.println("ccha : " + ccha);
		
		//Boolean
		Boolean bBool = true;
		//Boolean - boolean
		boolean bbool = bBool.booleanValue();
		System.out.println("bBool : " + bBool);
		System.out.println("bbool : " + bbool);
		
	}

}
