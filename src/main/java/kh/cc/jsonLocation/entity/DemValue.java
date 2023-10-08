package kh.cc.jsonLocation.entity;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

/**
 * @author ：Lkh
 * @date ：Created in 2023/9/12 9:46 AM
 * 需要校验的实体
 */
@Data
@Builder
public class DemValue {
    /**
     * 名称
     */
    private String name;
    /**
     * 年龄
     */
    private int age;
    /**
     * 电子邮箱
     */
    private String email;
    /**
     * 日期类型（不能超过现在时间，不能低于1900年）
     */
    private Date date;
    /**
     * 对当前字段的描述(校验的时候不能超过50字)
     */
    private String desc;

}
