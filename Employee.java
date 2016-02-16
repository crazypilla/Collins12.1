/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package collins12.pkg1;

/**
 *
 * @author Harshita V
 */
public class Employee implements Comparable<Employee>{
    String name;
     int id;
    String city;
    Employee(String n,int id,String city){
    this.name=n;
    this.id=id;
    this.city=city;
    
    }

    public int compareTo(Employee o) {
         //To change body of generated methods, choose Tools | Templates.
          //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       int id1=this.id;
       Employee ob=(Employee)o;
       int id2=ob.id;
        if(id1 <id2)
              return -1  ;
        else if(id1 > id2)
            return 1;
        else 
            return ((this).name).compareTo((o).name);
    }

   

   
}
