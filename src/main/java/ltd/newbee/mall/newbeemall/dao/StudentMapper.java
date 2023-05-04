package ltd.newbee.mall.newbeemall.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import ltd.newbee.mall.newbeemall.entity.Carousel;
import ltd.newbee.mall.newbeemall.entity.Student;

public interface StudentMapper {
	List<Student> findStudentsById(@Param("studentId") int studentId);
}