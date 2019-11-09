package pangu.domain;

import java.util.Date;

public class BasicInformation {
    private int id;
    private Date gmtCreate;
    private Date gmtModified;
    private String username;
    private Date birthday;
    private int sex;
    private String address;
    private String phoneNumber;
    private String mail;
    private int identity;
    private String workTime;
    private String introduce;
    private int userID;

    public BasicInformation(int id, Date gmtCreate, Date gmtModified, String username, Date birthday, int sex, String address, String phoneNumber, String mail, int identity, String workTime, String introduce, int userID) {
        this.id = id;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
        this.username = username;
        this.birthday = birthday;
        this.sex = sex;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.mail = mail;
        this.identity = identity;
        this.workTime = workTime;
        this.introduce = introduce;
        this.userID = userID;
    }

    public BasicInformation() {
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getIdentity() {
        return identity;
    }

    public void setIdentity(int identity) {
        this.identity = identity;
    }

    public String getWorkTime() {
        return workTime;
    }

    public void setWorkTime(String workTime) {
        this.workTime = workTime;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
}
