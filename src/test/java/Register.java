import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.spring.mvc.dao.ApplicationDAO;
import com.spring.mvc.model.User;
import com.spring.mvc.service.UserService;
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "/spring-servlet.xml")
public class Register {
	 @Autowired
	 private UserService userService;
	 
	    @Autowired
	    private ApplicationDAO applicationDAO;
	    
	    @Test
	     public void Registertest() {
	         User user=new User();
	         user.setId((long) 5);
	         user.setName("Shahed");
	         user.setEmail("abu3126@gmail.com");
	         user.setPassword("6896767");
	         user.setContact("092786578");
	         user.setCity("Dhakaa");
	     userService.registerUser(user);
	     Long n=user.getId();
	     Long m=(long) 6;
	     assertEquals(n, m);
	     }
}
