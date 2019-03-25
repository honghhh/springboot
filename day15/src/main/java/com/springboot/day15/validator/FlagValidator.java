package com.springboot.day15.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * 自定义注解
 * <p> @Documented 注解表明这个注释是由 javadoc记录的</p>
 * <p> @Retention 与元注释(@Retention)一起指定注释要保留多长时间</p>
 * <p> @Target 注释可能出现在Java程序中的语法位置</p>
 * <p> @Constraint validatedBy的字段是我们自定义注解的实现类的类型</p>
 * @author: huangh
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.PARAMETER, ElementType.FIELD})
@Constraint(validatedBy = FlagValidatorClass.class)
public @interface FlagValidator {

    // 注解属性
    // flag的有效值多个使用","隔开
    String values();

    // 提示内容
    String message() default "flag不存在";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
