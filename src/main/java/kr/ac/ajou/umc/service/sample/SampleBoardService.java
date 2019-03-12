package kr.ac.ajou.umc.service.sample;

import kr.ac.ajou.umc.controller.sample.SampleController;
import kr.ac.ajou.umc.repository.sample.SampleBoardRepository;
import kr.ac.ajou.umc.vo.PagingVO;
import kr.ac.ajou.umc.vo.sample.SampleBoardVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SampleBoardService {

    private Logger logger = LoggerFactory.getLogger(SampleBoardService.class);

    @Autowired
    private SampleBoardRepository repository;

    public List<SampleBoardVO> getAll() {
        logger.info("service getAll");
        return repository.selectAll();
    }

    public List<SampleBoardVO> getAll(PagingVO pagingVO) {
        return repository.selectRange(pagingVO);
    }

    public SampleBoardVO getOne(long id) {
        return repository.selectOne(id);
    }

    public void add(SampleBoardVO entity) {
        repository.insert(entity);
    }

    public void modify(SampleBoardVO entity) {
        repository.update(entity);
    }

    public void remove(long id) {
        repository.delete(id);
    }
}
