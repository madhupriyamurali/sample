package com.mindtree.test;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
org.springframework.test.context.ContextConfiguration;
import com.mindtree.springbootstarter;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes={CourseApiApp.class})

@SpringBootTest
public class TestCoreApp {

	@Test
	public void contextLoads() {
	}

}
