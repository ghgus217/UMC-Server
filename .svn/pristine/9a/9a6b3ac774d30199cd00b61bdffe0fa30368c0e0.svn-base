package kr.ac.ajou.umc.service.truck;

import kr.ac.ajou.umc.repository.truck.TruckCategoryRepository;
import kr.ac.ajou.umc.vo.truck.TruckCategoryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TruckCategoryService {

    @Autowired
    private TruckCategoryRepository repository;

    public List<TruckCategoryVO> getTruckCategoryList()
    {
        return repository.getTruckCategoryList();
    }

    public void addTruckCategory(TruckCategoryVO tcvo)
    {
        repository.addTruckCategory(tcvo);
    }

    public void updateTruckCategory(TruckCategoryVO tcvo)
    {
        repository.updateTruckCategory(tcvo);
    }

    public void deleteTruckCategory(TruckCategoryVO tcvo)
    {
        repository.deleteTruckCategory(tcvo);
    }
}
