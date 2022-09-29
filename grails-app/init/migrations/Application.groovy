package migrations

import grails.boot.GrailsApp
import grails.boot.config.GrailsAutoConfiguration

import groovy.transform.CompileStatic

@CompileStatic
class Application extends GrailsAutoConfiguration {
    static void main(String[] args) {
//        System.setProperty('org.hibernate.envers.audit_table_suffix', '_aud')
        GrailsApp.run(Application, args)
    }
}