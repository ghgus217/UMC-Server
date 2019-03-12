package kr.ac.ajou.umc.repository.event;

import kr.ac.ajou.umc.vo.event.*;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface EventRepository {

    List<EventVO> getEventList();
    List<EventSearchListVO> searchWithEventName(String eventTitle);
    EventDescriptionVO searchWithEventId(long eventId);
    List<EventDescriptionVO> searchWithUserId(long userId);
    void addEvent(EventCreateVO event);
    void updateEvent(EventUpdateVO event);
    void updateEventImage(EventImageUpdateVO event);
    void deleteEvent(long eventId);
}
