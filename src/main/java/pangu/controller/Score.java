package pangu.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * @author edz
 */
public class Score extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置请求信息的解码格式
        req.setCharacterEncoding("utf-8");
        //设置响应信息的编码格式
        resp.setCharacterEncoding("utf-8");
        //设置浏览器的解码格式
        resp.setContentType("text/html;charset=utf-8");
        String name=req.getParameter("name");
        String birthday=req.getParameter("year")+"年"+req.getParameter("month")+"月";
        Integer gender=Integer.valueOf(req.getParameter("gender"));
        String city=req.getParameter("city");
        String telephone=req.getParameter("telephone");
        String mailbox=req.getParameter("mailbox");
        Integer identify=Integer.valueOf(req.getParameter("identify"));
        String r_date_begin = req.getParameter("r_date_begin");
        String r_date_end = req.getParameter("r_date_end");
    }
}
