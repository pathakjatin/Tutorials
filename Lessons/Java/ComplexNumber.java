// import java.util.Scanner;
public class ComplexNumber{
    public static void main(String args[]) {
        Complex c1 = new Complex(40,20);
        Complex c2 = new Complex(10,30);
        Complex c3 = new Complex();
        c3.complexAdd(c1,c2);
    }
}
class Complex{
    int real,img;
    Complex(){
        real=0;
        img=0;
    }
    Complex(int r, int i){
        real=r;
        img=i;
    }
    void complexAdd(Complex m1, Complex m2){
        real = m1.real + m2.real;
        img = m1.img + m2.img;
        System.out.println(real + "+i" +img); 
    }
}
