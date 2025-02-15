package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

	@Autowired
	private RestTemplate restTemplate;
	
	@PostMapping("/dbAdd")
	public String dbAdd(@RequestBody Employ employ) {
		// Make the POST request
		String url = "http://SBEMPLOYCRUD/employ/addEmploy";
		HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
     // Create an HttpEntity
        HttpEntity<Employ> entity = new HttpEntity<>(employ, headers);
        ResponseEntity<String> response = restTemplate.exchange(url, 
        		HttpMethod.POST, entity, String.class);
		return response.getBody();
	}
	
	@GetMapping("/inter/{id}")
	public Object getEmploy(@PathVariable int id) {
		Object employs = restTemplate.getForObject("http://EUREKACLIENTNEW/employee/find/"+id, Object.class);
		return employs;
	}
	
	@GetMapping("/db")
	public Object[] showDbEmploy() {
		Object[] employs = restTemplate.getForObject("http://SBEMPLOYCRUD/employ/showEmploy", Object[].class);
		return employs;
	}

	
	@GetMapping("/inter")
	public Object[] showEmploy() {
		Object[] employs = restTemplate.getForObject("http://EUREKACLIENTNEW/employee/findall", Object[].class);
		return employs;
	}
}
