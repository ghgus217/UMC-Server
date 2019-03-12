package kr.ac.ajou.umc.service.collection;

import kr.ac.ajou.umc.GpsDistanceCalc;
import kr.ac.ajou.umc.TruckSearchScore;
import kr.ac.ajou.umc.controller.collection.MainPageController;
import kr.ac.ajou.umc.repository.collection.MainPageRepository;
import kr.ac.ajou.umc.vo.collection.MainPageGpsVO;
import kr.ac.ajou.umc.vo.collection.MainPageSearchVO;
import kr.ac.ajou.umc.vo.collection.MainPageTruckScoreVO;
import kr.ac.ajou.umc.vo.collection.MainPageVO;
import kr.ac.ajou.umc.vo.event.EventSearchListVO;
import kr.ac.ajou.umc.vo.truck.TruckSearchListVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class MainPageService {

    private Logger logger = LoggerFactory.getLogger(MainPageService.class);

    @Autowired
    private MainPageRepository repository;

    public MainPageVO getMainPageInfo(MainPageGpsVO gps)
    {
        List<TruckSearchListVO> truckList = repository.getTruckList();
        List<EventSearchListVO> eventList = repository.getEventList();


        //gps값을 이용하여 가까운 거리 순으로 정렬
        //디폴트값 km 단위 기준으로 상위 표출
        GpsDistanceCalc calc = GpsDistanceCalc.getGpsDistanceCaculator();

        //GPS 트럭거리 계산
        for(int list_size = 0 ; list_size < truckList.size() ; list_size++)
        {
            double dist = calc.distance(truckList.get(list_size).getLat(), truckList.get(list_size).getLon(), gps.getLat(), gps.getLon(),"kilometer");
            truckList.get(list_size).setDistance(dist);
        }

        //GPS 트럭거리 순으로 정렬
        calc.truckBubbleSort(truckList);

        //GPS 이벤트거리 계산
        for(int list_size = 0 ; list_size < eventList.size() ; list_size++)
        {
            double dist = calc.distance(eventList.get(list_size).getLat(), eventList.get(list_size).getLon(), gps.getLat(), gps.getLon(),"kilometer");
            eventList.get(list_size).setDistance(dist);
        }

        //GPS 이벤트거리 순으로 정렬
        calc.eventBubbleSort(eventList);

        MainPageVO mpvo = new MainPageVO();

        mpvo.setTruckList(truckList);
        mpvo.setEventList(eventList);

        return mpvo;
    }

    public MainPageSearchVO getMainPageSearch(String keywords, MainPageGpsVO gps)
    {
        String[] keyword = keywords.split(" ");

        List<TruckSearchListVO> truckList = new ArrayList<TruckSearchListVO>();
        List<EventSearchListVO> eventList = new ArrayList<EventSearchListVO>();

        //키워드 나누어서 검색
        for(int index = 0 ; index < keyword.length ; index++)
        {
            truckList.addAll(repository.getTruckListWithKeyWord(keyword[index]));
            eventList.addAll(repository.getEventListWithKeyWord(keyword[index]));
        }


        //검색결과 아무것도 없는 경우
        if(truckList.size() == 0)
        {
            truckList.addAll(repository.getTruckList());
            List<MainPageTruckScoreVO> list = repository.calcTruckScore();
            List<TruckSearchScore> calc = new ArrayList<TruckSearchScore>();
        }
        if(eventList.size() == 0)
            eventList.addAll(repository.getEventList());



        //gps값을 이용하여 가까운 거리 순으로 정렬
        //디폴트값 km 단위 기준으로 상위 표출
        GpsDistanceCalc calc = GpsDistanceCalc.getGpsDistanceCaculator();

        //GPS 트럭거리 계산
        for(int list_size = 0 ; list_size < truckList.size() ; list_size++)
        {
            double dist = calc.distance(truckList.get(list_size).getLat(), truckList.get(list_size).getLon(), gps.getLat(), gps.getLon(),"kilometer");
            truckList.get(list_size).setDistance(dist);
        }

        //GPS 트럭거리 순으로 정렬
        calc.truckBubbleSort(truckList);

        //GPS 이벤트거리 계산
        for(int list_size = 0 ; list_size < eventList.size() ; list_size++)
        {
            double dist = calc.distance(eventList.get(list_size).getLat(), eventList.get(list_size).getLon(), gps.getLat(), gps.getLon(),"kilometer");
            eventList.get(list_size).setDistance(dist);
        }

        //GPS 이벤트거리 순으로 정렬
        calc.eventBubbleSort(eventList);


        MainPageSearchVO mpsvo = new MainPageSearchVO();

        mpsvo.setTruckList(truckList);
        mpsvo.setEventList(eventList);

        return mpsvo;
    }

}
