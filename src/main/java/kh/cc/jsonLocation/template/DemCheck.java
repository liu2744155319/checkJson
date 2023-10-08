package kh.cc.jsonLocation.template;


import kh.cc.jsonLocation.entity.FieldValidationRule;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ：Lkh
 * @date ：Created in 2023/9/12 9:48
 * 创建匹配的规则类(这个类需要能自动对应)，这个类里面能为匹配的类添加规则与如果规则不匹配就跳出对应的提示内容
 */
public enum DemCheck {
    //匹配规则
    NAME("name", "^[\\u4e00-\\u9fa5]{2,4}$", "姓名只能是2-4位的中文"),
    AGE("age", "^[0-9]{1,3}$", "年龄只能是1-3位的数字"),
    EMAIL("email", "^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$", "邮箱格式不正确"),
    DATE("date", "^[0-9]{4}-[0-9]{2}-[0-9]{2}$", "日期格式不正确"),
    DESC("desc", "^[\\u4e00-\\u9fa5]{1,50}$", "描述只能是1-50位的中文"),
    NULL("null","","");
    private String name;
    private String regex;
    private String errorMessage;

    DemCheck(String name, String regex, String errorMessage) {
        this.name = name;
        this.regex = regex;
        this.errorMessage = errorMessage;
    }



    /**
     * 对传递过来的节点名与内容与枚举类进行匹配校验如果正则匹配失败就返回errorMessage
     */
    public static FieldValidationRule matchAndSetField(String fieldName, String input) {
        FieldValidationRule fieldValidationRule = new FieldValidationRule();
        Pattern pattern = Pattern.compile(DemCheck.valueOf(fieldName.toUpperCase()).regex);
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            fieldValidationRule.setRequired(true);
            fieldValidationRule.setMessage("");
        } else {
            fieldValidationRule.setRequired(false);
            fieldValidationRule.setMessage(DemCheck.valueOf(fieldName.toUpperCase()).errorMessage);
        }
        return fieldValidationRule;
    }

}
