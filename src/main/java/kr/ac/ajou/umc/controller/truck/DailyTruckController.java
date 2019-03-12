package kr.ac.ajou.umc.controller.truck;

import kr.ac.ajou.umc.service.truck.DailyTruckService;
import kr.ac.ajou.umc.vo.truck.DailyTruckVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DailyTruckController {

    Logger logger = LoggerFactory.getLogger(DailyTruckController.class);

    @Autowired
    public DailyTruckService service;

    @GetMapping("/dailytrucks")
    public List<DailyTruckVO> showDailyTruckList()
    {
        logger.info("SHOW DAILY TRUCK LIST");

        return service.getDailyTruckList();
    }

    @PostMapping("/dailytruck/{truckId}")
    public void addDailyTruck(@PathVariable long truckId, DailyTruckVO dtvo)
    {
        service.addDailyTruck(dtvo);
    }

    @PutMapping("/dailytruck/{truckId}")
    public void updateDailyTruck(@PathVariable long truckId, DailyTruckVO dtvo)
    {
        service.updateDailyTruck(dtvo);
    }

    @DeleteMapping("/dailytruck/{truckId}")
    public void deleteDailyTruck(@PathVariable long truckId, DailyTruckVO dtvo)
    {
        service.deleteDailyTruck(dtvo);
    }

}
