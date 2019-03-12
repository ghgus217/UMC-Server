package kr.ac.ajou.umc.repository.truck;

import kr.ac.ajou.umc.vo.truck.DailyTruckVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface DailyTruckRepository {

    List<DailyTruckVO> getDailyTruckList();
    void addDailyTruck(DailyTruckVO dtvo);
    void updateDailyTruck(DailyTruckVO dtvo);
    void deleteDailyTruck(DailyTruckVO dtvo);

}
