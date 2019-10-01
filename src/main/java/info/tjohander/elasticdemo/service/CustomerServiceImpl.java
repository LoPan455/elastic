package info.tjohander.elasticdemo.service;

import info.tjohander.elasticdemo.domain.Customer;
import info.tjohander.elasticdemo.repository.CustomerRepository;
import org.elasticsearch.action.get.GetRequest;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.query.GetQuery;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Qualifier("elasticsearchRestHighLevelClient")
    @Autowired
    RestHighLevelClient restHighLevelClient;

    @Autowired
    ElasticsearchOperations elasticsearchOperations;

    @Autowired
    CustomerRepository customerRepository;

    public void getCustomers() {}

    public Customer getCustomer(String customerId) {
        Customer customer = customerRepository.findByAccountNumber(customerId);
        return customer;
    }
}
