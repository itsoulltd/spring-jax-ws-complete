package com.infoworks.jaxws.components.interceptors;

import org.springframework.ws.soap.server.endpoint.interceptor.PayloadValidatingInterceptor;

import javax.xml.namespace.QName;

public class CustomPayloadValidatingInterceptor extends PayloadValidatingInterceptor {
    @Override
    public QName getDetailElementName() {
        return new QName("http://medium.com", "error", "app");
    }
}
