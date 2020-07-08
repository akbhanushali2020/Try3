
public class Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("I Navigated to home page");	
		
		
/* Need to call that method.
 * How can you call methods from Methods class to parent class
 * 
 * 
 * first define object for this method class
 * Tell this parent class there is one class methods.
 *  Tell parent class about methods class
 *   
	*/
		
//Methods m = new Methods();
/*I am creating an object m for this Methods class

That means If I want to access any particular methods from this methods class 
I can do it from 
 methodsobjects.methodsname  - this is the syntax 
 
 Classobject.methodsname
which class object where you have this method. Here my class is methods

You can define with this syntax
Methods m = new Methods();

new is memory allocation operator - this will create memory for this Methods class in this parent class

m is the method for this methods class - successfully define an object



classobject is m

you can call by putting dot
*/


Methods m = new Methods();
m.ValidatateHeader(); // all the methods will be displayed from the Methods class. other are default from the JAVA
m.ValidatateHeader1();
System.out.println(m.ValidatateHeader1());
m.ValidatateHeader2();
System.out.println(m.ValidatateHeader2());
















		

	}

}
