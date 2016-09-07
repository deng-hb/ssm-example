package com.denghb.ssm.controller;

import com.denghb.ssm.model.User;
import com.denghb.ssm.service.UserService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by denghb on 16/9/7.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/")
    public String index(Model model, HttpServletRequest request) {
        List<User> list = userService.list();
        model.addAttribute("list", list);
        return "user/list";
    }

    @RequestMapping(value = "/create")
    public String create(HttpServletRequest request) {
        return "user/create";
    }

    @RequestMapping(value = "/create.do")
    public String doCreate(User user, Model model, HttpServletRequest request) {
        if (null == user || StringUtils.isBlank(user.getUsername()) || StringUtils.isBlank(user.getPassword())) {
            model.addAttribute("msg", "username or password is not null");
            return "user/create";
        }
        userService.create(user);
        return "redirect:/user/";
    }

    @RequestMapping(value = "/update/{id}")
    public String update(@PathVariable("id") Integer id, Model model, HttpServletRequest request) {
        User user = userService.query(id);
        model.addAttribute("user", user);
        return "user/update";
    }

    @RequestMapping(value = "/update.do")
    public String doUpdate(User user, Model model, HttpServletRequest request) {
        if (null == user || StringUtils.isBlank(user.getUsername()) || StringUtils.isBlank(user.getPassword())) {
            model.addAttribute("msg", "username or password is not null");
            return "user/update";
        }
        userService.update(user);
        return "redirect:/user/";
    }

    @RequestMapping(value = "/delete/{id}")
    public String delete(@PathVariable("id") Integer id, HttpServletRequest request) {
        userService.delete(id);
        return "redirect:/user/";
    }

}
