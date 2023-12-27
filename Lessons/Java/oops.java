class Pen{
    String color;
    String type;
    public void write(){
        System.out.println("writing something");
    }
    public void printColor(){
        System.out.println(this.color);
    }
}
class Student{
    String name;
    int age;
    // polymorphism -> function overloading
    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name, int age){
        System.out.println(name + " " + age);
    }
    constructor
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    copy constructor
    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }
}
// inheritance
class Shape{
    public void area(){
        System.out.println("prints area");
    }
}
class Triangle extends Shape{
    public void area(double b, double h){
        double area = (1/2) * (b) * (h);
        System.out.println(area);
    }
    //multilevel inheritance
class EquilateralTriangle extends Triangle{
    public void area(int b, int h){
        int area = (1/2)*b*h;
        System.out.println(area);
    }
}
// Hierarchical inheritance
class Circle extends Shape{
    public void area(double r){
        double area = (3.14) * (r) * (r);
        System.out.println(area);
    }
}
}
public class oops {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Jatin";
        s1.age = 18;
        s1.printInfo(s1.name, s1.age);
        Triangle t1 = new Triangle();
        
        t1.area(10, 50);
    }
}
