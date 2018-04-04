package com.glw.interceptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: GaoLiWei
 * @Date: Created in 13:45 2018/4/4
 */
public class UserAccessInterceptor extends HandlerInterceptorAdapter {
    /**
     * 登录链接
     */
    private final String loginUrl="/login.jsp";


    /**
     * @Comment 登陆拦截器
     * @Author GaoLiWei
     * @Date 2018年4月4日 上午14:27:54
     * @return
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {

        //如果用户已经登录，放行
        if (request.getSession().getAttribute("id") != null) {
            return true;
        }

        //非法请求，跳转到登录页面
        response.sendRedirect(request.getContextPath() + loginUrl);
        return false;
    }
}
