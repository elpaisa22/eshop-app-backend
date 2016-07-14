package org.ambar.app.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import org.lightadmin.api.config.annotation.FileReference;

@Entity
public class Producto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 603208354903742541L;

	private Long id;

	private String codigo;
	private String descripcion;
	private String detalles;
	private String pie;
	private BigDecimal precio;
	private Integer stock;
	private Categoria categoria;
	
	@FileReference(baseDirectory = "./target/classes/public")
    private String imagen1;
	
	@FileReference(baseDirectory = "./target/classes/public")
    private String imagen2;
	
	@FileReference(baseDirectory = "./target/classes/public")
    private String imagenDetalle1;
	
	@FileReference(baseDirectory = "./target/classes/public")
    private String imagenDetalle2;
	
	@FileReference(baseDirectory = "./target/classes/public")
    private String imagenDetalle3;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return this.id;
	}

	public void setId(Long pId) {
		this.id = pId;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Lob
	public String getDetalles() {
		return detalles;
	}

	public void setDetalles(String detalles) {
		this.detalles = detalles;
	}

	public String getPie() {
		return pie;
	}

	public void setPie(String pie) {
		this.pie = pie;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	@ManyToOne(optional=false) 
	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria category) {
		this.categoria = category;
	}

	public String getImagen1() {
		return imagen1;
	}

	public void setImagen1(String imagen1) {
		this.imagen1 = imagen1;
	}

	public String getImagen2() {
		return imagen2;
	}

	public void setImagen2(String imagen2) {
		this.imagen2 = imagen2;
	}

	public String getImagenDetalle1() {
		return imagenDetalle1;
	}

	public void setImagenDetalle1(String imagenDetalle1) {
		this.imagenDetalle1 = imagenDetalle1;
	}

	public String getImagenDetalle2() {
		return imagenDetalle2;
	}

	public void setImagenDetalle2(String imagenDetalle2) {
		this.imagenDetalle2 = imagenDetalle2;
	}

	public String getImagenDetalle3() {
		return imagenDetalle3;
	}

	public void setImagenDetalle3(String imagenDetalle3) {
		this.imagenDetalle3 = imagenDetalle3;
	}

}
