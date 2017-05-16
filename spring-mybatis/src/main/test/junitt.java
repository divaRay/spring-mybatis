//import java.util.List;
//import org.apache.commons.logging.Log;
//import org.apache.commons.logging.LogFactory;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.test.context.ContextConfiguration;
//
//import cn.ildivoray.model.Student;
//import cn.ildivoray.service.StudentService;
//
//public class junitt {
//		
//	private static final Log log = (Log) LogFactory.getLog(junitt.class);
////比如這樣
//	@Autowired
//	private static StudentService studentService;
//
//
//    @Test
//	public void junittest(){
//    	ApplicationContext ctx = null;
//     	ctx = new ClassPathXmlApplicationContext("spring-mybatis.xml");
//  //   	StudentService studentService =(StudentService) ctx.getBean("studentService");
//     	List<Student> list = studentService.query();
//		log.info("get List data is" + list);
//    }
//}
//
//
////public static void main (String args[]){
////ApplicationContext ctx = null;
////ctx = new ClassPathXmlApplicationContext("spring-mybatis.xml");
//////StudentService studentService =(StudentService) ctx.getBean("studentService");
////List<Student> list = studentService.query();
////log.info("get List data is" + list);
////}