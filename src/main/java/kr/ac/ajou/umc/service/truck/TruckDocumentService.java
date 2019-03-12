package kr.ac.ajou.umc.service.truck;

import kr.ac.ajou.umc.repository.truck.TruckDocumentRepository;
import kr.ac.ajou.umc.vo.truck.TruckDocumentLinkVO;
import kr.ac.ajou.umc.vo.truck.TruckDocumentVO;
import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.FileUpload;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.*;
import java.util.List;
import java.util.UUID;

@Service
public class TruckDocumentService {

    @Autowired
    private TruckDocumentRepository repository;

    public List<TruckDocumentVO> getTruckDocumentList()
    {
        return repository.getTruckDocumentList();
    }

    public void addTruckDocumentImage(long truckId, MultipartFile multifile)
    {
        String fileName = UUID.randomUUID().toString().replace("-", "");
        String[] format = multifile.getOriginalFilename().split(".");
        String fileDir = "/home/chrow16/deploy/image/" + fileName + ".jpg";
        String imageLink = "http://52.231.156.176/image/" + fileName  + ".jpg";
        File file = new File(fileDir);
        try {

            multifile.transferTo(file);


        } catch (Exception e) {
            throw new RuntimeException("FAIL! -> message = " + e.getMessage());
        }

        TruckDocumentVO tdvo = new TruckDocumentVO();
        tdvo.setTruckId(truckId);
        tdvo.setDocumentName(fileName);
        tdvo.setImageLink(imageLink);

        repository.addTruckDocument(tdvo);
    }

    public List<TruckDocumentLinkVO> getTruckDocumentImage(long truckId)
    {
        return repository.getTruckDocumentImage(truckId);
    }


    public void updateTruckDocument(TruckDocumentVO tdvo)
    {
        repository.updateTruckDocument(tdvo);
    }

    public void deleteTruckDocument(TruckDocumentVO tdvo)
    {
        repository.deleteTruckDocument(tdvo);
    }
}
