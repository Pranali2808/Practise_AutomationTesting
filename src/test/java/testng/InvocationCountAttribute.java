package testng;

import org.testng.annotations.Test;

public class InvocationCountAttribute {
	 
		
		@Test(invocationCount=2)  
		public void createuser()  
		{  
		System.out.println("User created successfully");  
		}  
		@Test(invocationCount=0) 
		public void modifyuser()  
		{  
		System.out.println("User details modified");  
		}  
		@Test  
		public void deleteuser()  
		{  
		System.out.println("User deleted successfully");  
		}  
	}


