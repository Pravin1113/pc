package com.practice.serviceimp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.entities.Student;
import com.practice.repository.Repository;
import com.practice.service.StudentService;
@Service
public class ServiceImp implements StudentService {
	@Autowired
 Repository repo;
	@Override
	public List<Student> getAll() {
		
		return repo.findAll() ;
	}

	@Override
	public Student findbyId(int id) {
		Optional<Student> st=repo.findById(id);
		return st.get();
	}

	@Override
	public Student save(Student student) {
		// TODO Auto-generated method stub
		return repo.save(student);
	}

	@Override
	public Student update(Student student) {
		// TODO Auto-generated method stub
		Optional<Student> fromDB=repo.findById(student.getId());
		if(fromDB.isPresent()) {
			Student st=fromDB.get();
			st.setName(student.getName());
			st.setMarks(student.getMarks());
			return repo.save(st);
		}
		return null ;

	}
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		
	}

}
