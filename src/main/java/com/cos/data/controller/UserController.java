package com.cos.data.controller;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cos.data.dao.UserDAO;
import com.cos.data.dto.UserDTO;

@RestController
@MapperScan(basePackages="com.cos.data.dao")//탐색할 패키지 설정
public class UserController {
	@Autowired
	private UserDAO userDAO;//UserDAO bean을 자동으로 주입
	
	@RequestMapping("/users")
	public List<UserDTO> users(@RequestParam(value="no", defaultValue = "")String time) throws Exception { //query String으로 county를 받도록 설정
		final UserDTO param = new UserDTO(time,null, 0, 0);//전달 받은 country를 받은 UserDTO 객체 생성 이 객체는 MyBatis에 파라미터로 전달
		final List<UserDTO> userList = userDAO.selectUsers(param);// 22번 째 줄에서 생성한 객체를 파라미터로 전달하여 DB로부터 사용자 목록을 불러온다.
		return userList;
	}
	
	@RequestMapping("/users2")
	public String users2(@RequestParam(value="id")String id, Model model) throws Exception { //query String으로 county를 받도록 설정
		String param = userDAO.selectUsers2(param);//전달 받은 country를 받은 UserDTO 객체 생성 이 객체는 MyBatis에 파라미터로 전달
		//final List<UserDTO> userList = userDAO.selectUsers2(param);// 22번 째 줄에서 생성한 객체를 파라미터로 전달하여 DB로부터 사용자 목록을 불러온다.
		model.addAttribute("id : " + id);
		
		return "/users2";
	}
	
}