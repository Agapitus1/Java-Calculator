class TestCalculator
{
    Calculator calc1, calc2;
    
    TestCalculator()
    {
        //load object
        calc1 = new Calculator(10.2, 20.4, 50.6);
        calc2 = new Calculator(4.4, 8.5, 8.8);
        //
        calc1.displayResults();
        calc2.displayResults();
    }
}