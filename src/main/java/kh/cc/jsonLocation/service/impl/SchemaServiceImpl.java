package kh.cc.jsonLocation.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import kh.cc.jsonLocation.entity.DemValue;
import kh.cc.jsonLocation.entity.ValidationRules;
import kh.cc.jsonLocation.service.SchemaService;
import kh.cc.jsonLocation.util.Schema;

/**
 * @author ：Lkh
 * @date ：Created in 2023/9/12 12:14 PM
 */
public class SchemaServiceImpl implements SchemaService {

    /**
     * 进行校验逻辑（递归获取json对象中的每一个字段，然后根据配置的模板中的正则进行判断）
     * @return
     */
    @Override
    public ValidationRules generateSchema(DemValue val) {
        Schema schema = new Schema();
//        将json转化为schemaNode可用的对象
        ObjectMapper mapper = new ObjectMapper();
        String json = null;
        try {
            json = mapper.writeValueAsString(val);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
//        获取到实体中的每个对象之后就开始调用校验方法，为每一个字段去校验是否符合配置的正则
        return schema.schemaNode(json);
    }

    @Override
    public boolean validate(String schema, String json) {
        return false;
    }
}
