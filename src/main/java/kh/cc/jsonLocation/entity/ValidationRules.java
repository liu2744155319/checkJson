package kh.cc.jsonLocation.entity;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @author ：Lkh
 * @date ：Created in 2023/9/12 12:11 PM
 * 最终返回的校验实体格式类型如下
 *  rules: {
 *           name: [
 *             { required: true, message: '请输入活动名称', trigger: 'blur' },
 *             { min: 3, max: 5, message: '长度在 3 到 5 个字符', trigger: 'blur' }
 *           ],
 *           date: [
 *             { type: 'date', required: true, message: '请选择日期', trigger: 'change' }
 *           ],
 *           email: [
 *             { type: 'array', required: true, message: '请至少选择一个活动性质', trigger: 'change' }
 *           ],
 *           desc: [
 *             { required: true, message: '请填写活动形式', trigger: 'blur' }
 *           ]
 *         }
 *       };
 *       里面包含了这几种字段对应的不用的类型，需要模仿demValue中的格式进行返回
 */


@Data
public class ValidationRules {
    private List<Map<String,FieldValidationRule>> rules;
}
