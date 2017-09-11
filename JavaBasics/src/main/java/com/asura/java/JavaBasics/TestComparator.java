package com.asura.java.JavaBasics;

import java.util.Comparator;

/**
 *
 * @author Dheeraj Kumar Reddy Kotha <dheerajkumarreddykotha@gmail.com>
 */
public class TestComparator implements Comparator<Object>{

    @Override
    public int compare(Object o1, Object o2) {
        int ret = 0;
        Integer i1 = (Integer)o1;
        Integer i2 = (Integer)o2;
        
        if(i1 < i2)
            ret = -1;
        else if(i1 > i2)
            ret = 1;
        else
            ret = 0;
        return ret;
    }
    
}
