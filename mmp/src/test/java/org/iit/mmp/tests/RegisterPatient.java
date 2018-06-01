package org.iit.mmp.tests;
import java.util.Random;
import org.iitworkforce.mmp.pages.RegistrationPage;
import org.iitworkforce.util.TestBaseClass;
import org.testng.annotations.Test;
public class RegisterPatient extends TestBaseClass{
	@Test
	public void registerPatientTest() throws Exception{

		Random rnd = new Random();
		String username = "test"+rnd.nextInt(90);
		String password = "test";
		String email = "test"+rnd.nextInt(90)+"@gmail.com";
		RegistrationPage regPage = new RegistrationPage(driver);
		regPage.register(email,username,password);

	}
}
