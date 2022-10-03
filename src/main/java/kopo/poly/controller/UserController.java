package kopo.poly.controller;

import kopo.poly.dto.UserDTO;
import kopo.poly.service.IUserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@Slf4j
@RequiredArgsConstructor
public class UserController {

    private final IUserService userService;

    // GetMapping은 url에 데이터가 노출 되기 때문에 단순 페이지 조회나 상품 쇼핑몰 페이지, 게시판, 공지 같은 단순 페이지 띄우는 작업만 사용한다.
    // PostMapping은 url에 데이터가 노출되지 않음 중요한 데이터 이동은 post로 사용한다.

    @GetMapping(value = "user/userReg") //url은 자유
    public String userReg(){
        log.info(this.getClass().getName() + "회원가입 페이지 시작!");

         return "user/userReg"; //폴더와 파일위치, 이름을 맞추기
    }

    @PostMapping(value = "user/userProc")
    public String userRegProc(HttpServletRequest request) throws Exception{
        log.info(this.getClass().getName() + "회원가입 로직 시작!");

        String user_name = request.getParameter("name");
        String user_id = request.getParameter("id");
        String user_gender = request.getParameter("gender");
        String user_email = request.getParameter("email");
        String user_pwd = request.getParameter("pwd");

        log.info("회원 아이디 : " + user_id);

        UserDTO uDTO = new UserDTO();

        uDTO.setUser_id(user_id);
        uDTO.setUser_name(user_name);
        uDTO.setUser_gender(user_gender);
        uDTO.setUser_email(user_email);
        uDTO.setUser_pwd(user_pwd);

        int res = userService.insertUserInfo(uDTO);
        log.info(this.getClass().getName() + "회원가입 로직 종료!");

        if(res == 0){
            return "user/userReg";
        } else {
            return "/user/loginPage";
        }

    }

        @GetMapping (value = "loginPage")
        public String loginPage(){
        log.info(this.getClass().getName() + "로그인 페이지 시작");

        return "/user/loginPage";
        }

        @PostMapping(value = "login")
        public String login(HttpServletRequest request) throws Exception{

        log.info(this.getClass().getName() + "로그인 로직 시작");

        String user_id = request.getParameter("user_id");
        String user_pwd = request.getParameter("user_pwd");

        log.info(user_id);
        log.info(user_pwd);

        UserDTO uDTO = new UserDTO();

        uDTO.setUser_id(user_id);
        uDTO.setUser_pwd(user_pwd);


        int res = userService.login(uDTO); //서비스로 보내기

        if(res == 0){
            log.info("로그인 실패");
            return "loginPage";
        } else{
            log.info("로그인 성공");
            return "index";
        }
        }
}
