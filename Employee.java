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
public class Employee {
    int e_id;
    float salary;
    String e_name;
    Employee(int a,float b,String s)
    {
        e_id=a;
        salary=b;
        e_name=s;
    }
    public void disc()
    {
        System.out.println("Employee ID="+e_id);
        System.out.println("Employee salary="+salary);
        System.out.println("Employee name="+e_name);
    }
    public void salary()
    {
        System.out.println("total salary="+(salary*100/20));
    }
    public static void main(String ags[])
    {
        Employee e1=new Employee(102,2000,"mathu");
        e1.salary();
        e1.disc();
        Employee e2=new Employee(103,3000,"aswin");
        e2.salary();
        e2.disc();
        
    }
}
