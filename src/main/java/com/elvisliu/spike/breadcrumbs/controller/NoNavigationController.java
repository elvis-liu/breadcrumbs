package com.elvisliu.spike.breadcrumbs.controller;

import com.elvisliu.spike.breadcrumbs.navigation.Navigation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.Random;

@Controller
@RequestMapping(value= "/no_navigation")
public class NoNavigationController {
	@RequestMapping(method=RequestMethod.GET)
	public String view() {
		return "no_navigation";
	}
}
