package kr.ac.ajou.umc.repository.truck;

import kr.ac.ajou.umc.vo.truck.TruckMenuDeleteVO;
import kr.ac.ajou.umc.vo.truck.TruckMenuVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface TruckMenuRepository {

    List<TruckMenuVO> getTruckMenuList();
    List<TruckMenuVO> searchTruckMenuWithTruckId(long truckId);
    void addTruckMenu(TruckMenuVO tmvo);
    void updateTruckMenu(TruckMenuVO tmvo);
    void deleteTruckMenu(TruckMenuDeleteVO tmvo);
    void deleteWholeTruckMenu(long truckId);
}
