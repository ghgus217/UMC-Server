package kr.ac.ajou.umc;

import kr.ac.ajou.umc.vo.event.EventSearchListVO;
import kr.ac.ajou.umc.vo.truck.TruckSearchListVO;

import java.util.List;

public class GpsDistanceCalc {

    private static GpsDistanceCalc calc;


    /**
     * 두 지점간의 거리 계산
     * @param lat1 지점 1 위도
     * @param lon1 지점 1 경도
     * @param lat2 지점 2 위도
     * @param lon2 지점 2 경도
     * @param unit 거리 표출단위
     * @return
     **/
    public double distance(double lat1, double lon1, double lat2, double lon2, String unit) {

        double theta = lon1 - lon2;
        double dist = Math.sin(deg2rad(lat1)) * Math.sin(deg2rad(lat2)) + Math.cos(deg2rad(lat1)) * Math.cos(deg2rad(lat2)) * Math.cos(deg2rad(theta));

        dist = Math.acos(dist);
        dist = rad2deg(dist);
        dist = dist * 60 * 1.1515;

        if (unit == "kilometer") {
            dist = dist * 1.609344;
        } else if(unit == "meter"){
            dist = dist * 1609.344;
        }

        return dist;
    }


    // 데시멀 to 라디안
    private static double deg2rad(double deg) {
        return (deg * Math.PI / 180.0);
    }

    // 라디안 to 데시멀
    private static double rad2deg(double rad) {
        return (rad * 180 / Math.PI);
    }

    //이벤트 소팅
    public List<EventSearchListVO> eventBubbleSort(List<EventSearchListVO> list)
    {
        int size = list.size();
        for(int index = size-1 ; index > 0 ; index--) {
            for (int check = 0; check < index; check++) {
                if (list.get(check).getDistance() > list.get(check + 1).getDistance()) {
                    double temp = list.get(check).getDistance();
                    list.get(check + 1).setDistance(list.get(check).getDistance());
                    list.get(check).setDistance(temp);
                }
            }
        }

        return list;
    }

    //트럭 소팅
    public List<TruckSearchListVO> truckBubbleSort(List<TruckSearchListVO> list)
    {
        int size = list.size();
        for(int index = size-1 ; index > 0 ; index--) {
            for (int check = 0; check < index; check++) {
                if (list.get(check).getDistance() > list.get(check + 1).getDistance()) {
                    double temp = list.get(check).getDistance();
                    list.get(check + 1).setDistance(list.get(check).getDistance());
                    list.get(check).setDistance(temp);
                }
            }
        }

        return list;
    }


    public static GpsDistanceCalc getGpsDistanceCaculator()
    {
        if(calc == null)
            calc = new GpsDistanceCalc();

        return calc;
    }
}
