/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package collins12.pkg1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author Harshita V
 */
public class Collins121 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
         FileReader file=new FileReader("F:/harshi.txt");
          BufferedReader bufRead = new BufferedReader(file);
          String myLine = null;
          TreeMap<String,Employee> map = new TreeMap<>();
          //SortedSet <Employee> ss=new HashSetImpl();
          ArrayList<Employee> al=new ArrayList<>();
         
          while((myLine=bufRead.readLine()) != null)
          {
          
          String[] strarr=myLine.split(" ");
          Employee emp=new Employee(strarr[0],Integer.parseInt(strarr[1]),strarr[2]);
          map.put(emp.name,emp);
          al.add(emp);
          
          }
          TreeMap<Employee,String> map2=new TreeMap<>();
         for(Map.Entry<String,Employee> entry: map.entrySet()){
         map2.put(entry.getValue(),entry.getKey());
         System.out.println(entry.getKey()+"   "+entry.getValue().id);
         
         }
        Collections.sort(al);
        for(int i=0;i<al.size();i++)
           System.out.println(al.get(i).name+" "+al.get(i).city+" "+al.get(i).id);
    /**
     *
     * @param map
     * @return
     */
      
       

     
    }


    
}
