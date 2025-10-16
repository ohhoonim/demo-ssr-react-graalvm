package dev.ohhoonim.demo_ssr_react_graalvm.jsonPlaceholder.application;

import java.util.HashMap;
import java.util.Map;

public record SearchReq(
    String title,
    String body
) {

    public Map<String, Object> toMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("title", title());
        map.put("body", body());
        return map;
    }

}
