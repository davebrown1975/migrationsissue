package test

import org.hibernate.envers.Audited

@Audited
class CustomerAddress {
    String address
    static constraints = {
    }
}
