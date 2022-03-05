package cm.nsi.customer;

/**
 * @author ravnely
 * @project amigosservices
 * @Created 05/03/2022, 14:40:22, sam.
 **/
public record CustomerService() {
    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();

        // todo: check if email is valid
        // todo: check if email is not valid
        // todo: store customer in db
    }
}
