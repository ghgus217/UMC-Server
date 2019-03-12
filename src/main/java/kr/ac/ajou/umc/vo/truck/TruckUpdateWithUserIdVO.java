package kr.ac.ajou.umc.vo.truck;

import io.swagger.annotations.ApiModelProperty;

public class TruckUpdateWithUserIdVO {

    @ApiModelProperty(notes = "푸드트럭 사용자의 userId")
    private long userId;

    @ApiModelProperty(notes = "트럭 이름")
    private String truckName;

    @ApiModelProperty(notes = "트럭 위도 lat")
    private double lat;

    @ApiModelProperty(notes = "트럭 경도 lon")
    private double lon;

    @ApiModelProperty(notes = "트럭 세부내용")
    private String description;

    @ApiModelProperty(notes = "트럭 이미지 위치")
    private String imageLink;

    @ApiModelProperty(notes = "트럭 시작시간")
    private String startTime;

    @ApiModelProperty(notes = "트럭 종료시간")
    private String endTime;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getTruckName() {
        return truckName;
    }

    public void setTruckName(String truckName) {
        this.truckName = truckName;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
