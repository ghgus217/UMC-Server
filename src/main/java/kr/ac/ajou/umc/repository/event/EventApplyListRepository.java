package kr.ac.ajou.umc.repository.event;

import kr.ac.ajou.umc.vo.event.EventApplyListCreateVO;
import kr.ac.ajou.umc.vo.event.EventApplyListVO;
import kr.ac.ajou.umc.vo.event.EventApplySearchVO;
import kr.ac.ajou.umc.vo.event.EventSearchListVO;
import kr.ac.ajou.umc.vo.truck.TruckSearchListVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Repository
@Mapper
public interface  EventApplyListRepository {
    List<EventApplyListVO> getEventApplyList();
    List<EventSearchListVO> searchWithUserId(long userId);
    List<TruckSearchListVO> searchWithEventId(long eventId);
    List<EventSearchListVO> searchUserEventWithUserId(long truckId);
    void addEventApplyList(EventApplyListCreateVO ealc);
    void updateEventList(EventApplyListVO eavo);
    void deleteEventList(EventApplyListVO eavo);
}
