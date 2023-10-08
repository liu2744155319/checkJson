package kh.cc.jsonLocation.template;


import java.util.HashMap;
import java.util.Map;

/**
 * @author ：Lkh
 * @date ：Created in 2023/9/12 4:45 PM
 */
public class Schema {
    //自定义错误的映射
    private final Map<DemCheck, RuntimeException> errorMap = new HashMap<>();
    //用来控制当前操作的检查类型
    protected DemCheck currentCheckType;

    public Map<DemCheck, RuntimeException> getErrorMap() {
        return errorMap;
    }

    public DemCheck getCurrentCheckType() {
        return currentCheckType;
    }
}
