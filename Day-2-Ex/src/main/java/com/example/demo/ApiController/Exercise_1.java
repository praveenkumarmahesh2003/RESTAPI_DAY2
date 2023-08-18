package com.example.demo.ApiController;

import org.springframework.beans.factory.annotation.Value; 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exercise_1 {
@Value("${var}")
private String name;

@GetMapping("disp")

	public String display()
	{
		return name;
	}
}
