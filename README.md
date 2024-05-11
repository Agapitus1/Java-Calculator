# Java-Calculator

# Exercise A - Simple Java Functions – Individual

1. We will write a class called Calculator. Open BlueJ, create a new project called week4 - save this on your network drive.
Create the class Calculator – remember to DELETE ALL CODE and start typing your class from scratch.


2. Create two class attributes in the Calculator. These are to be called numberOne and numberTwo (use the type double).

3. Create an alternate constructor for Calculator. Remember, the first line should look like this:

Calculator(double theNumberOne, double theNumberTwo)

4. Write a function called add() that adds together the attributes numberOne and numberTwo and returns the result e.g. if numberOne = 5.5, and numberTwo = 7.2, then add() returns 12.7

double add()
{
	
}
 
5. Create a new class called TestCalculator that creates 2 calculator objects.  After that, call add() for the calculator objects, then display the result for each calculator. HINT: You will need to save the returned value from add() into a local variable in the main() method. Use this main method header:

class TestCalculator
{
	Calculator calc1, calc2;

	TestCalculator()
	{
	}
}


6.	Compile your classes, then run the program. Do you see both results from the calculators? 


 
# Exercise B – A More Complex Calculator – Individual

1.	Add the functions subtract(), multiply() and divide() to your calculator class.

2.	Quickly test your four functions by right clicking and creating a Calculator object, then calling the four methods. Like this:


3.	If your functions are returning the right values, add a procedure called displayResults() to the Calculator class. It must do the following:

a.	Call add(), display the result from add()
b.	Call subtract(), display the result from subtract()
c.	Call multiply(), display the result from multiply ()
d.	Call divide(), display the result from divide()

4.	Change the TestCalculator() so that it calls displayResults() for each calculator object (instead of calling add())
 
5.	The output of the program should look like this (results will vary):

6.	MAKING ROBUST CODE - There is a problem with the divide() function. If numberTwo is equal to 0, there is a problem!  Try this with one of your Calculator objects, what happens?

Can we fix this problem?  Is there more than one way to fix it?  Try it out, ask your tutor for help if you are unsure.


7.	Write a function called maximum() that returns the largest number (numberOne or numberTwo).

 
8.	Write a function called minimum() that returns the smallest number (numberOne or numberTwo).

9.	Call maximum() and minimum() from displayResults as done previously for add() etc.
