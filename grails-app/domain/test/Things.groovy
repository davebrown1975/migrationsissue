package test

import org.hibernate.envers.Audited

@Audited
class Things {

    String name
    static constraints = {
    }
}
