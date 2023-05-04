package ltd.newbee.mall.newbeemall.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ltd.newbee.mall.newbeemall.dao.RunRecommendApiHistoryMapper;
import ltd.newbee.mall.newbeemall.dao.StudentMapper;
import ltd.newbee.mall.newbeemall.entity.Student;
import ltd.newbee.mall.newbeemall.service.StudentService;
import ltd.newbee.mall.newbeemall.vo.StudentVo;

@Service
public class StudentServiceImpl implements StudentService {
	@Resource
	StudentMapper studentMapper;

	@Override
	public List<StudentVo> findStudentsById(int studentId) {
		List<Student> list = studentMapper.findStudentsById(studentId);
		List<StudentVo> voList = list.stream().map((Student s) -> {
			StudentVo vo = new StudentVo();
			vo.setStudentId(s.getStudentId());
			if (s.getStudentName().length() < 3) {
				if (s.getStudentName().length() == 1) {
					vo.setStudentName(s.getStudentName() + "xx");
				}
				if (s.getStudentName().length() == 2) {
					vo.setStudentName(s.getStudentName() + "x");
				}
			} else {
				vo.setStudentName(s.getStudentName());
			}
			return vo;
		}).collect(Collectors.toList());
		;
		return voList;
	}
}
