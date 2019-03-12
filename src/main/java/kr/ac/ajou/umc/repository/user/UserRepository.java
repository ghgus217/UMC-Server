package kr.ac.ajou.umc.repository.user;

import java.util.List;

import kr.ac.ajou.umc.vo.user.UserCreateVO;
import kr.ac.ajou.umc.vo.user.UserLoginVO;
import kr.ac.ajou.umc.vo.user.UserUpdateVO;
import kr.ac.ajou.umc.vo.user.UserVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserRepository {

    List<UserVO> getUserList();
    UserVO getUser(long id);
    UserVO login(UserLoginVO login);
    void addUser(UserVO user);
    void updateUser(UserVO user);
    void deleteUser(long id);

}