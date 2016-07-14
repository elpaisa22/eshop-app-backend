package org.ambar.app.administration;

import static org.lightadmin.api.config.utils.Editors.textArea;
import static org.lightadmin.api.config.utils.Editors.wysiwyg;

import org.ambar.app.domain.Producto;
import org.lightadmin.api.config.AdministrationConfiguration;
import org.lightadmin.api.config.builder.EntityMetadataConfigurationUnitBuilder;
import org.lightadmin.api.config.builder.FieldSetConfigurationUnitBuilder;
import org.lightadmin.api.config.builder.PersistentFieldSetConfigurationUnitBuilder;
import org.lightadmin.api.config.unit.EntityMetadataConfigurationUnit;
import org.lightadmin.api.config.unit.FieldSetConfigurationUnit;


public class ProductoAdministrator extends AdministrationConfiguration<Producto> {
	
	@Override
    public EntityMetadataConfigurationUnit configuration(EntityMetadataConfigurationUnitBuilder configurationBuilder) {
        return configurationBuilder.nameField("codigo").singularName("Producto").pluralName("Productos").build();
    }
	
	
	public FieldSetConfigurationUnit listView( final FieldSetConfigurationUnitBuilder fragmentBuilder ) {
        return fragmentBuilder
        	.field( "imagen1" )
    		.field("id")
    		.field("codigo")
    		.field("descripcion")
    		.field("precio")
    		.field("stock")
            .build();
    }
	
	
	public FieldSetConfigurationUnit formView( final PersistentFieldSetConfigurationUnitBuilder fragmentBuilder ) {
        return fragmentBuilder
        		.field("id")
        		.field("codigo")
        		.field("descripcion")
        		.field("detalles").editor( wysiwyg() )
        		.field("pie").editor( textArea() )
        		.field("precio")
        		.field("stock")
        		.field("categoria")
        		.field( "imagen1" )
        		.field( "imagen2" )
        		.field( "imagenDetalle1" )
        		.field( "imagenDetalle2" )
        		.field( "imagenDetalle3" )
                .build();
    }

}
