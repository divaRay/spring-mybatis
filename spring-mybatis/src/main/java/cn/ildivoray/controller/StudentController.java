package cn.ildivoray.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cn.ildivoray.model.Student;
import cn.ildivoray.service.StudentService;
@Controller  
public class StudentController {
	   
	    @Resource  
	    private StudentService studentService;  
	    //替代了如下代码
	    //StudentService studentService = new StudentServicImpl();	    
	//    <bean id="studentServiceImpl" class="cn.ildivoray.service.impl.StudentServiceImpl"/>
	      
	  //获取学生列表
		@RequestMapping(value="/a/list/student/search" ,method=RequestMethod.GET)
		public ModelAndView getStudent()throws Exception{
			List<Student> studentlist =studentService.query();
			//创建对象后才能调用方法
			ModelAndView modelAndView = new ModelAndView();
			//展示什么数据
			//将studentlist传入jsp,jsp页面里使用json taglib标签遍历
			modelAndView.addObject("studentlist",studentlist);
			//展示到哪里
			modelAndView.setViewName("/allStudent");
			return modelAndView;
		}
		
		
		@RequestMapping(value="/a/student", method=RequestMethod.GET)
		public ModelAndView searchStudent()throws Exception{
			
				Student student =studentService.getStudentByid(1);
				ModelAndView modelAndView = new ModelAndView();
				
				modelAndView.addObject("student",student);
				
				modelAndView.setViewName("/searchstudent");
		     	return modelAndView;

	}  
}


