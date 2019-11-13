package com.tank.controller;

import com.tank.domain.BasicInformation;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BasicInformationServlet extends HttpServlet{
        @Override
        protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            //设置请求信息的解码格式
            req.setCharacterEncoding("utf-8");
            //设置响应信息的编码格式
            resp.setCharacterEncoding("utf-8");
            //设置浏览器的解码格式
            resp.setContentType("text/html;charset=utf-8");
            Date birthday2 = new Date();
            java.sql.Date birthday = null;
            String username=req.getParameter("name");
            try {
                 birthday2=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").parse(req.getParameter("year")+"/"+req.getParameter("month")+"/"+"01"+" 12:12:12");
                birthday= new java.sql.Date(birthday2.getTime());
            } catch (ParseException e) {
                e.printStackTrace();
            }
            Integer sex=Integer.valueOf(req.getParameter("gender"));
            String address=req.getParameter("city");
            String phoneNumber=req.getParameter("telephone");
            String mail=req.getParameter("mailbox");
            Integer identity=Integer.valueOf(req.getParameter("identity"));
            String rDateBegin = req.getParameter("r_date_begin");
            String rDateEnd = req.getParameter("r_date_end");
            String workTime = rDateBegin + rDateEnd;
            String introduce = "无";
            int userId = 0;
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession session = sqlSessionFactory.openSession();
            BasicInformation basicInformation = new BasicInformation();
            session.insert("addInformation",basicInformation);
            session.commit();
            session.close();
        }
    }
