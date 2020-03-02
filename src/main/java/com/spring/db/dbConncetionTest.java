package com.spring.db;

import com.spring.entity.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class dbConncetionTest {
    private String resource= "spring/applicationContext.xml";
    private SqlSessionFactory sqlSessionFactory;
    private SqlSession sqlSession=null;
    private ApplicationContext applicationContext;

    public SqlSession getSqlSession(){
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(resource);
        sqlSessionFactory=(SqlSessionFactory) context.getBean("sessionFactory");
        sqlSession=sqlSessionFactory.openSession();
        return sqlSession;
    }










    @Before
    public void setApplicationContext() throws Exception{
        applicationContext=
                new ClassPathXmlApplicationContext(resource);
    }
    @Test
    public void TestConnect(){
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(resource);
        sqlSessionFactory=(SqlSessionFactory) context.getBean("sessionFactory");
        sqlSession=sqlSessionFactory.openSession();
        if(sqlSession!=null){
            System.out.println("连接成功！");
        }
        else {
            System.out.println("连接失败！");
        }
    }

    @Test
    public void TestSelect(){
        sqlSession=getSqlSession();
        User user=sqlSession.selectOne("test.findUserByName","1234@qq.com");
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        System.out.println(user.getYhid());
        System.out.println(user.getYhphone());
    }

}
