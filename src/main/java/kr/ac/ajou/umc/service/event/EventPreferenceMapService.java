package kr.ac.ajou.umc.service.event;

import kr.ac.ajou.umc.repository.event.EventPreferenceMapRepository;
import kr.ac.ajou.umc.vo.event.EventPreferenceMapVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventPreferenceMapService {

    @Autowired
    private EventPreferenceMapRepository repository;

    public List<EventPreferenceMapVO> getEventPreferenceMapList()
    {
        return repository.getEventPreferenceMapList();
    }

    public void addEventPreferenceMap(EventPreferenceMapVO epmvo)
    {
        repository.addEventPreferenceMap(epmvo);
    }

    public void updateEventPreferenceMap(EventPreferenceMapVO epmvo)
    {
        repository.updateEventPreferenceMap(epmvo);
    }

    public void deleteEventPreferenceMap(EventPreferenceMapVO epmvo)
    {
        repository.deleteEventPreferenceMap(epmvo);
    }
}
