package kr.ac.ajou.umc.service.user;

import kr.ac.ajou.umc.GpsDistanceCalc;
import kr.ac.ajou.umc.repository.user.UserFavoriteListRepository;
import kr.ac.ajou.umc.vo.truck.TruckDescriptionVO;
import kr.ac.ajou.umc.vo.truck.TruckGpsVO;
import kr.ac.ajou.umc.vo.truck.TruckSearchListVO;
import kr.ac.ajou.umc.vo.user.UserFavoriteListVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserFavoriteListService {

    @Autowired
    private UserFavoriteListRepository repository;

    public List<UserFavoriteListVO> getUserFavoriteList()
    {
        return repository.getUserFavoriteList();
    }

    public List<TruckSearchListVO> searchUserFavoriteListWithUserId(long userId, TruckGpsVO gps)
    {
        List<TruckSearchListVO> result = repository.searchUserFavoriteListWithUserId(userId);

        //gps값을 이용하여 가까운 거리 순으로 정렬
        //디폴트값 km 단위 기준으로 상위 표출
        GpsDistanceCalc calc = GpsDistanceCalc.getGpsDistanceCaculator();

        //GPS 거리 계산
        for(int list_size = 0 ; list_size < result.size() ; list_size++)
        {
            double dist = calc.distance(result.get(list_size).getLat(), result.get(list_size).getLon(), gps.getLat(), gps.getLon(),"kilometer");
            result.get(list_size).setDistance(dist);
        }

        //GPS 거리 순으로 정렬
        calc.truckBubbleSort(result);

        return result;
    }

    public void addUserFavoriteList(UserFavoriteListVO uflvo)
    {
        repository.addUserFavoriteList(uflvo);
    }

    /*
    public void updateUserFavoriteList(UserFavoriteListVO uflvo)
    {
        repository.updateUserFavoriteList(uflvo);
    }
    */

    public void deleteUserFavoriteList(UserFavoriteListVO uflvo)
    {
        repository.deleteUserFavoriteList(uflvo);
    }
}
