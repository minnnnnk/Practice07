package com.javaex.ex01;

public class Ractangle extends Shape{
	//필드
	private int width;
	private int height;
	//생성자
	public Ractangle(String fillColor, int width, int height){
		super(fillColor);
		this.width=width;
		this.height=height;
	}
	// 메소드 gs
	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	// 메소드 일반
	public void draw(){
		System.out.println("[사각형]#면색:" +super.fillColor+ " "
				+ " #가로:" + width 
				+" #세로:" + height + "그렸습니다.");                                                                        
	}
	public void width () {
		System.out.println( "sr1의 가로는 "+width+" 입니다");
	}
	
		
	

}


