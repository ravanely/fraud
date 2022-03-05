package cm.nsi.customer;

import lombok.Builder;
import lombok.Data;

/**
 * @author ravnely
 * @project amigosservices
 * @Created 05/03/2022, 14:17:52, sam.
 **/
@Data
@Builder
public class Customer {

    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
}
