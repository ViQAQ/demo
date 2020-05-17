package com.test.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.test.dto.User;

@Mapper
public interface UserDao {
	public List<User> queryUserListById(Long id);
}
