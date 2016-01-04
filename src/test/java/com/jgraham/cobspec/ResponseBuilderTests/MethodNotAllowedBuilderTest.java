package com.jgraham.cobspec.ResponseBuilderTests;

import com.jgraham.cobspec.ResponseBuilder.*;
import com.jgraham.server.ResponseBuilder.iResponseBuilder;
import org.junit.Assert;
import org.junit.Test;

public class MethodNotAllowedBuilderTest {
    @Test
    public void returnsFourOhFiveResponse() throws Exception {
        iResponseBuilder response = new MethodNotAllowedBuilder();
        byte[] output = response.getResponse();
        Assert.assertEquals(new String(output), "HTTP/1.1 405 Method Not Allowed\r\n\r\n");
    }
}
