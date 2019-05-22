/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdemo;

/**
 *
 * @author Parminder Singh
 */
public class StudentTester 
{
public static void main(String[] args) 
{
       StudentDemo s1 = new StudentDemo();
       s1.setName("sivagama");
       s1.setSid(123);
       //System.out.println(s1.getName());
     StudentDemo s2 = new StudentDemo("Daniel",222);
StudentDemo s3 = new StudentDemo("Arsh smdnsdmf jknfg",333 );
StudentDemo[] list = new StudentDemo[3];//Array of objects
list[0]=s1;
list[1]=s2;
list[2]=s3;
for(int i=0;i<list.length;i++)
{
System.out.println(list[i].getName() + list[i].getSid());

}
    

    
}
