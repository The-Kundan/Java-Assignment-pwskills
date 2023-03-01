package OOPs_Assignment;

import java.util.Scanner;
class Complex{
    int real;
    int img;
    public Complex(int r , int i){
        real =r;
        img=i;
    }
    public static Complex add (Complex a , Complex b){
        return new Complex((a.real+b.real),(a.img+ b.img));
    }
    public static Complex difference (Complex a , Complex b){
        return new Complex((a.real-b.real),(a.img-b.img));
    }
    public static Complex Product (Complex a , Complex b){
        return new Complex(((a.real*b.real)-(a.img*b.img)),((a.real*b.img)+(a.img*b.real)));
    }
    public void printComplex(){
        if (real == 0 && img!=0) {
            System.out.println(img+"i");
        } else if (img==0 && real!=0) {
            System.out.println(real);
        }
        else {
            System.out.println(real+"+"+img+"i");
        }
    }

}
public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter real part of complex num 1: ");
        int real1= sc.nextInt();
        System.out.println("Enter complex part of complex num 1 without iota sign : ");
        int complex1= sc.nextInt();
        System.out.println("Enter real part of complex num 2: ");
        int real2= sc.nextInt();
        System.out.println("Enter complex part of complex num 2 without iota sign : ");
        int complex2= sc.nextInt();
        Complex c = new Complex(real1,complex1);
        Complex d = new Complex(real2,complex2);
        Complex e = Complex.add(c,d);
        Complex f = Complex.difference(c,d);
        Complex g =Complex.Product(c,d);
        e.printComplex();
        f.printComplex();
        g.printComplex();
    }
}
