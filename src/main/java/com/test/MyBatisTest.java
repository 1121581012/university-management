package com.test;
import com.glw.dao.LoginMapper;
import com.glw.model.Login;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @author GAO
 */
public class MyBatisTest {
    private String resource="spring-mybatis.xml";
    @Test
    public void test1()  {
        ApplicationContext ctx= new ClassPathXmlApplicationContext(resource);
        LoginMapper bean = ctx.getBean(LoginMapper.class);
        // StudentBaseinfo studentBaseinfo = bean.selectByPrimaryKey(20144752);
        Login login = bean.selectByStudentId(20144752);
        System.out.println(login);

    }





}
