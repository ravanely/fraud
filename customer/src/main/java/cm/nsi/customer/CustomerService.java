package cm.nsi.customer;

import cm.nsi.customer.repositories.CustomerRepository;
import org.springframework.stereotype.Service;

/**
 * @author ravnely
 * @project amigosservices
 * @Created 05/03/2022, 14:40:22, sam.
 **/
@Service
public record CustomerService(CustomerRepository customerRepository) {
    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();

        // todo: check if email is valid
        // todo: check if email is not valid
        customerRepository.save(customer);
    }
}
