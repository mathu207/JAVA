/*Add complex numbers
 */
package javaapplication6;

class Complex
{
    int real,img;

    public Complex(int real1,int img1) {
        real=real1;
        img=img1;
    }
    
    
}


public class JavaApplication6 {

 
    public static void main(String[] args) {
        Complex c1=new Complex(5, 6);
        Complex c2=new Complex(5, 6);
        int real=c1.real+c2.real;
        int img=c1.img+c2.img;
        System.out.println(real+" +i"+img);
       
        
    }
    
}
