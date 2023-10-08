package kh.cc.jsonLocation;

import kh.cc.jsonLocation.entity.DemValue;
import kh.cc.jsonLocation.service.SchemaService;
import kh.cc.jsonLocation.service.impl.SchemaServiceImpl;

/**
 * @author ：Lkh
 * @date ：Created in 2023/9/11 9:04 PM
 */
public class JsonPathExample {
    public static void main(String[] args) {
//        转化String类型数据为json类型并且调用service层的方法进行校验
        SchemaService schemaService = new SchemaServiceImpl();
        System.out.println(schemaService.generateSchema(DemValue.builder().name("考核").age(12).email("123@qqq.cn").build()));
    }
}
