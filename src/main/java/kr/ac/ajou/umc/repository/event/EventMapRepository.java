package kr.ac.ajou.umc.repository.event;

import kr.ac.ajou.umc.vo.event.EventMapCreateVO;
import kr.ac.ajou.umc.vo.event.EventMapSearchVO;
import kr.ac.ajou.umc.vo.event.EventMapUpdateVO;
import kr.ac.ajou.umc.vo.event.EventMapVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface EventMapRepository {
    List<EventMapSearchVO> getEventMapList();
    List<EventMapSearchVO> searchEventMapWithEventId(long eventId);
    void addEventMap(EventMapCreateVO emvo);
    void updateEventMap(EventMapUpdateVO emvo);
    void deleteEventMap(long eventMapId);
    void deleteEventMapWhole(long eventId);
}
