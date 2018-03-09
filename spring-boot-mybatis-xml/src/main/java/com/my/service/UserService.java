package com.my.service;

import com.my.bean.UserBean;
import java.util.List;

/**
 * Created by dev on 12/28/2017.
 */
public interface UserService {

    List<UserBean> selectUserList(Integer oid);
}
