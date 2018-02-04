package com.demo.graduation.user.web;

import com.demo.graduation.com.pudding.core.web.BaseController;
//import com.demo.graduation.common.entity.BaseController;
import com.demo.graduation.common.entity.BooleanObject;
import com.demo.graduation.common.entity.ResponseEntity;
import com.demo.graduation.user.entity.User;
import com.demo.graduation.user.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController extends BaseController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public ResponseEntity<User> get(String id) {
        return success(userService.get(id));
    }

    @RequestMapping(value = "/selectOne", method = RequestMethod.GET)
    public ResponseEntity<User> selectOne(User ciipOrgCardBasicInfo) {
        return success(userService.selectOne(ciipOrgCardBasicInfo));
    }

    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public ResponseEntity<PageInfo<User>> query(User user) {
        return success(userService.find(user));
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntity<List<User>> list(User user) {
        return success(userService.findList(user));
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ResponseEntity<User> save(@RequestBody User user) {
        return success(userService.save(user));
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public ResponseEntity delete(String id) {
        User ciipOrgCardBasicInfo = new User();
        ciipOrgCardBasicInfo.setId(id);
        return success(new BooleanObject(userService.delete(ciipOrgCardBasicInfo) > 0));
    }
}
