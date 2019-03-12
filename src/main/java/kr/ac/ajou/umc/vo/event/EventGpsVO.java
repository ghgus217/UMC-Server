package kr.ac.ajou.umc.vo.event;

import io.swagger.annotations.ApiModelProperty;

public class EventGpsVO {

    @ApiModelProperty(notes = "사용자 위도")
    private double lat;

    @ApiModelProperty(notes = "사용자 경도")
    private double lon;


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
}
