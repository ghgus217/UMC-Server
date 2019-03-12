package kr.ac.ajou.umc.vo.user;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

public class UserVO {
    @ApiModelProperty(notes = "primary key 값")
    private long id;

    @ApiModelProperty(notes = "로그인 아이디")
    private String loginId;

    @ApiModelProperty(notes = "사용자 카테고리(일반,트럭사업자,행사관계자)")
    private long userCategoryId;

    @ApiModelProperty(notes = "패스워드")
    private String pw;

    @ApiModelProperty(notes = "이름")
    private String name;

    @ApiModelProperty(notes = "핸드폰번호")
    private String phoneNum;

    @ApiModelProperty(notes = "마지막으로 수정된 시간")
    private Date modifyTime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public long getUserCategoryId() {
        return userCategoryId;
    }

    public void setUserCategoryId(long userCategoryId) {
        this.userCategoryId = userCategoryId;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}
