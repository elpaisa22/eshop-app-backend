package org.ambar.app.administration;

import org.ambar.app.domain.Categoria;
import org.lightadmin.api.config.AdministrationConfiguration;
import org.lightadmin.api.config.builder.EntityMetadataConfigurationUnitBuilder;
import org.lightadmin.api.config.unit.EntityMetadataConfigurationUnit;

public class CategoriaAdministrator extends AdministrationConfiguration<Categoria> {

	@Override
    public EntityMetadataConfigurationUnit configuration(EntityMetadataConfigurationUnitBuilder configurationBuilder) {
        return configurationBuilder.nameField("id").singularName("Categoria").pluralName("Categorias").build();
    }

}
