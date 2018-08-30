package com.lzp.fastdevops.dao;

import com.lzp.fastdevops.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface userDao {

    public List<User> getAll();

    public boolean insert(User user);

}
