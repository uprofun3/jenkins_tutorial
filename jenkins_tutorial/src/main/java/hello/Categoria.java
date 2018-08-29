package hello;



public class Categoria {
	
	private long id;
	private String nombre;
	private String url;
	private String icono;
	public Categoria(long id, String nombre, String url, String icono) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.url = url;
		this.icono = icono;
	}
	public long getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public String getUrl() {
		return url;
	}
	public String getIcono() {
		return icono;
	}
	
	

}
