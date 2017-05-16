package cn.ildivoray.service;

import java.util.List;

import cn.ildivoray.model.Student;

public interface StudentService {
	public List<Student> query();
	public Student getStudentByid(long id);
	public boolean add(Student student);
	public boolean update(Student student);
	public boolean delete(long id);
}
