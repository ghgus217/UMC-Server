package kr.ac.ajou.umc.service.truck;

import kr.ac.ajou.umc.repository.truck.TruckMenuRepository;
import kr.ac.ajou.umc.vo.truck.TruckMenuDeleteVO;
import kr.ac.ajou.umc.vo.truck.TruckMenuVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TruckMenuService {

    @Autowired
    private TruckMenuRepository repository;

    public List<TruckMenuVO> getTruckMenuList()
    {
        return repository.getTruckMenuList();
    }

    public List<TruckMenuVO> searchTruckMenuWithTruckId(long truckId)
    {
        return repository.searchTruckMenuWithTruckId(truckId);
    }

    public void addTruckMenu(TruckMenuVO tmvo)
    {
        repository.addTruckMenu(tmvo);
    }

    public void updateTruckMenu(TruckMenuVO tmvo)
    {
        repository.updateTruckMenu(tmvo);
    }

    public void deleteTruckMenu(TruckMenuDeleteVO tmvo)
    {
        repository.deleteTruckMenu(tmvo);
    }

    public void deleteWholeTruckMenu(long truckId)
    {
        repository.deleteWholeTruckMenu(truckId);
    }
}
