package com.jgraham.cobspec.ResponseBuilder;

import com.jgraham.server.ResponseBuilder.iResponseBuilder;

import java.io.File;

public class FileDirectoryBuilder implements iResponseBuilder {

    private String directory;

    public FileDirectoryBuilder(String directory) {
        this.directory = directory;
    }

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

        File f = new File(getRoute());
        String[] files = f.list();

        StringBuilder fileNames = new StringBuilder();
        fileNames.append("<!DOCTYPE html>\n");
        fileNames.append("<!DOCTYPE html>\n<html>\n<body>\n");
        for (String file: files) {
            fileNames.append(("<a href=/" + file + ">" + file + "</a><br>"));
        }
        fileNames.append("</body>\n</html>");
        return fileNames.toString();
    }

    private String getRoute() {
        return (System.getProperty("user.dir")) + directory;
    }
}