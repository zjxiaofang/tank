package pangu.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * @author edz
 */
public class DBUtil {
    private static String driver="";
    private static String url="";
    private static String username="";
    private static String pwd="";
    static {
        Properties properties = new Properties();
        InputStream is = DBUtil.class.getResourceAsStream("/db.properties");
        try{
            properties.load(is);
            driver=properties.getProperty("driver");
            url=properties.getProperty("url");
            username=properties.getProperty("username");
            pwd=properties.getProperty("pwd");
            System.out.println("数据库初始化参数:"+driver+url+username+pwd);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static Connection getConnection(){
        Connection connection = null;
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url,username,pwd);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
    public static PreparedStatement getPreparedStatement(Connection connection,String sql){
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return preparedStatement;
    }
    public static Statement getStatement(Connection connection){
        Statement statement = null;
        try {
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return statement;
    }
    public static void closeAll(ResultSet rs,Statement sta,Connection conn){
        //6.关闭数据库资源
        try {
            if(rs!=null){
                rs.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if(sta!=null){
                sta.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if(conn!=null){
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
