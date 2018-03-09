package com.my.dao;

import com.my.bean.UserBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * Created by dev on 12/28/2017.
 */
@Mapper
public interface UserDao {

    List<UserBean> getUserList(@Param("oid") Integer oid);
}
