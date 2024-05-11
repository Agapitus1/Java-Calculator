class Calculator
{
    //Attributes
    double numberOne, numberTwo;
    //Alternate constructor has 1 or more parameters
    Calculator(double theNumberOne, double theNumberTwo)
    {
        numberOne = theNumberOne;
        numberTwo = theNumberTwo;
    }
    
    void displayResults()
    {
        System.out.println("Results for numbers " + numberOne + " and " + numberTwo + " are:");
        double addResult = add();
        System.out.println("Addition result: " + addResult);
        
        double subResult = subtract();
        System.out.println("Subtraction result: " + subResult);
        
        double multResult = multiply();
        System.out.println("Multiplication result: " + multResult);
        
        if(numberTwo == 0)
        {
            System.out.println("Error: cannot divide by zero");
        }
        else
        {
            double divResult = divide();
            System.out.println("Division result: " +divResult);
        }
        
        double max = maximum();
        System.out.println("Maximum is: " +max);
        
        double min = minimum();
        System.out.println("Minimum is: " +min);
        
        System.out.println("");
    }
    double add()
    {
        double result = numberOne + numberTwo;
        return result;
    }
    
    double subtract()
    {
        return numberOne - numberTwo;
    }
    
    double multiply()
    {
        return numberOne * numberTwo;
    }
    
    double divide()
    {
        return numberOne/numberTwo;
    }
    
    double maximum()
    {
        if(numberOne > numberTwo)
        {
            return numberOne;
        }
        else
        {
            return numberTwo;
        }
    }
    
    double minimum()
    {
    if(numberOne > numberTwo)
        {
            return numberTwo;
        }
        else
        {
            return numberOne;
        }
    }
}