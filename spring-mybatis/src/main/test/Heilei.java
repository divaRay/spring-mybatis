//import java.util.List;
//
//import org.apache.commons.logging.Log;
//import org.apache.commons.logging.LogFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//import cn.ildivoray.JunitTest.JunitTest;
//import cn.ildivoray.model.Student;
//import cn.ildivoray.service.StudentService;
//
//public class Heilei {
//	@Autowired
//	 private StudentService studentService;
//	private static final Log log = (Log) LogFactory.getLog(Heilei.class);
//	public static void main(String[] args){
//		//ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-mybatis.xml");
//		JunitTest j = new JunitTest();
//		List<Student> list = j.testSpring();
//		log.info("get List data is" + list);
//	}
//}
