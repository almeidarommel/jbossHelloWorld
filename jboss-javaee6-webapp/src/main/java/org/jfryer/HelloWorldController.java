package org.jfryer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HelloWorldController {
	static Logger logger = LoggerFactory.getLogger(HelloWorldController.class);
	
	@RequestMapping("/helloWorld")
    public String helloWorld(ModelMap model) {
		
        model.addAttribute("message", "Hello World!");
        logger.info("added message {} to model",model.get("message"));
        return "helloWorld";
    }
}