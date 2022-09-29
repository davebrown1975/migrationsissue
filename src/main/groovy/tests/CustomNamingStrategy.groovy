package tests

import grails.util.Holders
import org.hibernate.cfg.ImprovedNamingStrategy

class CustomNamingStrategy extends ImprovedNamingStrategy {

  final String prefix = Holders.config.getProperty('hibernate.tablePrefix') ?: 'dev_'

  @Override
  String classToTableName( String className ) {
    prefix +  super.classToTableName( className ).toLowerCase()
  }


/*
  String collectionTableName(String ownerEntity, String ownerEntityTable, String associatedEntity, String associatedEntityTable, String propertyName) {

    return prefix + super.collectionTableName(ownerEntity, ownerEntityTable, associatedEntity, associatedEntityTable, propertyName)

  }
  */

}
