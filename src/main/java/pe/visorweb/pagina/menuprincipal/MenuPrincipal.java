package pe.visorweb.pagina.menuprincipal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pe.visorweb.pagina.categoria.PaginaMantenimientoCategoria;

public class MenuPrincipal {
	
	private By linkMenuHamburguesa = By.xpath("//div[@class=\"menu\"]/div");
	private By linkModuloAlmacen = By.xpath("//span[contains(text(), \"Mod. de Almacén\")]");
	private By linkMntCategoria = By.xpath("//a[text() = \"Mnt. de Categoría\"]");
	
	private WebDriver driver;
	
	public MenuPrincipal(WebDriver driver) {
		this.driver = driver;
	}
	
	public PaginaMantenimientoCategoria cargarPaginaMntCategoria() throws InterruptedException {
		
		Thread.sleep(1000);
		this.driver.findElement(linkMenuHamburguesa).click();
		
		Thread.sleep(1000);
		this.driver.findElement(linkModuloAlmacen).click();
		
		Thread.sleep(1000);
		this.driver.findElement(linkMntCategoria).click();
		
		return new PaginaMantenimientoCategoria(driver);
		
	}

}
