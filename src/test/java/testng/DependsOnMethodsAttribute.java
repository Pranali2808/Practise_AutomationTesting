package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodsAttribute {

	@Test(priority = 1)
	public void createUser() {
		System.out.println("createUser...user created successufuly");
		Assert.fail();
	}

	@Test(priority = 2, dependsOnMethods = "createUser")
	public void deleteUser() {
		System.out.println("deleteUser......user deleted successfully");
	}
}
