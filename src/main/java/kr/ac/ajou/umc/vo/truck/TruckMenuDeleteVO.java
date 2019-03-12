package kr.ac.ajou.umc.vo.truck;

import io.swagger.annotations.ApiModelProperty;

public class TruckMenuDeleteVO {

    @ApiModelProperty(notes = "트럭 id")
    private long truckId;

    @ApiModelProperty(notes = "음식 이름")
    private String foodName;

    public long getTruckId() {
        return truckId;
    }

    public void setTruckId(long truckId) {
        this.truckId = truckId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }
}
