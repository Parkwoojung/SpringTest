package kopo.poly.service.impl;

import kopo.poly.dto.UserDTO;
import kopo.poly.persistance.mapper.IUserMapper;
import kopo.poly.service.IUserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
 //UserService
@Service
@Slf4j
@RequiredArgsConstructor
public class UserService implements IUserService {
 //UserService
    private final IUserMapper userMapper;

    @Override
    public int insertUserInfo(UserDTO uDTO) throws Exception {
        log.info(this.getClass().getName() + "회원가입 서비스 시작");

        int res = 0;

        if (uDTO == null) {
            uDTO = new UserDTO();
        }

        res = userMapper.insertUserInfo(uDTO);

        log.info("회원가입 결과는? " + res);

        log.info(this.getClass().getName() + "회원가입 서비스 종료");

        return res;
    }

    @Override
    public int login(UserDTO uDTO) throws Exception {
        log.info(this.getClass().getName() + "로그인 서비스 시작");


        if (uDTO == null) {
            uDTO = new UserDTO();
        }

        UserDTO rDTO = userMapper.login(uDTO);

            if (rDTO.getUser_id().length() > 0) {


                return 1;
            } else {
                return 0;
            }


        }
    }

