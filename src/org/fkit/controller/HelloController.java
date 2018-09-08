package org.fkit.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * HelloController是一个基于注解的控制类
 * 可以同时处理多个请求动作，并且无需实现任何接口
 * org.springframework.stereotype.Controller注解用于指示该类是一个控制器类
 */
@Controller
public class HelloController {

	@RequestMapping(value="/hello")
	public ModelAndView hello() {
		System.out.println("hello 方法 被调用");
		
		//创建准备返回的ModelAndView对象，该对象通常包含了返回视图名，模型的名称以及模型对象
		ModelAndView mv =new ModelAndView();
		
		//添加模型数据，可以是任意的POJO对象
		mv.addObject("message","hello world!");
		
		//控制逻辑视图，视图解析器会根据该名字解析到具体的视图页面
		mv.setViewName("/WEB-INF/content/welcome.jsp");
		
		return mv;
	
	}

}
