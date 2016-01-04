package com.jgraham.cobspec.ResponseBuilderTests;

import com.jgraham.cobspec.ResponseBuilder.*;
import com.jgraham.server.ResponseBuilder.iResponseBuilder;
import org.junit.Assert;
import org.junit.Test;

public class FourOhFourBuilderTest {
    @Test
    public void returnsFourOhFourResponse() throws Exception {
        iResponseBuilder response = new FourOhFourBuilder();
        byte[] output = response.getResponse();
        Assert.assertEquals(new String(output), "HTTP/1.1 404 Not Found\r\n\r\n");
    }
}
