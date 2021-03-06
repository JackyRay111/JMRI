package jmri.jmrix.rfid.configurexml;

import jmri.util.JUnitUtil;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * RfidReporterManagerXmlTest.java
 *
 * Test for the RfidReporterManagerXml class
 *
 * @author   Paul Bender  Copyright (C) 2016
 */
public class RfidReporterManagerXmlTest {

    @Test
    public void testCtor(){
      Assert.assertNotNull("RfidReporterManagerXml constructor",new RfidReporterManagerXml());
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

