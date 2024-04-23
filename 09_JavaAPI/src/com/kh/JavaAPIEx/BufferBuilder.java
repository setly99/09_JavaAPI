package com.kh.JavaAPIEx;
/*
 String : 변할 수 없음
 문자나 문자열을 사용할 때 사용 후 변수명에 다른 값을 넣어주는 것이지
 수정하거나 삭제하는 것은 힘듬
 
 메모리 크기가 변할 수 있는 환경 수정하고 삭제를 해도 문제가 없음
 StringBuffer : 여러 쓰레드에서 동시에 사용되어도 안전하게 작업을 처리(동기화)
 StringBuilder : 한 쓰레드에서 사용하는 것이 효율(비동기, 추천)
 
 Thread : 컴퓨터내 실행되는 독립적 실행흐름
 동기 : 요청과 결과가 동시에
 비동기 : 
 */
public class BufferBuilder {
	public static void main(String[] args) {
		//1.StringBuffer
		StringBuffer buffer = new StringBuffer();
		buffer.append("Hello");
		buffer.append(" World");
		System.out.println(buffer.toString());
		
		StringBuilder builder = new StringBuilder();
		builder.append("Hello");
		builder.append(" World");
		System.out.println(builder.toString());
	}
	
}
