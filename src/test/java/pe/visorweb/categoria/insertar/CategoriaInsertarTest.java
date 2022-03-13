package pe.visorweb.categoria.insertar;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
					features = "classpath:features/categorias/insertar",
					tags= "@HP or @TF"
					
				 )
public class CategoriaInsertarTest {
	
	

}//end CategoriaInsertarTest
