package com.lbrce.finalmodule;
import org.testng.Assert;
import org.testng.annotations.Test;
public class UserVerificationTest {
	UserVerification uv=new UserVerification();
	@Test
	public void testcase1() {
		Assert.assertEquals(false,uv.check("",""));
		
	}
	@Test
	public void testcase2() {
		Assert.assertEquals(true,uv.check("lbrce","lbrce@76"));
		
	}
	@Test
	public void testcase3() {
		Assert.assertEquals(false,uv.check("lbrce","lbrce@767"));
		
	}
	@Test
	public void testcase4() {
		Assert.assertEquals(false,uv.check("vamsi","vamsi@767"));
		
	}
	@Test
	public void testcase5() {
		Assert.assertEquals(false,uv.check("srinu","srinu@767"));
		
	}
}
