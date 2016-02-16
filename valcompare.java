/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package collins12.pkg1;

import java.util.Comparator;

import java.util.Map;


/**
 *
 * @author Harshita V
 */
public class valcompare implements Comparator <Map.Entry<Employee,String>>{

   

    public int compare(Map.Entry<Employee,String> o1, Map.Entry<Employee,String> o2) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       int id1=((Employee)o1.getKey()).id;
       int id2=((Employee)o2.getKey()).id;
        if(id1 <id2)
              return -1  ;
        else if(id1 > id2)
            return 1;
        else 
            return (((Employee)o1).name).compareTo(((Employee)o2).name);
    
    }
}
   //To change body of generated methods, choose Tools | Templates.

  
    

