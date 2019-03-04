package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOf4Test {

    PowerOf4 obj;
    @Before
    public void setUp() throws Exception {
         obj = new PowerOf4();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }

    @Test
    public void checkPowerOf4() {
        assertEquals(true,obj.checkPowerOf4(16));
        
    }
}
