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
public class Student {
    int m1,m2,m3;
    Student(int a,int b,int c)
    {
        m1=a;
        m2=b;
        m3=c;
    }
    public void sum()
    {
        System.out.println("sum="+(m1+m2+m3));
    }
            public void perc()
            {
                System.out.println("percentage="+((m1+m2+m3)*100)/300);
            }
            public static void main(String args[])
            {
                
                Student s1=new Student(10,20,30);
                Student s2=new Student(40,50,60);
                s1.sum();
                s1.perc();
                s2.sum();
                s2.perc();
            }
}
