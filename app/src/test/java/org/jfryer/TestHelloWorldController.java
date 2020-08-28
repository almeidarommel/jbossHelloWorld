package org.jfryer;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.ui.ModelMap;

public class TestHelloWorldController {

	@Test
	public void test() {
		HelloWorldController controller = new HelloWorldController();
		assertTrue(controller.helloWorld(new ModelMap()).equals("helloWorld") );
	}

}
