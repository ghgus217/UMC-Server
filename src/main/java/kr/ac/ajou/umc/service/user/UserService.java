package kr.ac.ajou.umc.service.user;

import java.util.List;

import kr.ac.ajou.umc.vo.user.UserCreateVO;
import kr.ac.ajou.umc.vo.user.UserLoginVO;
import kr.ac.ajou.umc.vo.user.UserUpdateVO;
import kr.ac.ajou.umc.vo.user.UserVO;
import kr.ac.ajou.umc.repository.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<UserVO> getUserList() {
        return repository.getUserList();
    }

    public UserVO getUser(long id)
    {
        return repository.getUser(id);
    }

    public UserVO addUser(UserCreateVO user) {

        UserVO userMaker = new UserVO();
        userMaker.setLoginId(user.getLoginId());
        userMaker.setName(user.getName());
        userMaker.setPhoneNum(user.getPhoneNum());
        userMaker.setPw(user.getPw());
        userMaker.setUserCategoryId(user.getUserCategoryId());

        repository.addUser(userMaker);

        return userMaker;
    }

    public UserVO updateUser(UserUpdateVO user)
    {

        UserVO userMaker = new UserVO();
        userMaker.setId(user.getId());
        if(user.getLoginId() == "")
            user.setLoginId(null);
        userMaker.setLoginId(user.getLoginId());
        if(user.getName() == "")
            user.setName(null);
        userMaker.setName(user.getName());
        if(user.getPhoneNum() == "")
            user.setPhoneNum(null);
        userMaker.setPhoneNum(user.getPhoneNum());
        if(user.getPw() == "")
            user.setPw(null);
        userMaker.setPw(user.getPw());

        repository.updateUser(userMaker);

        return userMaker;
    }

    public void deleteUser(long id)
    {
        repository.deleteUser(id);
    }

    public UserVO login(UserLoginVO login)
    {
        return repository.login(login);
    }



}
