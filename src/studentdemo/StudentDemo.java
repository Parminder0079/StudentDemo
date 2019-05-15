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
public class StudentDemo 
{
private String name;//encapsulation
//constructor
public StudentDemo()
{
    
}
public StudentDemo(String n)
{
    this.name =n;
}
   
/**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
    
}
