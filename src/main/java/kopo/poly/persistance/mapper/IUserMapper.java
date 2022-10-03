package kopo.poly.persistance.mapper;

import kopo.poly.dto.UserDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IUserMapper {

    int insertUserInfo(UserDTO uDTO) throws Exception;


    UserDTO login(UserDTO uDTO) throws  Exception;
}
