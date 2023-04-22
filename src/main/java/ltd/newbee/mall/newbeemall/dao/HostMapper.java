package ltd.newbee.mall.newbeemall.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import ltd.newbee.mall.newbeemall.entity.Host;

public interface HostMapper {
	Host findHost(@Param("hotelId") Long hotelId);
	List<Host> findHostAssit(@Param("hotelId") Long hotelId);
	int findReviewCount(@Param("hotelId") Long hotelId);
}