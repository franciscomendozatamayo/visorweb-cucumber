package pe.visorweb.pagina.categoria;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaginaMantenimientoCategoria {
	
	private By btnNuevo = By.id("btnNuevo");
	private WebDriver driver;
	
	public PaginaMantenimientoCategoria(WebDriver driver) {
		
		this.driver = driver;
		
	}//end PaginaMantenimientoCategoria
	
	public void cargarPaginaRegistrarCategoria() {
		
		this.driver.findElement(btnNuevo).click();
		
	}//end cargarPaginaRegistrarCategoria
	

}//end PaginaMantenimientoCategoria
