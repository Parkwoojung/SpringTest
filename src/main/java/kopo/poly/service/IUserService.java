package kopo.poly.service;

import kopo.poly.dto.UserDTO;

public interface IUserService {

    int insertUserInfo(UserDTO uDTO) throws Exception;


    int login(UserDTO uDTO) throws Exception;
}
