package protoType;

import java.util.HashMap;
import java.util.Map;

public class studentRegistry {
    Map<String,student>map=new HashMap<>();

    student get(String key){
        return map.get(key);
    }
    void register(String key,student st){
        map.put(key,st);
    }
}
