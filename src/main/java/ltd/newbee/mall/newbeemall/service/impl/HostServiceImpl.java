package ltd.newbee.mall.newbeemall.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ltd.newbee.mall.newbeemall.dao.HostMapper;
import ltd.newbee.mall.newbeemall.entity.Host;
import ltd.newbee.mall.newbeemall.service.HostService;
import ltd.newbee.mall.newbeemall.vo.HostInfoVO;
@Service
public class HostServiceImpl implements HostService {
	@Resource
	HostMapper hostMapper;
	@Override
	public HostInfoVO findHost(Long hotelId) {
		Host host = hostMapper.findHost(hotelId);
		List<Host> hostAssits =  hostMapper.findHostAssit(hotelId);
		int count = hostMapper.findReviewCount(hotelId);
		HostInfoVO vo = new HostInfoVO();
		vo.setCount(count);
		vo.setHost(host);
		vo.setHostAssits(hostAssits);
		return vo;
	}

}
