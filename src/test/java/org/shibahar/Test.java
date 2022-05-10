package org.shibahar;

import org.testng.Assert;

import java.text.SimpleDateFormat;
import java.util.*;

public class Test {

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        String monthName=new SimpleDateFormat("MMM").format(cal.getTime());
        System.out.println(monthName);

        java.util.Date date= new Date();
        cal.setTime(date);
        int month = cal.get(Calendar.MONTH);
        int monthNumber=month+1;
        System.out.println(monthNumber);

        int startPoint=monthNumber-6;
        int endPoint=monthNumber;

        HashMap<Integer,String> hm= new HashMap<Integer,String>();

        hm.put(1,"Jan");
        hm.put(2,"Feb");
        hm.put(3,"Mar");
        hm.put(4,"Apr");
        hm.put(5,"May");
        hm.put(6,"Jun");
        hm.put(7,"Jul");
        hm.put(8,"Aug");
        hm.put(9,"Sep");
        hm.put(10,"Oct");
        hm.put(11,"Nov");
        hm.put(12,"Dec");


        for (int i=startPoint;i<=endPoint;i++)
        {

            System.out.println(hm.get(i));
            hm.remove(i);
        }
        System.out.println("After removing"+hm);

        // Getting Collection of values from HashMap
        Collection<String> values = hm.values();

        // Creating an ArrayList of values

        ArrayList<String> invalidMonths= new ArrayList<>(values);
        System.out.println(invalidMonths);

        ArrayList<String> validMonths= new ArrayList<>(values);
        validMonths.add("Jun");
        validMonths.add("Jul");
        validMonths.add("Jul");
        validMonths.add("Aug");

        Assert.assertTrue(!invalidMonths.contains(validMonths));

        //Have a map key integer value months
        //get the current month number
        //substract with 6 you will get the starting and ending point
        //start point (10-6) ending point  current month number
        //array list
        //{for(int i=start;i<endpoint;i++}
        //{
         //   delete from map
        //}

    }
}
