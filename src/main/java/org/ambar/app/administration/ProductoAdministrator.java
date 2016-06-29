package org.ambar.app.administration;

import org.ambar.app.domain.Producto;
import org.lightadmin.api.config.AdministrationConfiguration;
import org.lightadmin.api.config.builder.EntityMetadataConfigurationUnitBuilder;
import org.lightadmin.api.config.unit.EntityMetadataConfigurationUnit;

public class ProductoAdministrator extends AdministrationConfiguration<Producto> {
	
	@Override
    public EntityMetadataConfigurationUnit configuration(EntityMetadataConfigurationUnitBuilder configurationBuilder) {
        return configurationBuilder.nameField("codigo").singularName("Producto").pluralName("Productos").build();
    }

}
