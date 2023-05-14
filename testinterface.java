import java.lang.*;
interface shape{
public void draw();
public double getarea();
}
class circle implements shape{
double radius;
public circle(double r){
this.radius=r;
}
public double getarea(){
return Math.PI*radius*radius;
}
public void draw(){
System.out.println("Drawing circlel");
}
}
class rectangle implements shape{
double width;
double height;
public rectangle(double w,double h)
{
this.width=w;
this.height=h;
}
public double getarea(){
return width*height;
}
public  void draw(){
System.out.println("Drawing rectangle");
}
}
public class testinterface{
public static void main(String args[]){
shape s=new circle(10);
s.draw();
System.out.println("area="+s.getarea());
shape s2=new rectangle(20,30);
s2.draw();
System.out.println("area="+s2.getarea());
}
}