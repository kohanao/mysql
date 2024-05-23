package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.repositories.SampleDataRepository;

@Controller
public class AddressController {

	@Autowired
	SampleDataRepository repository;

	@GetMapping("/")
	public String index(Model model) {
		//mv.setViewName("id/index");
		/*mv.addObject("type", "タイプ");
		mv.addObject("task", "やること");
		mv.addObject("preference", "優先度");*/
		List<SampleData> todolist = repository.findAll();
		model.addAttribute("list", todolist);
		return "todolist";
	}

}
