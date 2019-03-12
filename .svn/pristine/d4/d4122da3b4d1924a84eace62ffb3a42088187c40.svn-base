package kr.ac.ajou.umc.controller.truck;

import kr.ac.ajou.umc.service.truck.TruckCategoryService;
import kr.ac.ajou.umc.vo.truck.TruckCategoryVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TruckCategoryController {

    Logger logger = LoggerFactory.getLogger(TruckCategoryController.class);

    @Autowired
    private TruckCategoryService service;

    @GetMapping("/truckcategorys")
    public List<TruckCategoryVO> showTruckCategoryList()
    {
        logger.info("SHOW TRUCK CATEGORY LIST");

        return service.getTruckCategoryList();
    }

    @PostMapping("/truckcategory/{id}")
    public void addTruckCategory(@PathVariable long id, @RequestBody TruckCategoryVO tcvo)
    {
        service.addTruckCategory(tcvo);
    }

    @PutMapping("/truckcategory/{id}")
    public void updateTruckCategory(@PathVariable long id, @RequestBody TruckCategoryVO tcvo)
    {
        service.updateTruckCategory(tcvo);
    }

    @DeleteMapping("/truckcategory/{id}")
    public void deleteTruckCategory(@PathVariable long id, @RequestBody TruckCategoryVO tcvo)
    {
        service.deleteTruckCategory(tcvo);
    }
}
