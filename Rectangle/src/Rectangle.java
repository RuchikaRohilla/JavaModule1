
public class Rectangle {
private int length;
private int breadth;
private int Area;
private int parameter;
public int getParameter() {
	return parameter;
}
public void setParameter(int parameter) {
	this.parameter = parameter;
}
public Rectangle (){
	length=0;
	breadth=0;
}
public Rectangle(int l,int b){
	length=l;
	breadth=b;
}
public int getLength() {
	return length;
}
public void setLength(int length) {
	this.length = length;
}
public int getBreadth() {
	return breadth;
}
public void setBreadth(int breadth) {
	this.breadth = breadth;
}
public int getArea() {
	return Area;
}
public void setArea(int area) {
	Area = area;
}

}
