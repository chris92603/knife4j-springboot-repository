package com.atguigu.cloud.exp;

import com.atguigu.cloud.resp.ResultData;
import com.atguigu.cloud.resp.ReturnCodeEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Slf4j
//@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 默认全局异常处理。
     * @param e the e
     * @return ResultData
     */
    @ExceptionHandler(Exception.class)
//    @ExceptionHandler(RuntimeException.class)
//    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResultData<String> exception(Exception e) {
        System.out.println("----come in GlobalExceptionHandler");
        log.error("全局异常信息exception:{}", e.getMessage(), e);
        return ResultData.fail(ReturnCodeEnum.RC500.getCode(),e.getMessage());
    }
}
