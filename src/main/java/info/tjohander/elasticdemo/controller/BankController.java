package info.tjohander.elasticdemo.controller;

import info.tjohander.elasticdemo.domain.Customer;
import info.tjohander.elasticdemo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/bank")
public class BankController {

    @Autowired
    CustomerService customerService;

    @GetMapping
    public void getAllCustomers() {
    }

    @GetMapping("/customer")
    public Customer getCustomer(@RequestParam("customer_id") String customerId) {
        return customerService.getCustomer(customerId);
    }
}
