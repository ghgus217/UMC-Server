package kr.ac.ajou.umc.repository.truck;

import kr.ac.ajou.umc.vo.truck.TruckDocumentLinkVO;
import kr.ac.ajou.umc.vo.truck.TruckDocumentVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface TruckDocumentRepository {
    List<TruckDocumentVO> getTruckDocumentList();
    List<TruckDocumentLinkVO> getTruckDocumentImage(long truckId);
    void addTruckDocument(TruckDocumentVO tdvo);
    void updateTruckDocument(TruckDocumentVO tdvo);
    void deleteTruckDocument(TruckDocumentVO tdvo);
}
