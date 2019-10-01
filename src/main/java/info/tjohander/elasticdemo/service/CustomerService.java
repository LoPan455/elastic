package info.tjohander.elasticdemo.service;

import info.tjohander.elasticdemo.domain.Customer;
import org.springframework.stereotype.Service;

@Service
public interface CustomerService {

    public void getCustomers();

    public Customer getCustomer(String customerId);

}
