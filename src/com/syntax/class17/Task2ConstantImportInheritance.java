package com.syntax.class17;
import static java.lang.Math.PI;
public class Task2ConstantImportInheritance {

double Area;
double diameter;
void Radius() {
	double Area=(PI/4*(diameter*diameter));
	System.out.println(Area);
}
static class Circle extends Task2ConstantImportInheritance{
	

	Circle(double diameter){
		this.diameter=diameter;
	}
}
}
