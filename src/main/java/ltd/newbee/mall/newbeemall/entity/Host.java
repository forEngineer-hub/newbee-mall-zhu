package ltd.newbee.mall.newbeemall.entity;

import java.util.Date;

public class Host {
	private Long hostId;
	private String hostName;
	private Date registerDate;
	private String comment;
	private String superHost;
	private String hostImage; 
	
	public String getHostImage() {
		return hostImage;
	}
	public void setHostImage(String hostImage) {
		this.hostImage = hostImage;
	}
	public Long getHostId() {
		return hostId;
	}
	public void setHostId(Long hostId) {
		this.hostId = hostId;
	}
	public String getHostName() {
		return hostName;
	}
	public void setHostName(String hostName) {
		this.hostName = hostName;
	}
	public Date getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getSuperHost() {
		return superHost;
	}
	public void setSuperHost(String superHost) {
		this.superHost = superHost;
	}

}
