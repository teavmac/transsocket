package com.teavamc.transsocket.service;

import com.teavamc.transsocket.domain.User;

import java.util.List;

/**
 * @author 张超 teavamc
 * @Description:TODO
 * @ClassName IUserService
 * @date 2019/4/29 21:40
 **/
public interface IUserService {

    public List<User> selectUser();
}
