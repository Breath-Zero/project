package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "脏三");
        map.put(2, "李四");
        map.put(3, "黑子");
        // 输出map集合
        // 1、Map -> Set
        Set<Map.Entry<Integer, String>> set = map.entrySet();
        // 2、取得Set接口迭代器
        Iterator<Map.Entry<Integer,String>> iterator = set.iterator();
        // 3、迭代输出
        while (iterator.hasNext()){
            Map.Entry<Integer,String> entry = iterator.next();
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
    }
}
