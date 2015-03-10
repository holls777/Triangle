package main;


public class Triangle extends GeometricObject{
	double side1;
	double side2;
	double side3;
	public Triangle(){
	double side1=1.0;
	double side2=1.0;
	double side3=1.0;
	}
    public Triangle(double side1, double side2, double side3){
    	side1=this.side1;
    	side2=this.side2;
    	side3=this.side3;
    }
    public double getPerimeter(){
    	double Perimeter= side1+side2+side3;
    	return Perimeter;
    }
    public double getArea(){
    	double Perimeter=getPerimeter();
    	double area=Math.sqrt((Perimeter/2)*((Perimeter/2)-side1)*((Perimeter/2)-side2)*((Perimeter/2)-side3));
    	return area;
    }
    public String toString() {
    	java.util.Date dateCreated= getDateCreated();
    	String color= getColor();
    	boolean filled= isFilled();
    	return "created on " + dateCreated + "\ncolor: " + color +
	      " and filled: " + filled;
	  }
    }

