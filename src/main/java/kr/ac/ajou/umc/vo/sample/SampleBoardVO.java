package kr.ac.ajou.umc.vo.sample;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

public class SampleBoardVO {
    @ApiModelProperty(notes = "primary key", required = true)
    private long id;

    @ApiModelProperty(notes = "제목")
    private String title;

    @ApiModelProperty(notes = "내용")
    private String content;

    @ApiModelProperty(notes = "생성일")
    private Date createAt;

    @ApiModelProperty(notes = "최근 수정일")
    private Date modifyAt;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getModifyAt() {
        return modifyAt;
    }

    public void setModifyAt(Date modifyAt) {
        this.modifyAt = modifyAt;
    }
}
