package com.chenyu.handler;

import ch.qos.logback.core.db.dialect.MySQLDialect;
import com.chenyu.common.Exception.ExceptionEnum;
import com.chenyu.common.Exception.MyException;
import com.chenyu.common.eneity.ResultResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;


/*
*   自定义异常处理类
*
*
*
* */
@Slf4j
@RestControllerAdvice
public class GloableExceptionHandler {


    /**
     * 处理自定义的业务异常
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value = MyException.class)
    @ResponseBody
    public ResultResponse MyExceptionHandler(HttpServletRequest req, MyException e){
        log.error("发生业务异常！原因是：{}",e.getErrorMsg());
        return ResultResponse.error(e.getErrorCode(),e.getErrorMsg());
    }

    /**
     * 处理空指针的异常
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value =NullPointerException.class)
    @ResponseBody
    public ResultResponse exceptionHandler(HttpServletRequest req, NullPointerException e){
        log.error("发生空指针异常！原因是:",e);

        return ResultResponse.error(ExceptionEnum.BODY_NOT_MATCH);
    }

    /**
     * 处理其他异常
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value =Exception.class)
    @ResponseBody
    public ResultResponse exceptionHandler(HttpServletRequest req, Exception e){
        log.info("未知异常！原因是:",e);
        return ResultResponse.error(ExceptionEnum.INTERNAL_SERVER_ERROR);
    }


}
