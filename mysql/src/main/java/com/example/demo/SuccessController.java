package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;

public class SuccessController {

	@GetMapping("/success")
	public String showSuccessPage() {
		return "success"; // success.htmlのファイル名を返す
	}

}
