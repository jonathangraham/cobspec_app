package com.jgraham.cobspec.ResponseBuilder;

import com.jgraham.server.ResponseBuilder.iResponseBuilder;

public class Status200Builder implements iResponseBuilder {

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
        return "\r\n";
    }

    private String getBody() {
        return "";
    }
}
