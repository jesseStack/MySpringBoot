package com.my.service.impl;

import com.my.bean.UserBean;
import com.my.dao.UserDao;
import com.my.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<UserBean> selectUserList(Integer oid) {
        return userDao.getUserList(oid);
    }
}
