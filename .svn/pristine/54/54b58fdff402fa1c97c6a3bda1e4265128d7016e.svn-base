package kr.ac.ajou.umc.controller.event;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import kr.ac.ajou.umc.service.event.EventMapService;
import kr.ac.ajou.umc.vo.event.EventMapCreateVO;
import kr.ac.ajou.umc.vo.event.EventMapSearchVO;
import kr.ac.ajou.umc.vo.event.EventMapUpdateVO;
import kr.ac.ajou.umc.vo.event.EventMapVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(description = "행사장 지도 API")
@RestController
public class EventMapController {

    Logger logger = LoggerFactory.getLogger(EventApplyListController.class);

    @Autowired
    public EventMapService service;

    @ApiOperation(value = "전체 행사장 지도 조회")
    @GetMapping("/eventMaps")
    public List<EventMapSearchVO> showEventMapList()
    {
        logger.info("SHOW EVENT MAP List");

        return service.getEventMapList();
    }

    @ApiOperation(value = "이벤트 id로 행사장 지도 조회")
    @GetMapping("/eventMap/{eventId}")
    public List<EventMapSearchVO> searchEventMapWithEventId(long eventId)
    {
        logger.info("SHOW EVENT MAP With eventID");

        return service.searchEventMapWithEventId(eventId);
    }

    @ApiOperation(value = "이벤트 id로 행사장 지도의 하나의 positon 추가")
    @PostMapping("/eventMap/{eventId}")
    public void addEventMap(@PathVariable long eventId, EventMapCreateVO emvo)
    {
        logger.info("이벤트 id로 행사장 지도 추가");

        emvo.setEventId(eventId);

        service.addEventMap(emvo);
    }

    @ApiOperation(value = "eventmapId 로 행사장 지도의 하나의 positon  수정")
    @PutMapping("/eventMap/{eventmapId}")
    public void updateEventMap(@PathVariable long eventmapId, EventMapUpdateVO emvo)
    {
        logger.info("이벤트 지도 수정");

        emvo.setId(eventmapId);

        service.updateEventMap(emvo);
    }

    @ApiOperation(value = "eventmapId 로 행사장 지도의 하나의 positon  삭제")
    @DeleteMapping("/eventMap/{eventmapId}")
    public void deleteEventMap(@PathVariable long eventMapId)
    {
        service.deleteEventMap(eventMapId);
    }

    @ApiOperation(value = "eventId 로 행사장 지도 전체 삭제")
    @DeleteMapping("/eventWholeMap/{eventId}")
    public void deleteEventMapWhole(@PathVariable long eventId)
    {
        service.deleteEventMapWhole(eventId);
    }

}
