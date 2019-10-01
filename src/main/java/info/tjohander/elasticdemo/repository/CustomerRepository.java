package info.tjohander.elasticdemo.repository;


import info.tjohander.elasticdemo.domain.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends ElasticsearchRepository<Customer, Integer> {

    Customer findByLastName(String lastName);

    Customer findByAccountNumber(String accountNumber);

    Customer getCustomersByAccountNumberContains(int accountNumber);

}
