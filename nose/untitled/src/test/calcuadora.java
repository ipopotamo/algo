package test;

import org.junit.Test;
import main.calcu;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class calcuadora {

    calcu cals = new calcu();

    @Test
    public void sumarTest(){
        assertNotEquals(cals.sumar(5,3),5);
    }

    @Test
    public void restarTest(){
        assertEquals(cals.resstar(1,1),0);
    }
    @Test
    public void divTest(){
        assertEquals(cals.div(3,3),1);
    }
    @Test
    public void porTest(){
        assertEquals(cals.por(2,3),6);
    }
    @Test
    public void cuaTest(){
        assertEquals(cals.juan(1,2,1),-1,1);
    }




}

