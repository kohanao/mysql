package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.repositories.SampleDataRepository;

@Controller
public class AddressController {

	@Autowired
	SampleDataRepository repository;

	@GetMapping("/todolist")
	public ModelAndView index(ModelAndView mv) {
		mv.addObject("type", "タイプ");
		mv.addObject("task", "やること");
		mv.addObject("preference", "優先度");
		return mv;
	}

	@GetMapping("/")
	public ModelAndView index2(ModelAndView mv) {
		mv.setViewName("id/index");
		mv.addObject("type", "タイプ");
		mv.addObject("task", "やること");
		mv.addObject("preference", "優先度");
		return mv;
	}
}
