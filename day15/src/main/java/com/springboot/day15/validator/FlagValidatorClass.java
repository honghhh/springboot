package com.springboot.day15.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * 自定义注释实现类
 * @author: huangh
 */
public class FlagValidatorClass implements ConstraintValidator<FlagValidator, Object> {

    // 临时变量保存值列表
    private String values;

    @Override
    public void initialize(FlagValidator flagValidator) {
        // 将注解内配置的值赋值给临时变量
        this.values = flagValidator.values();
    }

    // 实现验证
    @Override
    public boolean isValid(Object value, ConstraintValidatorContext constraintValidatorContext) {
        String[] value_array = values.split(",");
        boolean isFlag = false;
        // 遍历对比有效值
        for(int i = 0; i < value_array.length; i++) {
            // 存在一致的值跳出循环，赋值isFlag=true
            if (value_array[i].equals(value)) {
                isFlag= true;
                break;
            }
        }
        // 返回是否存在boolean
        return isFlag;
    }

}
