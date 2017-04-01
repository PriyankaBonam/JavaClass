package	com.test.demo	;	
	
	
public class AccessingLocalGlobalFromMain {
	// Declaring a non static global variable i 
	int i;
   /* We cannot assign the value for non static global variable in the same class
      If we want to assign then we need to assign it from another function
    */
	
	// Declaring and assigning the non static global variable
	int j=10;
	
	//Declaring a static variable
	 static int k;
		 
	 //Declaring and assigning value for static global variable
	 static int l=20;
	 
	 //creating a void non static instance function
	 void nonStaticVoid()
	 {
		 System.out.println("In function : nonStaticVoidFunction()");
		 //Since the function is declared as void, the function does not return anything 
		 //so there is no return statement in the function
	 }
	 
	 //creating a non static function of return type : int
	 int nonStaticInt()
	 {
		int i=0;
		System.out.println("In function : nonStaticInt()");
		//Since the return type of the function is Int the return statement is mandatory
		//returning the value of i
		System.out.println(i);
		return i;
	 }
	 
	 //creating a static function of return type : void
	 static void staticVoid()
	 {
		 System.out.println("Inside function : staticVoid");
	 }
	 
	 //creating a static function of return type : int
	 static int staticInt()
	 {
		 int i=20;
		 System.out.println("Inside the function : staticInt()");
		 //returning the local variable
		 return(i);
	 }
	 
	 public static void main(String args[])
	 {
		 //Defining and assigning the local variable in Main()
		 int i=30;
		 //Printing the local variable of Main()
		 System.out.println("Inside main()");
		 System.out.println("Printing the local variable of Main()"+i);
	
		 		 //Creating the object for the class
		 AccessingLocalGlobalFromMain a= new AccessingLocalGlobalFromMain();
		 
		 //Printing the Non Static Global Variable 
		 System.out.println("Printing the Non Static Global Variable : "+a.i);
		 
		 //Printing the Non Static Global Variable
		 System.out.println("Printing the Non Static Global Variable : "+a.j);
		 
		 //Printing the Static Global Variable
		 System.out.println("Static Global Variable : "+AccessingLocalGlobalFromMain.l);
		 
		 //Calling NonStatic function with Return Type : void
		 //Since the function is non static, we are calling the function using the object
		 a.nonStaticInt();
		 
		 //Calling Non Static Function with Return Type : int
		int ret= a.nonStaticInt();
		 System.out.println("Printing the return value of nonStaticInt function"+ret);
		 
		//Calling Static Function with Return Type : void
		 AccessingLocalGlobalFromMain.staticVoid();
		 
		 //Calling Static Function with Return Type : int 
		 ret= AccessingLocalGlobalFromMain.staticInt();
		 System.out.println("Printing the return value of staticVoid function"+ret);
		 
		 
		 
		 
	 }
	
	
	
	
	
}
