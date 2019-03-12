package kr.ac.ajou.umc.repository.sample;

import kr.ac.ajou.umc.vo.PagingVO;
import kr.ac.ajou.umc.vo.sample.SampleBoardVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface SampleBoardRepository {
    List<SampleBoardVO> selectAll();
    List<SampleBoardVO> selectRange(PagingVO pagingVO);
    SampleBoardVO selectOne(long id);
    void insert(SampleBoardVO entity);
    void update(SampleBoardVO entity);
    void delete(long id);
}