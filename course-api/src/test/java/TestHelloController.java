package 
com.mindtree.junit;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


import org.junit.Before;
import org.junit.Test;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.test.web.servlet.MockMvc;

import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import org.springframework.web.context.WebApplicationContext;

import com.mindtree.test.TestCoreApp;



public class TestHelloController extends TestCoreApp
{

@Autowired
	
private WebApplicationContext webApplicationContext;

	
private MockMvc mockMvc;

	
@Before
	public void setup() 
{
		
mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();

	}

	
@Test
	
public void testTopic() throws Exception {
		
mockMvc.perform(get("/hello")).andExpect(status().isOk())
				
.andExpect(content().contentType("application/json;charset=UTF-8"))
				
.andExpect(jsonPath("$.id").value("01")).andExpect(jsonPath("$.description").value("Spring Boot with Jenkins"))
				
.andExpect(jsonPath("$.name").value("Java"));

	
}


}
