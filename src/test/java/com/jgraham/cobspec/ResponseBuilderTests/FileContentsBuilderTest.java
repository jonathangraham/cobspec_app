package com.jgraham.cobspec.ResponseBuilderTests;

import com.jgraham.cobspec.ResponseBuilder.*;
import com.jgraham.server.ResponseBuilder.iResponseBuilder;
import org.junit.Assert;
import org.junit.Test;

public class FileContentsBuilderTest {

    @Test
    public void returnsFileContentsResponse() throws Exception {
        iResponseBuilder response = new FileContentsBuilder("/file1", "/src/main/resources");
        byte[] output = response.getResponse();
        Assert.assertEquals(new String(output), "HTTP/1.1 200 OK\r\n\r\nfile1 contents");
    }
}

