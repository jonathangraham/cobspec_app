package com.jgraham.cobspec.ResponseBuilderTests;

import com.jgraham.cobspec.ResponseBuilder.*;
import com.jgraham.server.ResponseBuilder.iResponseBuilder;
import org.junit.Assert;
import org.junit.Test;

public class FormResponseBuilderTest {
    @Test
    public void returnsResponseTest() throws Exception {
        iResponseBuilder response = new FormResponseBuilder("test");
        byte[] output = response.getResponse();
        Assert.assertEquals(new String(output), "HTTP/1.1 200 OK\r\n\r\ntest");
    }
}
