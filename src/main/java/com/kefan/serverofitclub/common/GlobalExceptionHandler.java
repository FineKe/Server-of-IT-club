package com.kefan.serverofitclub.common;

import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {


    /**
     * 全局异常处理
     * @param request
     * @param exception
     * @return
     * @throws Exception
     */
    @ExceptionHandler(value=Exception.class)
    public String allExceptionHandler(HttpServletRequest request,
                                      Exception exception) throws Exception
    {
        exception.printStackTrace();
        Map<String,Object> map=new HashMap<>();
        map.put("code",CodeConstant.SERVER_ERROR);
        map.put("msg","服务器内部错误");
        return JSON.toJSONString(map);
    }
}
