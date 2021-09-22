package com.chenyu.common.Exception;

import lombok.Data;
import org.springframework.stereotype.Component;


public interface BaseErrorInfoInterface {
    /*
    *
    * 获取错误码
    * */
    String getResultCode();


    /*
    *
    *
    * 获取错误信息
    * */

    String getResultMsg();


}
