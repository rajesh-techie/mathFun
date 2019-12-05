package com.studentGame.mathFun;
import java.util.Date;

public class App 
{
	public void calcLogic() {
        Date currDate = new Date();
	 	int var1=3,var2=5,var3=10,z=0,iChar1,iChar2,iLen;//config to get var1,2 from properties file
    	String buzzWord1="Fizz",buzzWord2="Buzz",buzzWord3="FizzBuzz";//config to get from properties file
        System.out.println(currDate.toString()+": Starting the Execution");
        System.out.println(currDate.toString()+": Here is the list of numbers to expect from the class");
        System.out.println(currDate.toString()+": ****************************************************");
    	try {
			for(int i=1;i<=100;i++){
				iLen = (int)(Math.log10(i+1));//to get length
				iChar1 = i/var3;
				iChar2 = i%var3;
				if ((i%var1 == z && i%var2 == z ) // check whether both have 0 remainder 
						||((i%var1 == z) && (((iChar1 == var2)||(iChar2 == var2)))) // check div by 3, not div by 5 but is in first or second char
						||((i%var2 == z) && (((iChar1 == var1)||(iChar2 == var1))))// check div by 5, not div by 5 but is in first or second char
						||(iLen >0 && (((iChar1 == var1)||(iChar2 == var1)) && ((iChar1 == var2)||(iChar2 == var2)))) ) // check first char/second char = 3 or  first char/second char = 5
				{
					System.out.println(buzzWord3);
				}
				else if ((i%var1 == z) ||(iLen >0 && ((iChar1 == var1)||(iChar2 == var1)))) {
					System.out.println(buzzWord1);
				}
				else if  ((i%var2 == z) ||(iLen >0 && ((iChar1 == var2)||(iChar2 == var2))))
				{
					System.out.println(buzzWord2);
				}
				else {
					System.out.println(i);
				}
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	System.out.println(currDate.toString()+": ****************************************************");
        System.out.println(currDate.toString()+": Completed the processing");
	}

    public static void main( String[] args )
    {
    	App app1 = new App();
    	app1.calcLogic();
    }
    

}
