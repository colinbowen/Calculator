

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CalculatorTest.
 *
 * @colinbowen
 * @version (a version number or a date)
 */
public class CalculatorTest
{
    private Calculator c1;

    /**
     * Default constructor for test class CalculatorTest
     */
    public CalculatorTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        c1 = new Calculator();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void add()
    {
        c1.number(20);
        c1.add();
        c1.number(5);
        c1.equate();
        assertEquals(Double.toString(25.0), c1.currentDisplay());
    }
    
    @Test
    public void negNegAdd()
    {
        c1.number(-20);
        c1.add();
        c1.number(-5);
        c1.equate();
        assertEquals(Double.toString(-25.0), c1.currentDisplay());
    }
    
    @Test
    public void negPosAdd()
    {
        c1.number(-20);
        c1.add();
        c1.number(5);
        c1.equate();
        assertEquals(Double.toString(-15.0), c1.currentDisplay());
    }
    
    @Test
    public void decimalAdd()
    {
        c1.number(2);
        c1.dot();
        c1.number(2);
        c1.add();
        c1.number(2);
        c1.dot();
        c1.number(4);
        c1.equate();
        assertEquals(4.6, c1.getCurrentValue(), 0);
        //assertEquals(Double.toString(7.7777), c1.currentDisplay());
    }
    
    @Test
    public void minus()
    {
        c1.number(20);
        c1.subtract();
        c1.number(5);
        c1.equate();
        assertEquals(Double.toString(15.0), c1.currentDisplay());
    }
    
    @Test
    public void negNegMinus()
    {
        c1.number(-20);
        c1.subtract();
        c1.number(-5);
        c1.equate();
        assertEquals(Double.toString(-15.0), c1.currentDisplay());
    }
    
    @Test
    public void negPosMinus()
    {
        c1.number(-20);
        c1.subtract();
        c1.number(5);
        c1.equate();
        assertEquals(Double.toString(-25.0), c1.currentDisplay());
    }
    
    @Test
    public void decimalMinus()
    {
        c1.number(20);
        c1.dot();
        c1.number(2);
        c1.subtract();
        c1.number(0);
        c1.dot();
        c1.number(5);
        c1.equate();
        assertEquals(Double.toString(19.7), c1.currentDisplay());
    }
    
    @Test
    public void multiply()
    {
        c1.number(20);
        c1.multiply();
        c1.number(5);
        c1.equate();
        assertEquals(Double.toString(100.0), c1.currentDisplay());
    }
    
    @Test
    public void negNegmultiply()
    {
        c1.number(-20);
        c1.multiply();
        c1.number(-5);
        c1.equate();
        assertEquals(Double.toString(100.0), c1.currentDisplay());
    }
    
    @Test
    public void negPosmultiply()
    {
        c1.number(-20);
        c1.multiply();
        c1.number(5);
        c1.equate();
        assertEquals(Double.toString(-100.0), c1.currentDisplay());
    }
    
    @Test
    public void decimalmultiply()
    {
        c1.number(0);
        c1.dot();
        c1.number(25);
        c1.multiply();
        c1.number(0);
        c1.dot();
        c1.number(4);
        c1.equate();
        assertEquals(Double.toString(1), c1.currentDisplay());
    }
    
    @Test
    public void divide()
    {
        c1.number(20);
        c1.divide();
        c1.number(5);
        c1.equate();
        assertEquals(Double.toString(4.0), c1.currentDisplay());
    }
    
    @Test
    public void negNegdivide()
    {
        c1.number(-20);
        c1.divide();
        c1.number(-5);
        c1.equate();
        assertEquals(Double.toString(4.0), c1.currentDisplay());
    }
    
    @Test
    public void negPosDivide()
    {
        c1.number(-20);
        c1.divide();
        c1.number(5);
        c1.equate();
        assertEquals(Double.toString(-4.0), c1.currentDisplay());
    }
    
    @Test
    public void decimalDivide()
    {
        c1.number(0);
        c1.dot();
        c1.number(4);
        c1.divide();
        c1.number(0);
        c1.dot();
        c1.number(2);
        c1.equate();
        assertEquals(Double.toString(2.0), c1.currentDisplay());
    }
    
    @Test
    public void sqrt()
    {
        c1.number(25);
        c1.sqrt();
        assertEquals(Double.toString(5.0), c1.currentDisplay());
    }
    
    @Test
    public void zerosqrt()
    {
        c1.number(0);
        c1.sqrt();
        assertEquals(Double.toString(0.0), c1.currentDisplay());
    }

    @Test
    public void delete()
    {
        c1.number(12345);
        c1.delete();
        assertEquals(Double.toString(1234.0), c1.currentDisplay());
    }
    
    @Test
    public void memStore()
    {
        c1.number(12345);
        c1.memStore();
        assertEquals(Double.toString(12345), c1.currentDisplay());
    }
    
    @Test
    public void memRecall()
    {
        c1.number(12345);
        c1.memStore();
        c1.memRecall();
        assertEquals(12345, c1.getRecall(), 0);
    }
    
    @Test
    public void memClear()
    {
        c1.number(12345);
        c1.memStore();
        assertEquals(Double.toString(12345), c1.currentDisplay());
        c1.memClear();
        assertEquals(0, c1.getRecall(), 0);
    }
}






