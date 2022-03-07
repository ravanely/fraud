package cm.nsi.customer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author ravnely
 * @project amigosservices
 * @Created 05/03/2022, 14:17:52, sam.
 **/
@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    @Id
    @SequenceGenerator(name = "customer_id_sequence", sequenceName = "customer_id_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_id_sequence")
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
}
