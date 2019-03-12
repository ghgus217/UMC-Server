package kr.ac.ajou.umc.service.event;

import kr.ac.ajou.umc.repository.event.EventMapRepository;
import kr.ac.ajou.umc.vo.event.EventMapCreateVO;
import kr.ac.ajou.umc.vo.event.EventMapSearchVO;
import kr.ac.ajou.umc.vo.event.EventMapUpdateVO;
import kr.ac.ajou.umc.vo.event.EventMapVO;
import org.apache.catalina.servlet4preview.http.PushBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventMapService {

    @Autowired
    private EventMapRepository repository;

    public List<EventMapSearchVO> getEventMapList()
    {
        return repository.getEventMapList();
    }

    public List<EventMapSearchVO> searchEventMapWithEventId(long eventId)
    {
        return repository.searchEventMapWithEventId(eventId);
    }

    public void addEventMap(EventMapCreateVO emvo)
    {
        repository.addEventMap(emvo);
    }

    public void updateEventMap(EventMapUpdateVO emvo)
    {
        repository.updateEventMap(emvo);
    }

    public void deleteEventMap(long eventMapId)
    {
        repository.deleteEventMap(eventMapId);
    }

    public void deleteEventMapWhole(long eventId)
    {
        repository.deleteEventMapWhole(eventId);
    }
}
