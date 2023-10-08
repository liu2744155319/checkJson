package kh.cc.jsonLocation.service;

import kh.cc.jsonLocation.entity.DemValue;
import kh.cc.jsonLocation.entity.ValidationRules;

/**
 * @author ：Lkh
 * @date ：Created in 2023/9/12 12:12 PM
 */
public interface SchemaService {
    /**
     * 根据json数据生成schema
     *
     * @param json json数据
     * @return schema
     */
    ValidationRules generateSchema(DemValue json);

    /**
     * 根据schema校验json数据
     *
     * @param schema schema
     * @param json   json数据
     * @return 校验结果
     */
    boolean validate(String schema, String json);
}
