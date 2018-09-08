package org.fkit.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * HelloController��һ������ע��Ŀ�����
 * ����ͬʱ����������������������ʵ���κνӿ�
 * org.springframework.stereotype.Controllerע������ָʾ������һ����������
 */
@Controller
public class HelloController {

	@RequestMapping(value="/hello")
	public ModelAndView hello() {
		System.out.println("hello ���� ������");
		
		//����׼�����ص�ModelAndView���󣬸ö���ͨ�������˷�����ͼ����ģ�͵������Լ�ģ�Ͷ���
		ModelAndView mv =new ModelAndView();
		
		//���ģ�����ݣ������������POJO����
		mv.addObject("message","hello world!");
		
		//�����߼���ͼ����ͼ����������ݸ����ֽ������������ͼҳ��
		mv.setViewName("/WEB-INF/content/welcome.jsp");
		
		return mv;
	
	}

}
