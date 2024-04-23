package com.kh.JavaAPIEx;
/*
Object : 모든 자바 클래스의 최상위 클래스
모든 클래스가 기본으로 상속받는 클래스

Object 클래스는 기본으로 사용한다는 개념이 있기 때문에
new Object를 사용하진않음

*/
public class ObjectEx {
	
	public boolean equals(Object obj) {
		return true;
	}
	
	@Override
	public String toString() {
		return "Object에서부터 내려오는 메서드입니다";
	}

	public static void main(String[] args) {
		//Object는 기본이기 때문에 굳이 new사용해서 공간생성 x
		

	}

}
