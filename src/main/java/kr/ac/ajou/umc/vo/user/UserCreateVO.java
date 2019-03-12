package kr.ac.ajou.umc.vo.user;

import io.swagger.annotations.ApiModelProperty;

public class UserCreateVO {

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
}
