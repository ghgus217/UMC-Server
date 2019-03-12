package kr.ac.ajou.umc.controller.event;

import kr.ac.ajou.umc.service.event.EventPreferenceMapService;
import kr.ac.ajou.umc.vo.event.EventPreferenceMapVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EventPreferenceMapController {

    Logger logger = LoggerFactory.getLogger(EventApplyListController.class);

    @Autowired
    private EventPreferenceMapService service;

    @GetMapping("/eventpreferencemaps")
    public List<EventPreferenceMapVO> showEventPreferenceMapList()
    {
        logger.info("SHOW EVENT PREFERENCE MAP");

        return service.getEventPreferenceMapList();
    }

    @PostMapping("/eventpreferencemap/{eventId}")
    public void addEventPreferenceMap(@PathVariable long eventId, EventPreferenceMapVO epmvo)
    {
        service.addEventPreferenceMap(epmvo);
    }

    @PutMapping("/eventpreferencemap/{eventId}")
    public void updateEventPreferenceMap(@PathVariable long eventId, EventPreferenceMapVO epmvo)
    {
        service.updateEventPreferenceMap(epmvo);
    }

    @DeleteMapping("/eventpreferencemap/{eventId}")
    public void deleteEventPreferenceMap(@PathVariable long eventId, EventPreferenceMapVO epmvo)
    {
        service.deleteEventPreferenceMap(epmvo);
    }
}
