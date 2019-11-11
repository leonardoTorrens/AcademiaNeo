package ar.com.academia.entities;

public class Socio {
	private int id;
	private int numeroSocio;
	private String nombre, apellido;
	private String sexo;
	private String estadoCivil;
	private String nombreConyuge;
	private int cantidadHijos;
	private String dni;
	private String telefono;
	private String direccion;

	public Socio() {
		super();
	}

	public Socio(int nSocio, String nombre, String apellido, String sexo, String estadoCivil, String nombreConyuge,
			int cantidadHijos, String dni, String telefono, String direccion) {
		super();
		this.numeroSocio = nSocio;
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
		this.nombreConyuge = nombreConyuge;
		this.cantidadHijos = cantidadHijos;
		this.dni = dni;
		this.telefono = telefono;
		this.direccion = direccion;
	}

	public Socio(int idSocio, String nombre, int nSocio, String apellido, String sexo, String estadoCivil,
			String nombreConyuge, int cantidadHijos, String dni, String telefono, String direccion) {
		super();
		this.id = idSocio;
		this.numeroSocio = nSocio;
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
		this.nombreConyuge = nombreConyuge;
		this.cantidadHijos = cantidadHijos;
		this.dni = dni;
		this.telefono = telefono;
		this.direccion = direccion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getSexo() {
		return this.sexo;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getNombreConyuge() {
		return nombreConyuge;
	}

	public void setNombreConyuge(String nombreConyuge) {
		this.nombreConyuge = nombreConyuge;
	}

	public int getCantidadHijos() {
		return cantidadHijos;
	}

	public void setCantidadHijos(int cantidadHijos) {
		this.cantidadHijos = cantidadHijos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getNumeroSocio() {
		return numeroSocio;
	}

	public void setNumeroSocio(int numeroSocio) {
		this.numeroSocio = numeroSocio;
	}

}
