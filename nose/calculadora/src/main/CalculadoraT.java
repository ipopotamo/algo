package main;


import org.junit.Test;
import Test.calcu;

import static org.junit.Assert.assertEquals;

public class CalculadoraT {

CalculadoraT cal = new CalculadoraT();

@Test
public void sumarTest(){
    assertEquals(cal.sumar(2,3),5);
}

}
