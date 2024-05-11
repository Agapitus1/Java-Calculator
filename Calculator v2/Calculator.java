class Calculator
{
    //Attributes
    double numberOne, numberTwo, numberThree;
    //Alternate constructor has 1 or more parameters
    Calculator(double theNumberOne, double theNumberTwo, double theNumberThree)
    {
        numberOne = theNumberOne;
        numberTwo = theNumberTwo;
        numberThree = theNumberThree;
    }
 
    void displayResults()
    {
        System.out.println("Results for numbers " + numberOne + " , " + numberTwo + " and " + numberThree + " are:");
        double addResult = add();
        System.out.println("Addition result: " + addResult);
        
        double subResult = subtract();
        System.out.println("Subtraction result: " + subResult);
        
        double multResult = multiply();
        System.out.println("Multiplication result: " + multResult);
        
        if(numberTwo == 0 || numberOne == 0 || numberThree == 0)
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
        
        System.out.println("Average is: " + averageOfThree(numberOne,numberTwo,numberThree));
        
        System.out.println("Middle is: " + middleOfThree(numberOne,numberTwo,numberThree));
        
        System.out.println("");
    }
    double add()
    {
        double result = numberOne + numberTwo + numberThree;
        return result;
    }
    
    double subtract()
    {
        return numberOne - numberTwo - numberThree;
    }
    
    double multiply()
    {
        return numberOne * numberTwo * numberThree;
    }
    
    double divide()
    {
        return (numberOne/numberTwo)-numberThree;
    }
    
    double maximum()
    {
        if(numberOne > numberTwo && numberOne > numberThree)
        {
            return numberOne;
        }
        else if(numberTwo > numberOne && numberTwo > numberThree)
        {
            return numberTwo;
        }
        else
        {
            return numberThree;
        }
    }
    
    double minimum()
    {
    if(numberOne < numberTwo && numberOne < numberThree)
        {
            return numberOne;
        }
        else if(numberTwo < numberOne && numberTwo < numberThree)
        {
            return numberTwo;
        }
        else
        {
            return numberThree;
        }
    }
    
    double averageOfThree (double numberOne, double numberTwo, double numberThree)
    {
        return (numberOne+numberTwo+numberThree)/3;
    }
    
    double middleOfThree (double numberOne, double numberTwo, double numberThree)
    {
        if ((numberOne < numberTwo && numberTwo < numberThree) || (numberThree < numberTwo && numberTwo < numberOne)) 
       {
           return numberTwo;
        }
    else if ((numberTwo < numberOne && numberOne < numberThree) || (numberThree < numberOne && numberOne < numberTwo))
    {
        return numberOne;
    }
    else
    {
      return numberThree;
    }
    }
}