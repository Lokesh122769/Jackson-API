package com.SpringRest.JacksonApiRest2;

import java.io.File;
import java.io.IOException;

import com.SpringRest.JacksonApiRest2.Model.Employee;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );
        
        
        ObjectMapper om=new ObjectMapper();
        
      //  Employee emp=new Employee(24,"Alex","Java Developer",35000);
        
        //System.out.println(emp);
        
       //System.out.println( om.writeValueAsString(emp));
       
       Employee employee = om.readValue(new File("JsonData/sample.json"), Employee.class);
       
       System.out.println(employee);
        
    }
}
