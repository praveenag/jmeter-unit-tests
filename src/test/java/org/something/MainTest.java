package org.something;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MainTest
{
    public MainTest()
    {
    }

    @Test
    public void testPass() throws Exception
    {
        assertTrue( true );
    }

    @Test
    @Ignore
    public void testFail() throws Exception
    {
        assertTrue( false );
    }
}
