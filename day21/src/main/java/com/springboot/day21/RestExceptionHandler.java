package com.springboot.day21;

import com.springboot.day21.entity.ApiResultGenerator;
import org.springframework.web.bind.annotation.*;

/**
 * result统一异常处理
 * 具体Controller不需要进行单独异常处理
 * 由该类统一处理
 * @author: huangh
 */
@ControllerAdvice(annotations = RestController.class)
@ResponseBody
public class RestExceptionHandler {

    /**
     * 默认统一异常处理方法
     * @param e 默认Exception异常对象
     * <p>@ExceptionHandler注解用来配置需要拦截的异常类型</p>
     * <p>@ResponseStatus注解用于配置遇到该异常后返回数据时的StatusCode的值，我们这里默认使用值500。</p>
     * <p>在类的上方我们配置了@ControllerAdvice的annotations属性值为RestController.class，也就是只有添加了
     * @RestController注解的控制器才会进入全局异常处理，下面我们来添加一个测试控制器。</p>
     * @return
     */
    @ExceptionHandler
    @ResponseStatus
    public com.yuqiyu.ApiResult runtimeExceptionHandler(Exception e){
        return ApiResultGenerator.errorResult(e.getMessage(), e);
    }

}
