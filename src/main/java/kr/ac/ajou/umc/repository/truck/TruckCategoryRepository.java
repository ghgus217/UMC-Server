package kr.ac.ajou.umc.repository.truck;

import kr.ac.ajou.umc.vo.truck.TruckCategoryVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface TruckCategoryRepository {
    List<TruckCategoryVO> getTruckCategoryList();
    void addTruckCategory(TruckCategoryVO tcvo);
    void updateTruckCategory(TruckCategoryVO tcvo);
    void deleteTruckCategory(TruckCategoryVO tcvo);
}
