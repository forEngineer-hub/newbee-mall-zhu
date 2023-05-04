package ltd.newbee.mall.newbeemall.service;

import java.util.List;

import ltd.newbee.mall.newbeemall.vo.HostInfoVO;
import ltd.newbee.mall.newbeemall.vo.StudentVo;
public interface StudentService {
	List<StudentVo> findStudentsById(int StudentId);
}
