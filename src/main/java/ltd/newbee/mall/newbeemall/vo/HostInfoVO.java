package ltd.newbee.mall.newbeemall.vo;

import java.io.Serializable;
import java.util.List;

import ltd.newbee.mall.newbeemall.entity.Host;

public class HostInfoVO implements Serializable {
	
	public Host getHost() {
		return host;
	}
	public void setHost(Host host) {
		this.host = host;
	}
	public List<Host> getHostAssits() {
		return hostAssits;
	}
	public void setHostAssits(List<Host> hostAssits) {
		this.hostAssits = hostAssits;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	private Host host;
	private List<Host> hostAssits;
	private int count;

	
}
