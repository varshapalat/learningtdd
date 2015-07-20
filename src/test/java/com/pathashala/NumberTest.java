package com.pathashala;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberTest {
    @Test
    public void shouldReturnTrue()
    {
        boolean result = Number.iftrue();
        assertEquals(true,result);
    }

}
