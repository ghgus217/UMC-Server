package kr.ac.ajou.umc.controller.sample;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import kr.ac.ajou.umc.service.sample.SampleBoardService;
import kr.ac.ajou.umc.vo.sample.SampleBoardVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(description = "샘플 API")
@RestController
public class SampleController {

    private Logger logger = LoggerFactory.getLogger(SampleController.class);

    @Autowired
    private SampleBoardService service;

    @ApiOperation(value = "샘플 데이터 모두 조회")
    @GetMapping("/samples")
    public List<SampleBoardVO> boards() {
        logger.info("=========== loging sample ============");

        List<SampleBoardVO> entity = service.getAll();
        return entity;
    }

    @ApiOperation(value = "샘플 데이터 id로 조회")
    @GetMapping("/samples/{id}")
    public SampleBoardVO board(@PathVariable long id) {
        SampleBoardVO entity = service.getOne(id);
        return entity;
    }

    @ApiOperation(value = "샘플 데이터 입력")
    @PostMapping("/samples")
    public void add(SampleBoardVO entity) {
        service.add(entity);

    }

    @ApiOperation(value = "샘플 데이터 수정")
    @PutMapping("/samples/{id}")
    public void modify(@PathVariable long id, SampleBoardVO entity) {
        entity.setId(id);
        service.modify(entity);
    }

    @ApiOperation(value = "샘플 데이터 id로 삭제")
    @DeleteMapping("/samples/{id}")
    public void remove(@PathVariable long id) {
        service.remove(id);
    }
}
