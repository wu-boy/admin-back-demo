package com.wu.demo.admin.controller;

import com.google.code.kaptcha.Constants;
import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.wu.demo.admin.pojo.entity.User;
import com.wu.demo.admin.service.UserService;
import com.wu.demo.admin.util.FileUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * @author wusq
 * @date 2020/8/23
 */
@Api(description = "用户")
@RestController
@RequestMapping("v1/users")
public class UserController {

    @Autowired
    private UserService service;

    @Autowired
    private DefaultKaptcha defaultKaptcha;

    @ApiOperation("根据用户名获取用户")
    @GetMapping("{username}")
    public User get(@PathVariable String username){
        return service.getByUsername(username);
    }

    @ApiOperation("登录验证码")
    @GetMapping("captcha.jpg")
    public void captcha(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
        response.setHeader("Cache-Control", "no-store, no-cache");
        response.setContentType("image/jpeg");

        // 生成文字验证码
        String text = defaultKaptcha.createText();
        // 生成图片验证码
        BufferedImage image = defaultKaptcha.createImage(text);
        // 保存到验证码到 session
        request.getSession().setAttribute(Constants.KAPTCHA_SESSION_KEY, text);

        ServletOutputStream out = response.getOutputStream();
        ImageIO.write(image, "jpg", out);
        FileUtils.close(out);
    }
}
