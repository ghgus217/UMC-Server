package kr.ac.ajou.umc.service.truck;

import kr.ac.ajou.umc.repository.truck.TruckReviewRepository;
import kr.ac.ajou.umc.vo.truck.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TruckReviewService {

    @Autowired
    private TruckReviewRepository repository;

    public List<TruckReviewVO> getTruckReviewList()
    {
        return repository.getTruckReviewList();
    }

    public List<TruckReviewVO> searchTruckReviewWithTruckId(long truckId)
    {
        return repository.searchTruckReviewWithTruckId(truckId);
    }

    public int calcTruckScore(long truckId)
    {
        List<TruckScoreVO> list = repository.calcTruckScore(truckId);

        long mid = 0;

        //평균 계산
        for(int index = 0; index < list.size() ; index++)
            mid += list.get(index).getScore();
        mid /= list.size();

        long sd = 0;

        //표준편차 계산
        for(int index = 0; index < list.size() ; index++)
            sd += Math.sqrt(((mid)^2) - ((list.get(index).getScore())^2));
        sd /= list.size();

        long zScore = (((mid-sd) + (mid+sd))/2);
        int result = (int) zScore;


        return result;
    }

    public void addTruckReview(TruckReviewCreateVO trvo)
    {
        repository.addTruckReview(trvo);
    }

    public void updateTruckReview(TruckReviewUpdateVO trvo)
    {
        repository.updateTruckReview(trvo);
    }

    public void deleteTruckReview(TruckReviewDeleteVO tedvo)
    {
        repository.deleteTruckReview(tedvo);
    }
}
