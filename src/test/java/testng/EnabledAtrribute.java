package testng;

import org.testng.annotations.Test;

public class EnabledAtrribute {

	@Test(invocationCount=2,enabled=false)  
	public void createuser()  
	{  
	System.out.println("User created successfully");  
	} 
	
	@Test(invocationCount=2,enabled=true) 
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
