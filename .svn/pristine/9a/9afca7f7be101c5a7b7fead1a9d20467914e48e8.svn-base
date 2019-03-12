package kr.ac.ajou.umc.repository.user;

import kr.ac.ajou.umc.vo.truck.TruckDescriptionVO;
import kr.ac.ajou.umc.vo.truck.TruckSearchListVO;
import kr.ac.ajou.umc.vo.user.UserFavoriteListVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserFavoriteListRepository {

    List<UserFavoriteListVO> getUserFavoriteList();
    List<TruckSearchListVO> searchUserFavoriteListWithUserId(long userId);
    void addUserFavoriteList(UserFavoriteListVO uflvo);
    //void updateUserFavoriteList(UserFavoriteListVO uflvo);
    void deleteUserFavoriteList(UserFavoriteListVO uflvo);

}
