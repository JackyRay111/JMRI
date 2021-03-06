package jmri.jmrix.nce.configurexml;

import jmri.util.JUnitUtil;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * NceSensorManagerXmlTest.java
 *
 * Test for the NceSensorManagerXml class
 *
 * @author   Paul Bender  Copyright (C) 2016
 */
public class NceSensorManagerXmlTest {

    @Test
    public void testCtor(){
      Assert.assertNotNull("NceSensorManagerXml constructor",new NceSensorManagerXml());
    }

    @Before
    public void setUp() {
        JUnitUtil.setUp();
    }

    @After
    public void tearDown() {
        JUnitUtil.tearDown();
    }

}

