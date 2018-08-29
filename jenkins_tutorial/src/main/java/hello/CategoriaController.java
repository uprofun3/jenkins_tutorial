package hello;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoriaController {
	@RequestMapping("/categoria")
    public List<Categoria> Listar() {
		List<Categoria> categorias= new ArrayList();
				
		Categoria c1 = new Categoria(1,"hoteles", "hoteles.html", "imagenes/hoteles.jpg");
		Categoria c2 = new Categoria(2,"restaurantes", "hoteles.html", "imagenes/grafica2.jpg");
		Categoria c3 = new Categoria(3,"tiendas", "hoteles.html", "imagenes/grafica3.jpg");
		Categoria c4 = new Categoria(4,"comidas", "hoteles.html", "imagenes/grafica4.jpg");
		Categoria c5 = new Categoria(4,"hospital", "hospital.html", "imagenes/grafica5.jpg");
        categorias.add(c1);
        categorias.add(c2);
        categorias.add(c3);
        categorias.add(c4);
        categorias.add(c5);
        
		return categorias; 
		}

}
