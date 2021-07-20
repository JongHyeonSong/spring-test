package com.cos.blog.test;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //스프링이 com.cos.blog 패키지 이하를 스캔후 특정 Annotation 파일들을 IOC하여 관리
public class BlogControllerTest {
	
	
	@GetMapping("/test/hi")
	public String hi() {
		return "<h1>Hello sp boot</h1>";
	}
	
	
	@GetMapping("/test/hello")
	public String hello() {
		return "<h1>Hello sp bootee</h1>";
	}
}
