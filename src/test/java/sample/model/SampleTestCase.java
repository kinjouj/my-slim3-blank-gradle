package sample.model;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

public class SampleTestCase {

    private Sample sample;

    @Before
    public void setUp() throws Exception {
        this.sample = new Sample();
    }

    @Test
    public void testSample() {
        assertNotNull(sample);
    }
}
