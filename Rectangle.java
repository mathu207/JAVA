/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21.mca.pkg032;

/**
 *
 * @author sjcet
 */
public class Rectangle {
    int l,b;
    Rectangle(int a,int c)
    {
       l=a;
       b=c;
    }
     public void area()
     {
         System.out.println("area="+(l*b));
     }
     public void perimeter()
     {
         System.out.println("perimeter="+(2*(l+b)));
     }
     public static void main(String args[])
     {
         Rectangle abc=new Rectangle(3,9);
         abc.area();
         abc.perimeter();
     }
    
    
}
