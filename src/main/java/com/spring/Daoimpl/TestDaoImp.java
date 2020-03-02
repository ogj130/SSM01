package com.spring.Daoimpl;

import com.spring.Dao.TestDao;
import com.spring.entity.User;
import com.spring.db.dbConncetionTest;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository  //为了包扫描的时候 把Dao添加
public class TestDaoImp implements TestDao {
    @Autowired //注入sqlSessionFactory
    private SqlSessionFactory sqlSessionFactory;
    private SqlSession sqlSession=null;
    private dbConncetionTest dbConncetionTest;


    private SqlSession getSqlSession(){
        if(sqlSession==null){
            dbConncetionTest=new dbConncetionTest();
            sqlSession=dbConncetionTest.getSqlSession();
        }
        return sqlSession;
    }

    public List<User> findUserByName(User user) {
        List<User> userList=new ArrayList<User>();
        if(getSqlSession()!=null) {
             userList = getSqlSession().selectList("test.findUserByName", user.getYhname());
        }
        //如果没找到就返回一个空的集合对象，不返回null
        return userList;
    }


}
