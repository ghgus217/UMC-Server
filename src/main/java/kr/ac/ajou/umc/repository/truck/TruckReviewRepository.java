package kr.ac.ajou.umc.repository.truck;

import kr.ac.ajou.umc.vo.truck.*;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface TruckReviewRepository {

    List<TruckReviewVO> getTruckReviewList();
    List<TruckReviewVO> searchTruckReviewWithTruckId(long truckId);
    List<TruckScoreVO> calcTruckScore(long truckId);
    void addTruckReview(TruckReviewCreateVO trvo);
    void updateTruckReview(TruckReviewUpdateVO trvo);
    void deleteTruckReview(TruckReviewDeleteVO tedvo);

}
