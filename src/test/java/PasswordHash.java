import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import junit.framework.TestCase;

public class PasswordHash extends TestCase {

	@Test
	public void testMD5Hash() {
		
		String pwd = "manikanta";
		Md5PasswordEncoder passwordEncoder = new Md5PasswordEncoder();
		String hashedPassword = passwordEncoder.encodePassword(pwd, null );
		System.out.println(hashedPassword);
		
	}

	
	@Test
	public void testBcryptHash() {
		
		String pwd = "mani@123"; 
		BCryptPasswordEncoder bce = new BCryptPasswordEncoder();

		String hashedPassword = bce.encode(pwd);
		System.out.println(hashedPassword);
	}
}
