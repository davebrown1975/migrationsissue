package test

import org.hibernate.envers.Audited

@Audited
class Customer {

    String name
    String favouriteColor

    static hasMany = [things:Things]

    static constraints = {
    }
}
