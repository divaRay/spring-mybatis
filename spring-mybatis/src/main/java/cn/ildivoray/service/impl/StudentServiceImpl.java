package cn.ildivoray.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ildivoray.mapper.StudentMapper;
import cn.ildivoray.model.Student;
import cn.ildivoray.service.StudentService;




@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentMapper studentMapper;

	public List<Student> query() {
		List<Student> list = studentMapper.query();
		return list;
	}

	@Override
	public Student getStudentByid(long id) {
		Student student=studentMapper.getStudentByid(id);
		return student;
	}
	public boolean add(Student student) {
		return studentMapper.add(student);
	}

	public boolean update(Student student) {
		return studentMapper.update(student);
	}

	public boolean delete(long id) {
		return studentMapper.delete(id);
	}
	
	
	}




