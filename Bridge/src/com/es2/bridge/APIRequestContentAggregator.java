package com.es2.bridge;

public class APIRequestContentAggregator extends APIRequest{

    public APIRequestContentAggregator(){

    }

    @Override
    public String getContent(String serviceId, String contentId) throws ServiceNotFoundException {
        if (this.services.containsKey(serviceId)) {
            return this.services.get(serviceId).getContent("0");
        }else{
            throw new ServiceNotFoundException();
        }
    }
}
