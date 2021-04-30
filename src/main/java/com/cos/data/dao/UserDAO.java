package com.cos.data.dao;

import com.cos.data.dto.UserDTO;

import java.util.List;
 
public interface UserDAO {
	//DB를 사용해 데이터를 조회하거나 조작하는 기능을 전담하는 오브젝트
    List<UserDTO> selectUsers(UserDTO param) throws Exception;
    UserDTO selectUsers2(String param) throws Exception;
	
}

