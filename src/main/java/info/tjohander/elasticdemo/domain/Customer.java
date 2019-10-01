package info.tjohander.elasticdemo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName="bank")
public class Customer {

    @Id
    String accountNumber;

    int balance;

    String firstName;

    String lastName;

    int age;

    String gender;

    String address;

    String employer;

    String email;

    String city;

    String state;

}
