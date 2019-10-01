package info.tjohander.elasticdemo.repository;


import info.tjohander.elasticdemo.domain.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface CustomerRepository extends ElasticsearchRepository<Customer, Integer> {

    Page<Customer> findByLastName(String lastName, Pageable pageable);

    Page<Customer> getCustomersByAccountNumberContains(int accountNumber, Pageable pageable);

}
