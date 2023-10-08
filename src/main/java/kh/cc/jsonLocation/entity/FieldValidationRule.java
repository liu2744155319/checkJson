package kh.cc.jsonLocation.entity;

import lombok.Data;

/**
 * @author ：Lkh
 * @date ：Created in 2023/10/7 5:53 PM
 */
@Data
public class FieldValidationRule {
    /**
     * 校验结果
     */
    boolean required = false;
    /**
     * 校验失败的提示信息
     */
    String message;
    /**
     * 触发的事件
     */
    String trigger;
    /**
     * 校验的类型
     */
    String type;
}
