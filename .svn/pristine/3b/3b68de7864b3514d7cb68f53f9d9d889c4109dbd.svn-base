package kr.ac.ajou.umc.service.truck;

import kr.ac.ajou.umc.repository.truck.DailyTruckRepository;
import kr.ac.ajou.umc.vo.truck.DailyTruckVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DailyTruckService {

    @Autowired
    private DailyTruckRepository repository;

    public List<DailyTruckVO> getDailyTruckList()
    {
        return repository.getDailyTruckList();
    }

    public void addDailyTruck(DailyTruckVO dtvo)
    {
        repository.addDailyTruck(dtvo);
    }

    public void updateDailyTruck(DailyTruckVO dtvo)
    {
        repository.updateDailyTruck(dtvo);
    }

    public void deleteDailyTruck(DailyTruckVO dtvo)
    {
        repository.deleteDailyTruck(dtvo);
    }

}
