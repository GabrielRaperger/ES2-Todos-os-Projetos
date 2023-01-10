package com.es2.bridge;


import java.util.HashMap;
import java.util.UUID;

public class APIRequest extends java.lang.Object{
    protected java.util.HashMap<String,APIServiceInterface> services;
    public APIRequest(){
        services=new HashMap<>();
    }
    public String addService(APIServiceInterface service){
        String id = UUID.randomUUID().toString();
        services.put(id,service);
        if(services.containsKey(id)){
           return id;
        }
        return null;
    }

    public String getContent(String serviceId, String contentId) throws ServiceNotFoundException{
        if (services.containsKey(serviceId)){
            APIServiceInterface a = services.get(serviceId);
            return a.getContent(contentId);
        }
        throw new ServiceNotFoundException();
    }
    public String setContent(String serviceId, String content) throws ServiceNotFoundException{
        if (services.containsKey(serviceId)) {
            APIServiceInterface b = services.get(serviceId);
            return b.setContent(content);
        }
        throw new ServiceNotFoundException();
    }
}
