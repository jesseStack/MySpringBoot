package com.my.rest;

import com.my.bean.UserBean;
import com.my.common.DataResult;
import com.my.entity.UserEntity;
import com.my.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * Created by dev on 2018/2/6.
 */
@RestController
@RequestMapping("/user")
public class UserRest {
    private static final Logger LOG = LoggerFactory.getLogger(UserRest.class);
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/selectUserList", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public DataResult<List<UserBean>> getUserList(@RequestBody UserEntity entity) throws Exception {
        String method = "查询业主所属用户";
        LOG.debug(String.format("[%s]进入方法{%s}", method, entity));
        List<UserBean> list = userService.selectUserList(entity.getOid());
        return new DataResult<>(list);
    }

}
