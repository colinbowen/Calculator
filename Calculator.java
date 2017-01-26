import java.util.*;
import java.text.Format;

public class Calculator
{
    private double currentValue, previousValue, memStore;
    private String operation;
    private boolean afterD;
    private int value;

    /**
     * Initialise the calculator.
     */
    public Calculator()
    {
        double currentValue = 0;
        double previousValue = 0;
        afterD = false;
        value = 1;
    }

    /**
     * Reset the calculator.
     */
    public void reset()
    {
        currentValue = 0;
        previousValue = 0;
        operation = null;
        afterD = false;
        memStore = 0;
        value = 1;
    }

    /**
     * Division operator is pressed.
     */
    public void divide()
    {
        operation = "divide";
        previousValue = currentValue;
        currentValue = 0;
        afterD = false;
        value = 1;
    }

    /**
     * Square Root the value currently displayed in the calculator.
     */
    public void sqrt()
    {
        currentValue = Math.sqrt(currentValue);
    }

    /**
     * Multiply operator is pressed.
     */
    public void multiply()
    {
        operation = "multiply";
        previousValue = currentValue;
        currentValue = 0;
        afterD = false;
        value = 1;
    }

    /**
     * Subtract operator is pressed.
     */
    public void subtract()
    { 
        operation = "subtract";
        previousValue = currentValue;
        currentValue = 0;
        afterD = false;
        value = 1;
    }

    /**
     * Make the current value negative.
     */
    public void plusMinus()
    {
        currentValue = - currentValue;
    }

    /**
     * Insert a decimal place.
     */
    public void dot()
    {
        afterD = true;
        value = 0;
    }

    /**
     * Addition operator is pressed.
     */
    public void add()
    {
        operation = "add";
        previousValue = currentValue;
        currentValue = 0;
        afterD = false;
        value = 1;
    }

    /**
     * After inserting a value and selecting an operator then inserting a second
     * value will perform the selected operator on the two numbers.
     */
    public void equate()
    {
        if(operation == "add")
        {
            currentValue = previousValue + currentValue;
        }

        else if(operation == "subtract")
        {
            currentValue = previousValue - currentValue;
        }

        else if(operation == "multiply")
        {
            currentValue = previousValue * currentValue;
        }

        else if(operation == "divide")
        {
            if(currentValue == 0)
            {
                try
                { // monitor a block of code. 
                    currentValue = previousValue / 0;
                    System.out.println("Cannot divide by zero."); 
                } 
                catch (ArithmeticException e)
                { // catch divide-by-zero error 
                    System.out.println("Division by zero."); 
                }
            }
            else
            {
                currentValue = previousValue / currentValue;
            }
        }
    }

    public void number(int n)
    {
        double integer;
        integer = n;
        if(afterD == false)
        {
            if(currentValue >= 0)
            {
                currentValue = currentValue * 10 + n;
            }
            else
            {
                currentValue = currentValue * 10 -n;
            }
        }
        else
        {
            value++;
            currentValue = currentValue + integer / (Math.pow(10, value));
        }
    }

    /**
     * Delete the rightmost digit of the currently displayed value.
     */
    public void delete()
    {
        currentValue = Math.floor(currentValue/10);
    }

    /**
     * Store the currently displayed value into memory.
     */
    public void memStore()
    {
        memStore = currentValue;
    }

    /**
     * Recall the previously stored value.
     */
    public void memRecall()
    {
        currentValue = memStore;
    }

    /**
     * Clear the value that is stored in memory.
     */
    public void memClear()
    {
        memStore = 0;
    }

    /**
     * Display the number.
     */
    public String currentDisplay()
    {
        return Double.toString(currentValue);
    }

    
    
    
    
    public double getCurrentValue()
    {
        return currentValue;
    }
    
    public double getRecall()
    {
        return memStore;
    }
}