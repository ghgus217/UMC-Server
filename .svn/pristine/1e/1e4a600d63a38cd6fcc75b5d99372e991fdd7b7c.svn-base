package kr.ac.ajou.umc.service.event;

import kr.ac.ajou.umc.repository.event.EventApplyListRepository;
import kr.ac.ajou.umc.vo.event.EventApplyListCreateVO;
import kr.ac.ajou.umc.vo.event.EventApplyListVO;
import kr.ac.ajou.umc.vo.event.EventApplySearchVO;
import kr.ac.ajou.umc.vo.event.EventSearchListVO;
import kr.ac.ajou.umc.vo.truck.TruckSearchListVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class EventApplyListService {

    @Autowired
    private EventApplyListRepository repository;

    public List<EventApplyListVO> getEventApplyList()
    {
        return repository.getEventApplyList();
    }

    public List<EventSearchListVO> searchWithUserId(long userId)
    {
        return repository.searchWithUserId(userId);
    }

    public List<TruckSearchListVO> searchWithEventId(long eventId)
    {
        return repository.searchWithEventId(eventId);
    }

    public List<EventSearchListVO> searchUserEventWithUserId(long truckId)
    {
        return repository.searchUserEventWithUserId(truckId);
    }

    public void addEventApplyList(EventApplyListCreateVO ealc)
    {
        repository.addEventApplyList(ealc);
    }

    public void updateEventList(EventApplyListVO eavo)
    {
        repository.updateEventList(eavo);
    }

    public void deleteEventList(EventApplyListVO eavo)
    {
        repository.deleteEventList(eavo);
    }
}
