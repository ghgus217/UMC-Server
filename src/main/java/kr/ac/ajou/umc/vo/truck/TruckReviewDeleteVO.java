package kr.ac.ajou.umc.vo.truck;

import io.swagger.annotations.ApiModelProperty;

public class TruckReviewDeleteVO {
    @ApiModelProperty(notes = "트럭 id")
    private long truckId;

    @ApiModelProperty(notes = "사용자 id")
    private long userId;

    public long getTruckId() {
        return truckId;
    }

    public void setTruckId(long truckId) {
        this.truckId = truckId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }
}
