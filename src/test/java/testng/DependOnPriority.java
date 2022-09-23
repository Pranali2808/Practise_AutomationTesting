package testng;

import org.testng.annotations.Test;

public class DependOnPriority {
	@Test  
	public void createuser()  
	{  
	System.out.println("User created successfully");  
	}  
	@Test(priority=1)  
	public void modifyuser()  
	{  
	System.out.println("User details modified");  
	}  
	@Test  (priority=2) 
	public void deleteuser()  
	{  
	System.out.println("User deleted successfully");  
	}  
}
