package com.example.hello;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;
import qoutes.obj.Qoutes;
import qoutes.obj.services.QoutesServices;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloApplicationTests {
        QoutesServices qoutesServices;

        @Before
        public void before(){
            this.qoutesServices = new QoutesServices();
        }

    @Test
    public void testGetQoute(){
            this.qoutesServices.addQoute(new Qoutes("ABC", "D"));
            assertEquals("D", this.qoutesServices.getQoutes().getBy());
    }
    @Test
    public void testMultipleGetGoute(){
        this.qoutesServices.addQoute(new Qoutes("ABC", "D"));
        this.qoutesServices.addQoute(new Qoutes("DEF", "G"));
        assertTrue(
                "ABC".equals(this.qoutesServices.getQoutes().getValue()) ||
                        "DEF".equals(this.qoutesServices.getQoutes().getValue())
        );
    }
}
