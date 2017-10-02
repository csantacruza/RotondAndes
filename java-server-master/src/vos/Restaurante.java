package vos;

import org.codehaus.jackson.annotate.JsonProperty;

public class Restaurante {
	/**
	 * Nombre del restaurante (PK)
	 */
	@JsonProperty(value= "nombre")
	private String nombre;
	/**
	 * Tipo de restaurante
	 */
	@JsonProperty(value= "tipo")
	private String tipo;
	/**
	 * Administrador del restaurante
	 */
	@JsonProperty(value= "id_administrador")
	private Integer id_administrador;
	
	public Restaurante(@JsonProperty(value= "nombre") String nombre,@JsonProperty(value= "tipo") String tipo, @JsonProperty(value= "id_administrador") Integer id_administrador){
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.id_administrador = id_administrador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Integer getId_administrador() {
		return id_administrador;
	}

	public void setId_adminsitrador(Integer id_administrador) {
		this.id_administrador = id_administrador;
	}

}
