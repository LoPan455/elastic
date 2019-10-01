package info.tjohander.elasticdemo;

import info.tjohander.elasticdemo.domain.Customer;
import info.tjohander.elasticdemo.service.CustomerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ElasticdemoApplicationTests {

	@Autowired
	CustomerService customerService;

	@Test
	public void contextLoads() {
	}

	@Test
	public void getCustomerTest() {
		Customer customer = customerService.getCustomer("1");
		assert customer != null;
	}

}
