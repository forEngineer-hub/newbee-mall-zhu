package ltd.newbee.mall.newbeemall.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ltd.newbee.mall.newbeemall.service.NewBeeMallCarouselService;
import ltd.newbee.mall.newbeemall.service.StudentService;
import ltd.newbee.mall.newbeemall.util.Result;
import ltd.newbee.mall.newbeemall.util.ResultGenerator;

@Controller
public class StudentController {

	@Resource
	private StudentService studentService;

	@GetMapping("/students")
	@ResponseBody
	public Result findStudentsById(int studentId) {
		return ResultGenerator.genSuccessResult(studentService.findStudentsById(studentId));
	}
}
