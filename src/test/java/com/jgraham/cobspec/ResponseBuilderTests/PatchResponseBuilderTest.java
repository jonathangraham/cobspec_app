package com.jgraham.cobspec.ResponseBuilderTests;

import com.jgraham.cobspec.ResponseBuilder.*;
import com.jgraham.server.ResponseBuilder.iResponseBuilder;
import org.junit.Assert;
import org.junit.Test;

public class PatchResponseBuilderTest {
    @Test
    public void returns200Response() throws Exception {
        iResponseBuilder response = new PatchResponseBuilder();
        byte[] output = response.getResponse();
        Assert.assertEquals(new String(output), "HTTP/1.1 204 Not Found\r\n\r\n");
    }
}
