package com.springmvc.controller;

import com.springmvc.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * 用户控制器类
 */
@Controller
public class UserController {
    @RequestMapping(value = "/index")
    public ModelAndView index(){
        System.out.println("访问控制层index()方法");
        // 实例化ModelAndView对象,返回视图名及模型数据
        ModelAndView modelAndView = new ModelAndView();
        // 添加数据,可以是任意pojo对象
        modelAndView.addObject("msg", "首页");
        // 添加视图名,通过spring-MVC.xml配置中配置的视图解析器将此处的逻辑视图转换为物理视图
        modelAndView.setViewName("index");
        return modelAndView;
    }

    // 添加sunccess()方法,页面提交返回成功页面
    @RequestMapping(value = "/success")
    public ModelAndView modelAndView(){
        System.out.println("访问控制层success()方法");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg", "成功页");
        modelAndView.setViewName("success");
        return modelAndView;
    }

    // 添加pathAnt()方法,测试ant风格的url格式
    @RequestMapping(value = "/*/pathAnt")
    public String pathAnt(){
        System.out.println("访问控制层pathAnt()方法");
        return "success";
    }

    // 测试REST风格的url路径映射
    // 添加restGet()方法, 处理GET方式请求
    @RequestMapping(value = "/rest/{username}")
    public String restGet(@PathVariable("username") String username){
        System.out.println("访问控制层restGet()方法, 参数: " + username);
        return "success";
    }

    // 添加restPost()方法, 处理POST方式请求
    @RequestMapping(value = "/rest", method = RequestMethod.POST)
    public String restPost(){
        System.out.println("访问控制层restPost()方法");
        return "success";
    }

    // 添加restPut()方法, 处理PUT方式请求, 需要使用重定向
    @RequestMapping(value = "/rest/{username}", method = RequestMethod.PUT)
    public String restPut(@PathVariable("username") String username){
        System.out.println("访问控制层restPut()方法, 参数: " + username);
        return "redirect:/success";
    }

    // 添加restDelete()方法, 处理DELETE请求, 需要使用重定向
    @RequestMapping(value = "/rest/{username}", method = RequestMethod.DELETE)
    public String restDelete(@PathVariable("username") String username){
        System.out.println("访问控制层restDelete()方法, 参数: " + username);
        return "redirect:/success";
    }

    // 添加saveUser()方法, 将用户信息存储到User表单对象中
    @RequestMapping(value = "/saveUser")
    public String saveUser(User user){
        System.out.println("访问控制层saveUser()方法: " + user);
        return "success";
    }
}
