package kh.cc.jsonLocation.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Lists;
import kh.cc.jsonLocation.entity.FieldValidationRule;
import kh.cc.jsonLocation.entity.ValidationRules;
import kh.cc.jsonLocation.template.DemCheck;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.*;

/**
 * @author ：Lkh
 * @date ：Created in 2023/9/12 11:51 AM
 * <p>
 * 对需要选定的字段进行校验
 * 一方面需要获取该字段对应的正则（可以从mapper里面获取）
 * 一方面需要获取这个字段里面的数据（传过来的数据）
 * 使用进行方法进行对比
 */
public class Schema {
    // 创建ObjectMapper对象
    ObjectMapper mapper = new ObjectMapper();

    /**
     * 将service层中传递过来的内容进行对照模板配置的正则进行判断，如果匹配不成功就返回错误的内容并且添加校验失败的提示
     *
     * @param jsonData service传递过来的json对象
     */
    public ValidationRules schemaNode(String jsonData) {
        try {
            // 将 JSON 数据字符串解析为 JsonNode 对象
            JsonNode dataNode = mapper.readTree(jsonData);

            // 创建一个用于验证 JSON 数据的 Schema 对象
            ValidationRules schemaDemVO = new ValidationRules();

            // 遍历 JSON 数据的字段并进行验证
            Iterator<String> fields = dataNode.fieldNames();

            List<Map<String,FieldValidationRule>> ruleArrayList = Lists.newArrayList();
            while (fields.hasNext()) {
//                遍历字段名与字段内容并且打印出来
                String fieldName = fields.next();
                JsonNode fieldValue = dataNode.get(fieldName);
                HashMap<String, FieldValidationRule> voMap = new HashMap<>();
                voMap.put(fieldName, DemCheck.matchAndSetField(fieldName, fieldValue.asText()));
                ruleArrayList.add(voMap);
            }
            schemaDemVO.setRules(ruleArrayList);
            return schemaDemVO;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

}
