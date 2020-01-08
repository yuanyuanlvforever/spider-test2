package com.spider.test1.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import javax.servlet.http.HttpServletRequest;

/**
 * @Author: lipeng
 * @Date: 2019/12/10 16:26
 */
@RestController
public class Demo1Console {

	@GetMapping(value = "/demo")
	public String demo(HttpServletRequest httpRequest,String index,String ip,String port) {
		if(ip != null){
			RestTemplate restTemplate = new RestTemplate();
			String notice = restTemplate.getForObject("http://"+ip+":"+port+"/demo2?index="+2, String.class);
			System.out.println(notice);
			return "我们是双胞胎demo"+index+"和demo"+notice;
		}else{
			return "我是孤单的demo"+index+"lyy0000";
		}
	}

	@GetMapping(value = "/demo2")
	public String demo2(HttpServletRequest httpRequest,String index,String ip) {
		return index;
	}

}
