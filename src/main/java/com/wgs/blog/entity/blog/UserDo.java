package com.wgs.blog.entity.blog;

import java.io.Serializable;
import java.util.Date;

public class UserDo implements Serializable {
    private Integer id;

    private String name;

    private String password;

    private String nickname;

    private String phone;

    private String email;

    private String pie;

    private String sex;

    private Date birthday;

    private String describe;

    private static final long serialVersionUID = 1L;

    public UserDo(Integer id, String name, String password, String nickname, String phone, String email, String pie, String sex, Date birthday, String describe) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.nickname = nickname;
        this.phone = phone;
        this.email = email;
        this.pie = pie;
        this.sex = sex;
        this.birthday = birthday;
        this.describe = describe;
    }

    public UserDo() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPie() {
        return pie;
    }

    public void setPie(String pie) {
        this.pie = pie == null ? null : pie.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", password=").append(password);
        sb.append(", nickname=").append(nickname);
        sb.append(", phone=").append(phone);
        sb.append(", email=").append(email);
        sb.append(", pie=").append(pie);
        sb.append(", sex=").append(sex);
        sb.append(", birthday=").append(birthday);
        sb.append(", describe=").append(describe);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}