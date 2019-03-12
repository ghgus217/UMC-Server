package kr.ac.ajou.umc.vo.truck;

import io.swagger.annotations.ApiModelProperty;

public class TruckMenuVO {

    @ApiModelProperty(notes = "트럭 id")
    private long truckId;

    @ApiModelProperty(notes = "음식 이름")
    private String foodName;

    @ApiModelProperty(notes = "세부내용")
    private String description;

    @ApiModelProperty(notes = "가격")
    private int price;

    @ApiModelProperty(notes = "이미지 경로")
    private String imageLink;


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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }
}
