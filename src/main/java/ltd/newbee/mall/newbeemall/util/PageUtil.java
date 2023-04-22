package ltd.newbee.mall.newbeemall.util;

import java.util.HashMap;
import java.util.Map;

public class PageUtil extends HashMap<String, Object> {
	public int pageNo;
	public int offSet;
	public String orderBy;
	public int limit;
	
	public PageUtil(int pageNo,String orderBy,int limit){
		this.offSet = (pageNo-1) * limit;
		this.orderBy = orderBy;
		this.limit = limit;
		this.pageNo = pageNo;
		
	}
	
	public PageUtil(Map map){
		this.putAll(map);
	}
	
}
