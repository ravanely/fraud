package cm.nsi.customer.repositories;

import cm.nsi.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ravnely
 * @project amigosservices
 * @Created 05/03/2022, 15:32:19, sam.
 **/
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
