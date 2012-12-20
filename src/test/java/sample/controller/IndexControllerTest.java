package sample.controller;

import java.util.List;

import org.slim3.tester.ControllerTestCase;
import org.junit.Test;

import sample.model.Sample;
import sample.service.SampleService;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import static javax.servlet.http.HttpServletResponse.SC_OK;

public class IndexControllerTest extends ControllerTestCase {

    private SampleService service = new SampleService();

    @Test
    public void test1() throws Exception {
        tester.start("/");
        assertThat(tester.response.getStatus(),is(SC_OK));
        assertThat(tester.getDestinationPath(),is("/WEB-INF/jsp/index.jsp"));
        assertThat(tester.getController(),is(notNullValue()));

        List<Sample> samples = tester.requestScope("samples");
        assertThat(samples.size(), is(0));
    }

    @Test
    public void test2() throws Exception {
        List<Sample> samples = service.findAll();
        assertThat(samples.size(), is(0));
    }
}
