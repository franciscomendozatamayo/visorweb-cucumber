package pe.visorweb.categoria.insertar;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pe.visorweb.driver.Driver;
import pe.visorweb.driver.Driver.NavegadorWeb;
import pe.visorweb.pagina.categoria.PaginaRegistrarCategoria;
import pe.visorweb.pagina.login.PaginaLogin;

public class CategoriaInsertarSteps {
	
	private String url = "http://localhost:8080/VisorWeb/index.xhtml";
	private WebDriver driver;
	private PaginaLogin paginaLogin;
	private PaginaRegistrarCategoria paginaRegistrarCategoria;
	
	@Before
	public void configuracionInicial() {
		driver = Driver.getInstancia(NavegadorWeb.CHROME);
		paginaLogin = new PaginaLogin(driver);
		paginaRegistrarCategoria = new PaginaRegistrarCategoria(driver);
	}
	
	@After
	public void configuracionFinal() {
		driver.close();
	}
	
	@Given("cargo la página login del aplicativo Visor Web")
	public void cargarAplicativoVisor() {
		paginaLogin.cargarPagina(url);
	}
	
	@And("inicio sesión con el usuario {string} y la clave {string}")
	public void iniciarSesion(String usuario, String clave) {
		
		paginaLogin.iniciarSesion(usuario, clave);
	}
	
	@When("ingreso a la página registrar categoría")
	public void cargarPaginaRegistrarCategoria() throws Exception {
		
		paginaRegistrarCategoria.cargarPagina();
	}
	
	@And("escribo la categoría {string} y hago clic en el botón Guardar")
	public void registrarCategoria(String nombreCategoria) throws Exception {
		paginaRegistrarCategoria.guardar(nombreCategoria);
	}
	
	@Then("el aplicativo muestra el mensaje {string}")
	public void obtenerRespuesta(String mensajeEsperado) {
		assertEquals(mensajeEsperado, paginaRegistrarCategoria.getMensajeObtenido());
	}
	
	

}// end CategoriaInsertarSteps
