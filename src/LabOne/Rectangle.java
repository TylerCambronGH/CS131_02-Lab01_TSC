package LabOne;

public class Rectangle {
	int length, width;
	
	public Rectangle() {
		this.length = 1;
		this.width = 1;
	}
	
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	public int calculateArea() {
		return (this.length * this.width);
	}
	
	public int calculatePerimeter() {
		return ((this.length * 2) + (this.width * 2));
	}
	
	public int getWidth() {
		return this.width;
	}
	
	public int getLength() {
		return this.length;
	}
}