package pe.visorweb.pagina.categoria;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pe.visorweb.pagina.menuprincipal.MenuPrincipal;

public class PaginaRegistrarCategoria {
	
	private By txtNombre = By.id("txtNombre");
	private By btnGuardar = By.id("btnGuardar");
	private By btnVolver = By.id("btnVolver");
	private By lblMensaje = By.id("messages");
	private String mensajeObtenido;
	
	private WebDriver driver;
	private MenuPrincipal menuPrincipal;
	
	public PaginaRegistrarCategoria(WebDriver driver) {
		this.driver = driver;
		this.menuPrincipal = new MenuPrincipal(driver);
	}
	
	public void cargarPagina() throws InterruptedException {
		menuPrincipal
			.cargarPaginaMntCategoria()
			.cargarPaginaRegistrarCategoria();
	}
	
	public void guardar(String nombreCategoria) throws InterruptedException {
		this.driver.findElement(txtNombre).clear();
		this.driver.findElement(txtNombre).sendKeys(nombreCategoria);
		this.driver.findElement(btnGuardar).click();
		
		Thread.sleep(2000);
		this.mensajeObtenido = driver.findElement(lblMensaje).getText();
	}
	
	public String getMensajeObtenido() {
		return this.mensajeObtenido;
	}
	
	
	

}//end PaginaRegistrarCategoria
