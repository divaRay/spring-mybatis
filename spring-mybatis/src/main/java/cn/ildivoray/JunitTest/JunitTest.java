//package cn.ildivoray.JunitTest;
//import java.util.List;
//import org.apache.commons.logging.Log;
//import org.apache.commons.logging.LogFactory;
//import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.stereotype.Component;
//
//import cn.ildivoray.model.Student;
//import cn.ildivoray.service.StudentService;
//
//@Component
//public class JunitTest {
//	
//	private static final Log log = (Log) LogFactory.getLog(JunitTest.class);
////比如這樣
//
//	@Autowired
//	 private static StudentService studentService;
//    @Test
//	public void testSpring(){
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-mybatis.xml");
//    	StudentService studentService =(StudentService) ctx.getBean("studentService");
//     	List<Student> list = studentService.query();
//     	log.info("get List data is" + list);
//		
//    }
//}
//
