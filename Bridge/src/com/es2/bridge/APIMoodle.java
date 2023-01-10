package com.es2.bridge;

import java.util.LinkedHashMap;
import java.util.UUID;

public class APIMoodle extends java.lang.Object implements APIServiceInterface {

    protected java.util.LinkedHashMap<String,String> content;
    public APIMoodle(){
        content = new LinkedHashMap<>();
    }

    @Override
    public String getContent(String contentId) {
        if(contentId.equalsIgnoreCase( "0")) {
            String d = "";
            for (String c : content.keySet()){
                d += content.get(c);
            }
            return d;
        }
        if (content.containsKey(contentId)){
            return content.get(contentId);
        }
      return null;
    }

    @Override
    public String setContent(String content) {
        String id = UUID.randomUUID().toString();
        this.content.put(id,content);
            return id;
    }
}
