package kr.ac.ajou.umc.controller.truck;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import kr.ac.ajou.umc.service.truck.TruckMenuService;
import kr.ac.ajou.umc.vo.truck.TruckMenuDeleteVO;
import kr.ac.ajou.umc.vo.truck.TruckMenuVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(description = "트럭 메뉴 api")
@RestController
public class TruckMenuController {

    Logger logger = LoggerFactory.getLogger(TruckMenuController.class);

    @Autowired
    public TruckMenuService service;

    @ApiOperation(value = "전체 메뉴 목록 조회")
    @GetMapping("/truckmenus")
    public List<TruckMenuVO> showTruckMenuList()
    {
        logger.info("SHOW MENU LIST");

        return service.getTruckMenuList();
    }

    @ApiOperation(value = "트럭id로 메뉴 조회")
    @GetMapping("/truckmenus/{truckId}")
    public List<TruckMenuVO> searchTruckMenuWithTruckId(@PathVariable long truckId)
    {
        logger.info("트럭 ID로 메뉴 조회");

        return service.searchTruckMenuWithTruckId(truckId);
    }

    @ApiOperation(value = "트럭id로 메뉴 추가")
    @PostMapping("/truckmenu/{truckId}")
    public void addTruckMenu(@PathVariable long truckId, @RequestBody TruckMenuVO tmvo)
    {
        tmvo.setTruckId(truckId);
        service.addTruckMenu(tmvo);
    }

    @ApiOperation(value = "트럭id로 메뉴 수정")
    @PutMapping("/truckmenu/{truckId}")
    public void updateTruckMenu(@PathVariable long truckId, @RequestBody TruckMenuVO tmvo)
    {
        tmvo.setTruckId(truckId);
        service.updateTruckMenu(tmvo);
    }

    @ApiOperation(value = "메뉴 삭제")
    @DeleteMapping("/truckmenu")
    public void deleteTruckMenu(@RequestBody TruckMenuDeleteVO tmvo)
    {
        service.deleteTruckMenu(tmvo);
    }

    @ApiOperation(value = "트럭 id로 해당 트럭 메뉴 전체 삭제")
    @DeleteMapping("/truckmenu/{truckId}")
    public void deleteWholeTruckMenu(@PathVariable long truckId)
    {
        service.deleteWholeTruckMenu(truckId);
    }

}
