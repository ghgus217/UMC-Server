package kr.ac.ajou.umc.vo.collection;

import io.swagger.annotations.ApiModelProperty;

public class MainPageTruckScoreVO {

    @ApiModelProperty(notes = "primary key")
    private long id;

    @ApiModelProperty(notes = "score")
    private int score;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
