package com.redsol.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.redsol.model.Post;

@Controller
public class BlogController {

	@RequestMapping(value = "/addPost")
	public String addPost(@ModelAttribute("post") Post post){
		
		System.out.println("title: " + post.getTitle() + "\nPost: " + post.getBody() );
		return "addPost";
	}
	
}
