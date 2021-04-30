package com.cos.data.dto;

//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.Setter;
// 
//@AllArgsConstructor
//@Getter
//@Setter
public class UserDTO {
	//계층간 데이터 교환을 위한 자바빈즈 
	
	private String time;
	private String type;
	private int no;
	private int per;
	public UserDTO(String time, String type, int no, int per) {
		super();
		this.time = time;
		this.type = type;
		this.no = no;
		this.per = per;
	}
	public UserDTO(int no) {
		this.no = no;
	}
	
	public UserDTO(String type) {
		this.type = type;
	}
	
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getPer() {
		return per;
	}
	public void setPer(int per) {
		this.per = per;
	}
	
    
}

