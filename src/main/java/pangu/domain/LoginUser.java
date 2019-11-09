package pangu.domain;

import java.io.Serializable;
import java.util.Date;

public class LoginUser implements Serializable {
    private int id;
    private Date gmtCreate;
    private Date gmtModified;
    private String login_name;
    private String password;

    public LoginUser(int id, Date gmtCreate, Date gmtModified, String login_name, String password) {
        this.id = id;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
        this.login_name = login_name;
        this.password = password;

    }

    public LoginUser() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getLogin_name() {
        return login_name;
    }

    public void setLogin_name(String login_name) {
        this.login_name = login_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}