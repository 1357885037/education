package com.zhongsheng.education.entiy;

import java.util.Date;

public class Student {
    //学生id
    private int sid;
    //校区
    private String campus;

    //学校名称
    private String schoolname;
    //学生名字
    private String sname;

    //性别
    private String sex;
    //年级
    private String grade;
    //专业
    private String major;
    //手机号码
    private int phone;
    //班次
    private String classes;

    //缴费金额
    private String money;
    //报名日期
    private Date signupdate;
    //补费日期
    private Date addmoneydate;
    //缴费方式
    private String paymethod;
    //意向专业
    private String Stringentionmajor;
    //公共课
    private String publiccours;
    //专业课
    private String majorcours;
    //校区负责人
    private String campusmanager;
    //校园代理
    private String campusagent;
    //线上上课轮数
    private int onlinenumber;
    //线下上课轮数
    private int offlinenumber;
    //职务
    private String job;
    //家属紧急联系方式
    private int homephoneid;
    //校园紧急联系方式
    private int schoolphoneid;
    //收件家庭住址
    private String homeaddress;
    //身份证号
    private String idcard;
    //date生日
    private Date birthday;
    //民族
    private String nation;
    //备注
    private String remarks;
    //积分
    private int score;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public Date getSignupdate() {
        return signupdate;
    }

    public void setSignupdate(Date signupdate) {
        this.signupdate = signupdate;
    }

    public Date getAddmoneydate() {
        return addmoneydate;
    }

    public void setAddmoneydate(Date addmoneydate) {
        this.addmoneydate = addmoneydate;
    }

    public String getPaymethod() {
        return paymethod;
    }

    public void setPaymethod(String paymethod) {
        this.paymethod = paymethod;
    }

    public String getStringentionmajor() {
        return Stringentionmajor;
    }

    public void setStringentionmajor(String stringentionmajor) {
        Stringentionmajor = stringentionmajor;
    }

    public String getPubliccours() {
        return publiccours;
    }

    public void setPubliccours(String publiccours) {
        this.publiccours = publiccours;
    }

    public String getMajorcours() {
        return majorcours;
    }

    public void setMajorcours(String majorcours) {
        this.majorcours = majorcours;
    }

    public String getCampusmanager() {
        return campusmanager;
    }

    public void setCampusmanager(String campusmanager) {
        this.campusmanager = campusmanager;
    }

    public String getCampusagent() {
        return campusagent;
    }

    public void setCampusagent(String campusagent) {
        this.campusagent = campusagent;
    }

    public int getOnlinenumber() {
        return onlinenumber;
    }

    public void setOnlinenumber(int onlinenumber) {
        this.onlinenumber = onlinenumber;
    }

    public int getOfflinenumber() {
        return offlinenumber;
    }

    public void setOfflinenumber(int offlinenumber) {
        this.offlinenumber = offlinenumber;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getHomephoneid() {
        return homephoneid;
    }

    public void setHomephoneid(int homephoneid) {
        this.homephoneid = homephoneid;
    }

    public int getSchoolphoneid() {
        return schoolphoneid;
    }

    public void setSchoolphoneid(int schoolphoneid) {
        this.schoolphoneid = schoolphoneid;
    }

    public String getHomeaddress() {
        return homeaddress;
    }

    public void setHomeaddress(String homeaddress) {
        this.homeaddress = homeaddress;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "student{" +
                "sid=" + sid +
                ", campus='" + campus + '\'' +
                ", schoolname='" + schoolname + '\'' +
                ", sname='" + sname + '\'' +
                ", sex='" + sex + '\'' +
                ", grade='" + grade + '\'' +
                ", major='" + major + '\'' +
                ", phone=" + phone +
                ", classes='" + classes + '\'' +
                ", money='" + money + '\'' +
                ", signupdate=" + signupdate +
                ", addmoneydate=" + addmoneydate +
                ", paymethod='" + paymethod + '\'' +
                ", Stringentionmajor='" + Stringentionmajor + '\'' +
                ", publiccours='" + publiccours + '\'' +
                ", majorcours='" + majorcours + '\'' +
                ", campusmanager='" + campusmanager + '\'' +
                ", campusagent='" + campusagent + '\'' +
                ", onlinenumber=" + onlinenumber +
                ", offlinenumber=" + offlinenumber +
                ", job='" + job + '\'' +
                ", homephoneid=" + homephoneid +
                ", schoolphoneid=" + schoolphoneid +
                ", homeaddress='" + homeaddress + '\'' +
                ", idcard='" + idcard + '\'' +
                ", birthday=" + birthday +
                ", nation='" + nation + '\'' +
                ", remarks='" + remarks + '\'' +
                ", score=" + score +
                '}';
    }
}
