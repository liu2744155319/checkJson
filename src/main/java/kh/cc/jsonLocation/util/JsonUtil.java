package kh.cc.jsonLocation.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * @author ：Lkh
 * @date ：Created in 2023/9/12 11:50 AM
 *
 * 将文本转化为json
 */
public class JsonUtil {
    private static ObjectMapper mapper = new ObjectMapper();

    public static String bean2Json(Object obj) {
        try {
            return mapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static <T> T json2Bean(String jsonStr, Class<T> objClass) {
        //检测是否为json字符串
        if (!jsonStr.startsWith("{") || !jsonStr.endsWith("}")) {
            throw new RuntimeException("json Error");
        }
        try {
            return mapper.readValue(jsonStr, objClass);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
