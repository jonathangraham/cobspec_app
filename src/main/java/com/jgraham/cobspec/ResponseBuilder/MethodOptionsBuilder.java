package com.jgraham.cobspec.ResponseBuilder;

import com.jgraham.server.ResponseBuilder.iResponseBuilder;

public class MethodOptionsBuilder implements iResponseBuilder {

    public byte[] getResponse() {
        StringBuilder response = new StringBuilder();
        response.append(getStatusLine());
        response.append(getHeader());
        response.append(getBody());
        return response.toString().getBytes();
    }

    private String getStatusLine() {
        return "HTTP/1.1 200 OK\r\n";
    }

    private String getHeader() {
        return "Allow: GET,HEAD,POST,OPTIONS,PUT\r\n";
    }

    private String getBody() {
        return "";
    }
}
